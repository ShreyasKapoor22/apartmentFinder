<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Apartment Finder | Manage Appointment</title>
    <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
</head>
    <body>
        <div>
            <font face="Arial" size="5px">
                <p>Welcome ${userDetails.name}</p>
            </font>
            <font face="Arial" size="3px">
                <a href="/apartmentfinder/user/editProfile/${userDetails.userId}">Edit Profile</a>
            </font>
        </div>
        <div class="container" align="center">
            <div align="center">
                <font face="Optima" size="6px">Boulder Apartments</font><br>
                <img src="<c:url value="/resources/css/images/logo.png" />" alt="Boulder Apartments Logo" style="width:380px;height:150px;">
            </div>
            <br>
            <font face="Arial" size="5px">List of Appointments</font><br><br><br>

            <div style="overflow-x: auto;">
                <table class="table">

                    <tr>
                        <th>Apartment Name</th>
                        <th>Address</th>
                        <th>Appointment Date</th>
                        <th>Appointment Time</th>
                        <th></th>
                        <th></th>
                    </tr>

                    <!-- loop over and print our customers -->
                    <c:forEach var="appointment" items="${appointmentDetails}">
                        <tr>
                            <td>${appointment.apartmentName}</td>
                            <td>${appointment.apartmentAddress}</td>
                            <td>${appointment.appointmentDate}</td>
                            <td>${appointment.appointmentTime}</td>

                            <td>
                                <a href="/apartmentfinder/appointment/cancel/${appointment.appointmentId}/${appointment.userId}" >Cancel appointment</a>
                            </td>

                            <td>
                                <a href="/apartmentfinder/review/addReview/${appointment.apartmentId}/${appointment.userId}" >Submit Review</a>
                            </td>
                        </tr>
                    </c:forEach>

                </table>

            </div>

        </div>

    </body>
</html>

