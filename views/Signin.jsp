<%@include file="VisitorHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
body {
    background-color:LightSalmon ;
}
</style>
</head>
<body>
<center> <h1 style="color:white"> WELCOME TO SUPER MARKET </h1></center><hr>


<form action="<c:url value="j_spring_security_check" />" method="post">

<br><br>

<center>
<h1 style="color:white"><u> LOGIN HERE</u></h1><br>

<table>
<tr>
<td>
<h2 style=color:white">Enter User Name:</td> <td><input type="text"name="j_username"></td></tr>
<tr>
<td>
<h2 style=color:white">Enter Password:</td> <td><input type="password"name="j_password"></td></tr>
</table>

<input type="submit"value="login">
<input type="reset"value="cancel"><br><br>
<a href="signup"><h1 align="center"><h2><font color="white">Sign Up Here</a></center>
<a href="welcome"><h1 align="left"><h2><font color="white">Back</h1></a>

</form>
<br><br>
<%@include file="Footer.jsp" %>