<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html ng-app="LoginModule" ng-controller="LoginController as ctrl">

    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
        <!-- jQuery library -->
        <script src="js/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/angular.js"></script>
        <script src="js/controllers/LoginController.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome to Ravi Ede Inc.</title>
    </head>

    <body>
        <h2>Login</h2>
        <div>
            <p>
                <form method="post" action="welcome">
                    <input type="text" name="username" />
                    <br>
                    <input type="password" name="password" /> </p>
            <p>
                <input type="submit" name="Submit" ng-click="ctrl.loginOperation() " /> </form>
            </p>
        </div>
    </body>

    </html>
