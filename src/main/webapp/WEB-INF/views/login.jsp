<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
    <title>Login</title>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>

<body>
<div class="container">
    <h1>Login</h1>

    <form name="loginForm" method="post" action="/apartmentfinder/user/loginUser">
        Username: <input type="text" name="userName"/> <br/>
        Password: <input type="password" name="password"/> <br/>
        <input type="submit" value="Login" />
    </form>

</div>

</body>


</html>



