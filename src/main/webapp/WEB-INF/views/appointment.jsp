<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Apartment Finder | Appointment Success</title>
    <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
</head>

<body>
    <div>
        <font face="Arial" size="5px">
            <p>Welcome ${userDetails.name}</p>
        </font>
        <font face="Arial" size="3px">

            <a class="btn btn-danger" href="/apartmentfinder/appointment/manage/${userData.userId}">Manage appointments</a>
        </font>
    </div>

    <div class="container" align="center">
        <h1>Book your appointments</h1>
        <hr/>
        <!--<div>
            <font face="Arial" size="5px">
                <p>Welcome ${userDetails.name}</p>
            </font>
        </div>-->
        <div align="center">
            <br><br><br>
            <font face="Optima" size="10px">Boulder Apartments</font><br>
            <img src="<c:url value="/resources/css/images/logo.png" />" alt="Boulder Apartments Logo" style="width:500px;height:180px;">
        </div>

        <div>
            <font face="Arial" size="5px">
            <p>Book appointment for  ${apartmentDetails.name}</p>
            </font>
        </div>

        <form:form name="appointmentForm" cssClass="form-horizontal" method="post" action="/apartmentfinder/appointment/book/${apartmentDetails.apartmentId}/${userDetails.userId}">
        <div class="col-md-7">
            Date: <input class="fa fa-calendar" type="date" id ="appointmentDate" placeholder="MM/DD/YYYY" name="appointmentDate"/>
        </div>
        <br/>
            <div class="col-md-7">
            Time: <select name="appointmentTime" id="appointmentTime">
            <option value ="08:00-10:00">08:00-10:00</option>
            <option value ="10:00-12:00">10:00-12:00</option>
            <option value ="10:00-12:00">10:00-12:00</option>
            <option value ="15:00-17:00">15:00-17:00</option>
            <option value ="17:00-19:00">17:00-19:00</option>
            <option value ="19:00-21:00">19:00-21:00</option>
        </select>
        </div>
            <br>
            <br>
            <input class="button" type="submit" value="submit" />


            <!--<input class="btn btn-success" type="submit" value="Submit" />-->


        </form:form>

    </div>

</body>


</html>

<script>
    $(document).ready(
        function() {
            var date_input = $('input[name="eventDate"]'); //our date input has the name "date"
            var container = $('.bootstrap-iso form').length > 0 ? $(
                '.bootstrap-iso form').parent() : "body";
            date_input.datepicker({
                format : 'mm/dd/yyyy',
                container : container,
                orientation: "right top",
                todayHighlight : true,
                autoclose : true
            })
        });

</script>
