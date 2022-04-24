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

<%--<body>--%>
<%--<div class="container">--%>
<%--    <h1>Login</h1>--%>

<%--    <form name="loginForm" method="post" action="/apartmentfinder/user/loginUser">--%>
<%--        Username: <input type="text" name="userName"/> <br/>--%>
<%--        Password: <input type="password" name="password"/> <br/>--%>
<%--        <input type="submit" value="Login" />--%>
<%--    </form>--%>

<%--</div>--%>

<%--</body>--%>

<body>
<div align="center">
    <br><br><br>
    <font face="Optima" size="10px">Boulder Apartments</font><br>
    <img src="<c:url value="/resources/css/images/logo.png" />" alt="Boulder Apartments Logo" style="width:500px;height:180px;">
</div>
<br><br>
<div align="center">
    <font face="Arial" size="6px">Enter your username and password</font><br><br><br>
<%--    name="loginForm" method="post" action="/apartmentfinder/user/loginUser"--%>
    <form>
        <font face="Arial" size="5px">
            <label for="uname">User Name:</label><br>
            <input type="text" id="uname" name="uname" class="input"><br><br>
            <label for="pwd">Password:</label><br>
            <input type="password" id="pwd" name="pwd" class="input"><br><br>
            <button id="log-in-btn" type="submit" formaction="/apartmentfinder/user/loginUser" class="button">Login</button><br><br>
            <!-- <button id="new-account-btn" type="submit" formaction="/apartmentfinder/user/register" class="button">Create Account</button> -->
        </font>
    </form>
    <font face="Arial" size="3px">
        <a href="https://www.google.com">Forgot Password?</a><br><br>
        <a href="https://www.google.com">
            <button type="submit" class="create_account_button">Create an account</button><br><br>
        </a>
    </font>
</div>
</body>

</html>



