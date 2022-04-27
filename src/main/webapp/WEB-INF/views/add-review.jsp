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
    <div align="center">
        <br><br><br>
        <font face="Optima" size="8px">Boulder Apartments</font><br>
        <img src="<c:url value="/resources/css/images/logo.png" />" alt="Boulder Apartments Logo" style="width:500px;height:180px;">
    </div>
    <hr/>
    <div class="container" align="center">
        <h1>Give your review for ${apartmentDetails.name}</h1>

        <form name="loginForm" method="post" action="/apartmentfinder/review/add/${apartmentDetails.apartmentId}/${userDetails.userId}">
           <!-- Review: <input type="text" name="review" class="col-15"/>-->
            <textarea rows = "5" cols = "60" name = "description">
            Give your review...
         </textarea>
            <br/>
            <br/>
            <input class="button" type="submit" value="submit" />
           <!-- <input type="submit" value="Submit" />-->
        </form>

    </div>

</body>
</html>
