<%--
  Created by IntelliJ IDEA.
  User: shreyaskapoor
  Date: 4/10/22
  Time: 10:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <hr/>
</div>
    <div class="container">
        <div class="col-md-offset-1 col-md-10">
            <h3 align="center" >List of Apartments</h3>
            <hr />
            <div>
                <font face="Arial" size="3px">
                    <p>Welcome ${userData.name}</p>
                </font>
            </div>
            <div>
                <a class="btn btn-danger" href="/apartmentfinder/user/editProfile/${userData.userId}">Edit Profile</a>
            </div>
            <div>
                <a class="btn btn-danger" href="/apartmentfinder/appointment/manage/${userData.userId}">Manage appointments</a>
            </div>

            <div class="panel panel-info">
                <div class="panel-heading">
                    <div class="panel-title">Apartment List</div>
                </div>
                <div class="panel-body">
                    <table class="table">
                        <tr>
                            <th>Name</th>
                            <th>Rent</th>
                            <th>Bedroom</th>
                            <th>Bathroom</th>
                            <th>Address</th>
                            <th>Area</th>
                            <th>Images</th>
                            <th>Rating</th>
                        </tr>

                        <!-- loop over and print our customers -->
                        <c:forEach var="apartment" items="${apartmentList}">

                            <tr>
                                <td>${apartment.name}</td>
                                <td>${apartment.rent}</td>
                                <td>${apartment.bedroom}</td>
                                <td>${apartment.bathroom}</td>
                                <td>${apartment.address}</td>
                                <td>${apartment.area}</td>
                                <td><img src="${apartment.images}" height="300px"></td>
                                <td>${apartment.rating}/5</td>

                                <td>
                                    <a type="submit" href="/apartmentfinder/appointment/${apartment.apartmentId}/${userData.userId}" class="button">Book an appointment</a>

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
