/**
 * 
 */
(function() {
	'use strict';

	angular.module('myApp').controller('LoginController',LoginController);

	LoginController.$inject = [ '$state', 'AuthenticationService','toaster'];
	function LoginController($state,AuthenticationService,toaster) {
		
		var vm = this;
		
		vm.emailFormat = /^[a-z]+[a-z0-9._]+@[a-z]+\.[a-z.]{2,5}$/;

		vm.login = login;

		function login() {
			vm.dataLoading = true;
			
			var userData={};
			
			userData.userName=vm.username;
			userData.password=vm.password;
			
			AuthenticationService.Login(userData, function(authenticationResult) {

				if(authenticationResult===401){
					toaster.pop('error', "", "Username and/or password are invalid ! Verify your user name, and then type your password again.");
				}else{
					toaster.pop('Success', "", "User logged in successfully.");
		            $state.go('attendance');
				}
	            vm.dataLoading = false;
	        });

		};
	}

})();
