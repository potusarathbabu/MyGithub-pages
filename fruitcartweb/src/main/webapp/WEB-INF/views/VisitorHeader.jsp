<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<title>URL</title>

<nav class="navbar navbar-light" style="background-color:RoyalBlue;">

<center style="color:white"><% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
<br>
<nav class="navbar navbar-light" style="background-color:white;">

<div class="container-fluid">
	<!-- <div class="navbar-header">
		<a class="active" href="welcome">Home</a>
	</div>
 -->	<ul class="nav navbar-nav">
		<li class="active"><a href="welcome">Home</a></li>
		
		<li class="active"><a href="aboutus">About us</a></li>
		<li class="active"><a href="TermsConditions">Terms&Conditions</a></li>
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="aboutus">My categories <span
				class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><a href="welcome1">Fruits Hub</a></li>
				<li><a href="welcome1">Vegetables Hub</a></li>
				<li><a href="welcome1">Drinks hub</a></li>
				
			</ul></li>
		<li><a href="product">My Products</a></li>
		


	</ul>
	<ul class="nav navbar-nav navbar-right">
		<c:choose>
			<c:when test="${LoggedIn}">

				<li style="float: right"><a href="perform_logout"
					class="w3-hover-none"><i class="fa fa-sign-out"></i>Logout</a></li>


				<li style="float: right"><a href="#" class="w3-hover-none"><i
						class="fa fa-user"></i> Hi, ${username}</a></li>
			</c:when>
			<c:otherwise>
				<li style="float: right"><a href="signup">Sign Up</a></li>
				<li style="float: right"><a href="Signin">Sign In</a></li>
			</c:otherwise>
		</c:choose>

	</ul>

</div>
</nav>
</nav>
