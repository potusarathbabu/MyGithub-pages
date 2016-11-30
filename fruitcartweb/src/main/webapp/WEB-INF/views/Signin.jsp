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
    background-color:#E4F7FC ;
}
</style>
</head>
<body>

<center> <h1 style="color:RoyalBlue"> WELCOME TO SUPER MARKET </h1></center><hr>


<form action="perform_login" method="post">

<br><br>

<center>
<h1 style="color:RoyalBlue"><u> LOGIN HERE</u></h1><br>

<table>
<tr>
<td>
<h2 style=color:RoyalBlue">Enter User Name:</td> <td><input type="text"name="username"></td></tr>
<tr>
<td>
<h2 style=color:RoyalBlue">Enter Password:</td> <td><input type="password"name="password"></td></tr>
</table>

<input type="submit"value="login">
<input type="reset"value="cancel"><br><br>
<a href="signup"><h1 align="center"><h2><font color="RoyalBlue">Sign Up Here</a></center>
<a href="welcome"><h1 align="left"><h2><font color="RoyalBlue">Back</h1></a>

</form>
<br><br>
<%@include file="Footer.jsp" %>