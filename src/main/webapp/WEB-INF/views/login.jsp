<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
</head>

<body>
<div align="center">
    <br><br><br>
    <font face="Optima" size="10px">Boulder Apartments</font><br>
    <img src="<c:url value="/resources/css/images/logo.png" />" alt="Boulder Apartments Logo" style="width:500px;height:180px;">
</div>
<br><br>
<div align="center">
    <font face="Arial" size="6px">Enter your username and password</font><br><br><br>
    <form name="loginForm" method="post" action="/apartmentfinder/user/loginUser">
        <font face="Arial" size="5px">
            <label for="userName">User Name:</label><br>
            <input type="text" id="userName" name="userName" class="input"><br><br>
            <label for="password">Password:</label><br>
            <input type="password" id="password" name="password" class="input"><br><br>
            <input type="submit" value="Login" class="button"/>
<%--            <button id="log-in-btn" type="submit" formaction="/apartmentfinder/user/loginUser" class="button">Login</button><br><br>--%>
            <!-- <button id="new-account-btn" type="submit" formaction="/apartmentfinder/user/register" class="button">Create Account</button> -->
        </font>
    </form>
    <font face="Arial" size="3px">
<%--        <a href="https://www.google.com">Forgot Password?</a><br><br>--%>
        <br><br>
        <a href="/apartmentfinder/user/register">
            <button type="submit" class="create_account_button">Create an account</button><br><br>
        </a>
    </font>
</div>
</body>

</html>