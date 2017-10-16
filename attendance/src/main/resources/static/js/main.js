console.log("Running...");
var app = angular.module('myApp', ['ngMaterial'])
 .config(function($mdThemingProvider) {
     $mdThemingProvider
        .theme('default')
        .primaryPalette('cyan',{
            'default':'800'
        })
        .backgroundPalette('blue-grey',{
            'default':'50',
            'hue-1':'800',
            'hue-2':'900',
        })
});

app.controller('AppCtrl', function($scope, $http, $mdToast, $mdSidenav){

    console.log('controller initialized');
    $scope.submitStatus = "";
    $scope.presentStudents = [];

    $scope.toggleSidenav = function() {
        $mdSidenav('left').toggle();
    };

    var selectedClass;
    var filePath;
    var getFilePath = function(index){
        selectedClass = $scope.teacherClasses[index].classID;
        filePath = "appData/" + selectedClass+ ".json"
        return filePath;
    }
    
    $http.get("/staticData/teacher/1").success(function (data) {
        console.log("Teacher data Received");
        $scope.teacher=data;
        
        $http.post("/staticData/teacher/course", $scope.teacher)
        .then(function(result){
        	 console.log("Teacher Courses Received");
             $scope.teachersInfo = result.data;
        });
    });
    
    

    $scope.togglePresent = function (student) {
    	
    	var presentStudent={};
    	
    	presentStudent.teacher=$scope.teacher;
    	presentStudent.course=$scope.activeCourse;
    	presentStudent.student=student;
    	presentStudent.isPresent=true;
    	$scope.presentStudents.push(presentStudent);
    	if($scope.students.length==$scope.presentStudents.length){
            $scope.selectDisabled = true;
        }
    	console.log($scope.presentStudents);

        /*if(student.present==false){
            console.log(this.$index);
            $scope.presentStudents.push(this.$index);
            console.log($scope.presentStudents);
            if($scope.students.length==$scope.presentStudents.length){
                $scope.selectDisabled = true;
            }
        }
        else {
            console.log(this.$index);
            var clickIndex = $scope.presentStudents.indexOf(this.$index);
            $scope.presentStudents.splice(clickIndex, 1);
            console.log($scope.presentStudents);
            $scope.selectDisabled = false;
        }
        student.present = ! student.present;*/
    }

    $scope.selectAll = function(){
        for(i=0; i<$scope.students.length; i++){
            if($scope.presentStudents.indexOf(i)== -1){
                $scope.students[i].present = true;
                $scope.presentStudents.push(i);
            }
        }
        $scope.selectDisabled = true;
        console.log($scope.selectDisabled);
    };

    $scope.submit = function(){
        $scope.submitStatus = "query";
        $http.post('/attendance', $scope.presentStudents)
            .then(function(data){
                $scope.submitStatus = "indeterminate"
            });
    }

   $scope.selectClass = function(division){
        $mdSidenav('left').toggle();
        $scope.activeCourse = division.course;
        $http.post("/staticData/students",division.classes)
          .then(function (data) {
            console.log("Students data received...");
            $scope.students = data.data;
            $scope.presentStudents = [];
        });
    }

    $scope.showActionToast = function(taskClicked) {
        console.log(taskClicked.completed);
        taskClicked.completed = !taskClicked.completed;
        $scope.hideTask = true;
        console.log(taskClicked.completed);
        if(taskClicked.completed == false){
            var taskStatus = "incomplete"
        }
        else{
            var taskStatus = "completed"
        }
        var toast = $mdToast.simple()
            .content("You marked "+taskClicked.name+" as "+taskStatus)
            .action('Undo')
            .highlightAction(false)
            .hideDelay(10000)
            .position("bottom right");
        $mdToast.show(toast).then(function(response) {
        if ( response == 'ok' ) {
            taskClicked.completed = !taskClicked.completed;
        }
        });
    };
});
