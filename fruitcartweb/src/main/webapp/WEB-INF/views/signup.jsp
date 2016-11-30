<%@include file="VisitorHeader.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/jquery-1.9.1.mini.js"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


    <script type="text/javascript" src="resources/bootstrap/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
    

    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
<style>
body {
    background-color:#E2F6FE ;
}
</style>
</head>
<body>
	
<center> <h1 style="color:RoyalBlue"> WELCOME TO SUPER MARKET </h1></center><hr>

<center> <h2 style="color:RoyalBlue"> Fill THE DETAILS </h2></center><hr>

<center> 
      
      <form:form action="register" commandName="user" method="POST">
<br><br>
<table>
<tr>
<td><h2><font color="RoyalBlue">First Name : </td>
<td><form:input path="firstname" /><form:errors path="firstname" style="color:RoyalBlue"></form:errors></td>
</tr>
<tr>
<td><h2><font color="RoyalBlue">Last Name : </td>
<td><form:input path="lastname" /><form:errors path="lastname" style="color:RoyalBlue"></form:errors></td>
</tr>
<tr>
<td><h2><font color="RoyalBlue">User Name : </td>
<td><form:input path="username" /><form:errors path="username" style="color:RoyalBlue"></form:errors></td>
</tr>
<tr>
<td><h2><font color="RoyalBlue">Password : </td>
<td><form:input path="password" type="password"/><form:errors path="password" style="color:RoyalBlue"></form:errors></td>
</tr>
</tr>
<tr>
<td><h2><font color="RoyalBlue">Confirm Password : </td>
<td><form:input path="confirmpassword" type="password"/><form:errors path="confirmpassword" style="color:RoyalBlue"></form:errors></td>
</tr>

<tr>
<td><h2><font color="RoyalBlue">Mobile Number :</td>
<td><form:input path="mobilenumber"/><form:errors path="mobilenumber" style="color:RoyalBlue"></form:errors></td></tr>
</table>
<tr colspan="2">
<td><input type="submit" value="Register"></td>
<td><input type="reset" value="Reset"></td>
</tr>
<a href="Signin"><h1 align="center"><h2><font color="RoyalBlue">Sign In Here</a></center>
</center>
</form:form>
<br><br>
      

      
<%@include file="Footer.jsp" %>