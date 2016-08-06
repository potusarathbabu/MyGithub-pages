<%@include file="Header1.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    background-image: url("resources/images/signup.jpg");
    background-image:cover;
}
</style>


</head>
<body>
<body bgcolor="cyan">
<form action="FruitCart1"method="post">

<center><h2>Please fill following Details to Register</h2> 

<table>
<tr>
First name:
<input type="text"name="firstname"required/><br><br></tr>
<tr>
Last name:          
<input type="text"name="lastname"><br><br></tr>
<tr>
Father name:
<input type="text"name="fathername"required/><br><br></tr>
<tr>
Email:
<input type="text"name="Username"required/><br><br></tr>
<tr>
Password:
<input type="password" name="textpass"required/><br><br></tr>
<tr>
Date of birth:
<input type="text"name="Date of birth"required/><br><br>

<input type="radio" name="gender" value="male" checked> Male
<input type="radio" name="gender" value="female"> Female
<input type="radio" name="gender" value="other"> Other<br><br></tr>
<tr>
State:
<input type="text name="State"required/><br><br></tr>
<tr>
Country:
<input type="text name="country"required/><br><br></tr>
<tr>
Mobile:
<input type="text name="Mobile"required/><br><br>
<input type="submit" value="Submit">
<input type="reset" value="reset">
</tr>
</table>
 
<a href="welcome"><h1> align="left">Back</h1></a>

</center>
</form>
<%@include file="Footer.jsp" %>