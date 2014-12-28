<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>

<html ng-app>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<s:form action="sendMail">
<body>

<script src="./JS/angular.min.js" ></script>
<script>
  angular.module('emailExample', [])
    .controller('ExampleController', ['$scope', function($scope) {
      $scope.text = 'me@example.com';
    }]);
  
  
</script>
<h1>Send Email</h1>
 <!--  Email: <input type="email" name="username" ng-model="text" required>
    <span class="error" ng-show="sendMail.username.$error.required">
      Required!</span>
    <span class="error" ng-show="sendMail.username.$error.email">
      Not valid email!</span>
        <tt>text = {{text}}</tt><br/>
      
       -->
<s:textfield name="emailId" label="emailId" />
		<s:textarea label="" name="content" cols="40" rows="10"/>
		<s:submit  />
	</s:form>
</body>
</html>