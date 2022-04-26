<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Apartment Finder | Edit Profile</title>
    <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
</head>

<body>

    <div align="center">
        <br>
        <font face="Optima" size="7px">Boulder Apartments</font><br>
        <img src="<c:url value="/resources/css/images/logo.png" />" alt="Boulder Apartments Logo" style="width:380px;height:150px;">
    </div>
    <br>
    <div class="container" align="center">
        <font face="Arial" size="5px">Edit Profile</font><br><br><br>
        <font face="Arial" size="3px">
            <form:form action="/apartmentfinder/user/updateUserDetails" cssClass="form-horizontal" method="post" modelAttribute="userDetails">

                <form:label path="name" class="col-md-2 control-label">Name: </form:label><br>
                <div class="col-md-5">
                    <form:input path="name" class="smallinput" type="text" name="name" placeholder="name" id="name" />
                    <form:errors path="name" cssClass="text-warning" />
                </div>

                <br><br>

                <form:label path="password" class="col-md-2 control-label">Password: </form:label><br>
                <div class="col-md-5">
                    <form:input path="password" class="smallinput" type="password" name="password" placeholder="${userDetails.password}" id="password" />
                    <form:errors path="password" cssClass="text-warning" />
                </div>

                <br><br>

                <form:label path="emailAddress" class="col-md-2 control-label">Email Address: </form:label><br>
                <div class="col-md-5">
                    <form:input path="emailAddress" class="smallinput" type="text" name="emailAddress" placeholder="${userDetails.emailAddress}" id="emailAddress" />
                    <form:errors path="emailAddress" cssClass="text-warning" />
                </div>

                <br><br>

                <form:label path="contactNo" class="col-md-2 control-label"> Phone number: </form:label><br>
                <div class="col-md-5">
                    <form:input path="contactNo" class="smallinput" type="text" name="phone" placeholder="${userDetails.contactNo}" id="phone" />
                    <form:errors path="contactNo" cssClass="text-warning" />
                </div>

                <div class="col-md-5">
                    <form:hidden path="userId"  id="userId" />
                </div>

                <div class="col-md-5">
                    <form:hidden path="userName"  id="userName" />
                </div>

                <br>

                <input class="button" type="submit" value="Update" />
            </form:form>
        </font>

    </div>
</body>
</html>

