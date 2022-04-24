<%--
  Created by IntelliJ IDEA.
  User: shreyaskapoor
  Date: 4/18/22
  Time: 12:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
    <title>Login</title>
    <link href="<c:url value="/resources/css/old_style.css" />" rel="stylesheet">
</head>

<body>
<div class="container">
    <h1>Book and appointment</h1>
    <div>
        <p>Welcome ${userDetails.name}</p>
    </div>
    <div>
        <p>Book appointment for  ${apartmentDetails.name}</p>
    </div>

    <form:form name="appointmentForm" cssClass="form-horizontal" method="post" action="/apartmentfinder/appointment/book/${apartmentDetails.apartmentId}/${userDetails.userId}">

        Date: <input class="fa fa-calendar" type="date" id ="appointmentDate" placeholder="MM/DD/YYYY" name="appointmentDate"/> <br/>
        Time: <select name="appointmentTime" id="appointmentTime">
        <option value ="08:00-10:00">08:00-10:00</option>
        <option value ="10:00-12:00">10:00-12:00</option>
        <option value ="10:00-12:00">10:00-12:00</option>
        <option value ="15:00-17:00">15:00-17:00</option>
        <option value ="17:00-19:00">17:00-19:00</option>
        <option value ="19:00-21:00">19:00-21:00</option>
    </select>

        <input class="btn btn-success" type="submit" value="Submit" />


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
