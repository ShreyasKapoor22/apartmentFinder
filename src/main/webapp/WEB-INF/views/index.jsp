<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1">

		<title>Apartment Finder</title>

		<!-- Loading third party fonts -->
		<link href="http://fonts.googleapis.com/css?family=Roboto:300,400,700|" rel="stylesheet" type="text/css">
		<link href="../resources/css/fonts/font-awesome.min.css" rel="stylesheet" type="text/css">

		<!-- Loading main css file -->
		<link rel="stylesheet" href="../resources/css/style.css">

	</head>


	<body>


		<div id="site-content">
			<header class="site-header">
				<div class="container">
					<a href="index.html" id="branding">
						<img src="../resources/css/images/logo.png" alt="" class="logo">
					</a> <!-- #branding -->


					<div class="mobile-navigation"></div>
				</div>
			</header>
			<main class="main-content">
				<div class="container">
					<div class="page">
						<div class="content">
							<div class="row" id="content">

						<div class="medium-8 columns">
						<div class="left large-10 columns">

						<div class="col" style="margin-right:25%">
						     <div class="well">
						       <form action="/login" method="post" class="form-inline">
						         <p>Log in or create an account.</p>
<%--						         <div class="form-group form-space">--%>
<%--						           <input id="username" name="username" type="text" placeholder="Username"  class="form-control">--%>
<%--						         </div>--%>
<%--										 <br>--%>
<%--						         <div class="form-group form-space">--%>
<%--						           <input id="password" name="password" type="password" placeholder="Password"  class="form-control">--%>
<%--						         </div>--%>
<%--										 <br>--%>
						         <div class="form-group form-more-space">
						           <button id="log-in-btn" type="submit" formaction="/apartmentfinder/user/login" class="btn btn-default">Login</button>
						           <button id="new-account-btn" type="submit" formaction="/apartmentfinder/user/register" class="btn btn-default">Create Account</button>
						         </div>
						       </form>
						     </div>
						   </div>
						 </div>
						 </div>
							</div>
						</div>
					</div>

				</div> <!-- .container -->
			</main>
			<footer class="site-footer">
				<div class="container">
					<div class="row">




					</div> <!-- .row -->

					<div class="row">
							<br>
							<br>
							<br>
							<br>
							<br>
							<br>
						</div>
						<div class="row">
								<br>
								<br>
								<br>
								<br>

							</div>
				</div> <!-- .container -->

			</footer>
		</div>
		<!-- Default snippet for navigation -->



		<script src="../resources/js/jquery-1.11.1.min.js"></script>
		<script src="../resources/js/plugins.js"></script>
		<script src="../resources/js/app.js"></script>

	</body>

</html>
