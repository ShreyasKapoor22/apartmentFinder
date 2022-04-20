<%--
  Created by IntelliJ IDEA.
  User: shreyaskapoor
  Date: 4/19/22
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <head>
        <title>Add review</title>
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
    </head>
</head>
<body>

<div class="container">
    <h1>Add review for ${apartmentDetails.name}</h1>

    <form name="loginForm" method="post" action="/apartmentfinder/review/add/${apartmentDetails.apartmentId}/${userDetails.userId}">
        Review: <input type="text" name="review" class="col-12"/>
        <br/>
        <input type="submit" value="Submit" />
    </form>

</div>

</body>
</html>
