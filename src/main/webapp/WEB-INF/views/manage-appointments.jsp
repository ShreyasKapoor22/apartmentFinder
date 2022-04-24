<%--
  Created by IntelliJ IDEA.
  User: shreyaskapoor
  Date: 4/18/22
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Apartment List</title>
    <link href="<c:url value="/resources/css/old_style.css" />" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="col-md-offset-1 col-md-10">
        <h2>List of Appointments</h2>
        <hr />
        <div>
            <p>Welcome ${userDetails.name}</p>
        </div>
        <div>
            <a class="btn btn-danger" href="/apartmentfinder/user/editProfile/${userDetails.userId}">Edit Profile</a>
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Appointment List</div>
            </div>
            <div class="panel-body">
                <table class="table table-striped table-bordered">
                    <tr>
                        <th>Apartment Name</th>
                        <th>Address</th>
                        <th>Appointment Date</th>
                        <th>Appointment Time</th>
                    </tr>

                    <!-- loop over and print our customers -->
                    <c:forEach var="appointment" items="${appointmentDetails}">
                            <tr>
                                <td>${appointment.apartmentName}</td>
                                <td>${appointment.apartmentAddress}</td>
                                <td>${appointment.appointmentDate}</td>
                                <td>${appointment.appointmentTime}</td>

                                <td>
                                    <a type="submit" href="/apartmentfinder/appointment/cancel/${appointment.appointmentId}/${appointment.userId}" class="button">Cancel appointment</a>
                                </td>

                                <td>
                                    <a type="submit" href="/apartmentfinder/review/addReview/${appointment.apartmentId}/${appointment.userId}" class="button">Submit Review</a>
                                </td>

                            </tr>

                    </c:forEach>

                </table>

            </div>
        </div>
    </div>

</div>

</body>
</html>

