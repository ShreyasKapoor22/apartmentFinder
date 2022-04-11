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
    <title>Title</title>
    <link href="<c:url value="../resources/css/style.css" />"
          rel="stylesheet">
    <script src="<c:url value="../resources/js/jquery-1.11.1.min.js" />"></script>
</head>
<body>
<div class="container">
    <div class="col-md-offset-1 col-md-10">
        <h2>List of Apartments</h2>
        <hr />

        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Apartment List</div>
            </div>
            <div class="panel-body">
                <table class="table table-striped table-bordered">
                    <tr>
                        <th>Name</th>
                        <th>Rent</th>
                        <th>Bedroom</th>
                        <th>Bathroom</th>
                        <th>Address</th>
                        <th>Area</th>
                        <th>Images</th>
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
                            <td>${apartment.images}</td>

                            <td>
                                <!-- display the update link --> <a href="">Book an Appointment</a>
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
