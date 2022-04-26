<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <head>
        <meta charset="ISO-8859-1">
        <title>Apartment Finder | Add Review</title>
        <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
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
