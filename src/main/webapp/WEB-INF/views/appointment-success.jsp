<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Apartment Finder | Appointment Success</title>
    <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">

</head>


<body>
<div align="center">
    <br>
    <font face="Optima" size="4px">Boulder Apartments</font><br>
    <img src="<c:url value="/resources/css/images/logo.png" />" alt="Boulder Apartments Logo" style="width:300px;height:150px;">
   <!-- <img src="<c:url value="/resources/css/images/logo.png" />" alt="Boulder Apartments Logo" width="150px" height="150px"/>-->
    <hr/>

</div>
    <hr/>
    <div align="left">
        <a class="btn btn-danger" href="/apartmentfinder/appointment/manage/${userData.userId}">Manage appointments</a>
    </div>
    <div class="container" align="center">
<br/><br/><br/><br/>
        <div class="row col-md-10 col-md-offset-3">
            <div class="card card-body">
                <h1>Your Appointment is Successfully booked</h1>
                <br/>
                <h4>Thank you </h4>
            </div>
        </div>
    </div>
</body>
</html>