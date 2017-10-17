/**
 * 
 */
(function() {
	'use strict';

	angular.module('myApp').factory('AuthenticationService',AuthenticationService);

	AuthenticationService.$inject = [ '$http', '$log'];

	function AuthenticationService($http, $log) {
		
		var service = {};
		
		$log.debug("Authentication service initialised....");

		service.Login = Login;
		
		return service;
		
		function Login(userData, callback) {

			/*
			 * Ajax call to ivoke REST API
			 * ----------------------------------------------
			 */		
			 $http.post('/teacher/authenticate', userData)
	            .success(function (data, status, headers, config) {
	            	$log.debug(status);
					callback(status);
            })
            .error(function (data, status, header, config) {
            	$log.debug(status);
				callback(status);
            });

		}
	}
})();