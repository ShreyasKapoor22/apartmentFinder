<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Apartment Finder | Register</title>
	<link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
</head>

<body>

	<div align="center">
		<br>
		<font face="Optima" size="6px">Boulder Apartments</font><br>
		<img src="<c:url value="/resources/css/images/logo.png" />" alt="Boulder Apartments Logo" style="width:250px;height:100px;">
	</div>
	<br>
	<div class="container" align="center">
		<font face="Arial" size="5px">Register</font><br><br><br>
		<font face="Arial" size="3px">
			<form:form action="addUser" method="post" modelAttribute="user">
				<form:label path="name" class="col-md-2 control-label">Name</form:label><br>
				<div class="col-md-5">
					<form:input path="name" class="smallinput" type="text" name="name" placeholder="Enter your name" id="name" />
					<form:errors path="name" cssClass="text-warning" />
				</div>

				<br><br>

				<form:label path="userName" class="col-md-2 control-label">User Name</form:label><br>
				<div class="col-md-5">
					<form:input path="userName" class="smallinput" type="text" name="userName" placeholder="Enter User Name" id="userName" />
					<form:errors path="userName" cssClass="text-warning" />
				</div>

				<br><br>

				<form:label path="password" class="col-md-2 control-label">Password</form:label><br>
				<div class="col-md-5">
					<form:input path="password" class="smallinput" type="password" name="password" placeholder="Enter password" id="password" />
					<form:errors path="password" cssClass="text-warning" />
				</div>

				<br><br>

				<form:label path="emailAddress" class="col-md-2 control-label">Email Address</form:label><br>
				<div class="col-md-5">
					<form:input path="emailAddress" class="smallinput" type="text" name="emailAddress" placeholder="Enter valid Cu Email " id="emailAddress" />
					<form:errors path="emailAddress" cssClass="text-warning" />
				</div>

				<br><br>

				<form:label path="contactNo" class="col-md-2 control-label"> Phone number</form:label><br>
				<div class="col-md-5">
					<form:input path="contactNo" class="smallinput" type="text" name="phone" placeholder="Enter your phone number" id="phone" />
					<form:errors path="contactNo" cssClass="text-warning" />
				</div>

				<br>

				<input class="button" type="submit" value="Register" />
			</form:form>
		</font>
	</div>
</body>
</html>
