<%--
  Created by IntelliJ IDEA.
  User: shreyaskapoor
  Date: 4/11/22
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Apartment Finder | Edit Profile</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />"
          rel="stylesheet">

</head>

<body>
<div class="container">
    <h1>Update Profile</h1>

    <form:form action="/apartmentfinder/user/updateUserDetails" cssClass="form-horizontal" method="post" modelAttribute="userDetails">

        <fieldset class="form-group">
            <form:label path="name" class="col-md-2 control-label">Name: </form:label>
            <div class="col-md-5">
                <form:input path="name" class="form-control" type="text"
                            name="name" placeholder="name" id="name" />
                <form:errors path="name" cssClass="text-warning" />
            </div>
        </fieldset>

        <fieldset class="form-group">
            <form:label path="password" class="col-md-2 control-label">Password: </form:label>
            <div class="col-md-5">
                <form:input path="password" class="form-control" type="password"
                            name="password" placeholder="${userDetails.password}" id="password" />
                <form:errors path="password" cssClass="text-warning" />
            </div>
        </fieldset>

        <fieldset class="form-group">
            <form:label path="emailAddress" class="col-md-2 control-label">Email Address: </form:label>
            <div class="col-md-5">
                <form:input path="emailAddress" class="form-control" type="text"
                            name="emailAddress" placeholder="${userDetails.emailAddress}" id="emailAddress" />
                <form:errors path="emailAddress" cssClass="text-warning" />
            </div>
        </fieldset>


        <fieldset class="form-group">
            <form:label path="contactNo" class="col-md-2 control-label"> Phone number: </form:label>
            <div class="col-md-5">
                <form:input path="contactNo" class="form-control" type="text"
                            name="phone" placeholder="${userDetails.contactNo}" id="phone" />
                <form:errors path="contactNo" cssClass="text-warning" />
            </div>
        </fieldset>
        <fieldset class="form-group">
            <div class="col-md-5">
                <form:hidden path="userId"  id="userId" />
            </div>
        </fieldset>
        <fieldset class="form-group">
            <div class="col-md-5">
                <form:hidden path="userName"  id="userName" />
            </div>
        </fieldset>




        <input class="btn btn-success" type="submit" value="Update" />
    </form:form>

</div>
</body>
</html>

