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
			 $http.post('/authenticate', userData)
	            .success(function (data, status, headers, config) {
					callback(status,data);
            })
            .error(function (data, status, header, config) {
				callback(status,data);
            });

		}
	}
})();