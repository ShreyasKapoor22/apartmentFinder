<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1">

		<title>Apartment Finder</title>

		<!-- Loading third party fonts -->
		<link href="http://fonts.googleapis.com/css?family=Roboto:300,400,700|" rel="stylesheet" type="text/css">
		<link href="../resources/css/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">

		<!-- Loading main css file -->
		<link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">

	</head>


	<body>
	<div align="center">
		<br><br><br>
		<font face="Optima" size="10px">Boulder Apartments</font><br>
		<img src="<c:url value="/resources/css/images/logo.png" />" alt="Boulder Apartments Logo" style="width:500px;height:180px;">
	</div>
	<br><br><br>
	<div align="center">
		<font face="Arial" size="6px">Login or Create an Account<br><br><br>
			<div class="form-group form-more-space">
				<a type="submit" href="/apartmentfinder/user/login" class="button">Login</a>
				<br>
				<br>
				<a type="submit" href="/apartmentfinder/user/register" class="button">Create Account</a>

			</div>
		</font>
	</div>
	</body>

</html>
