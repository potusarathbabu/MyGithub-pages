<%@include file="AdminHeader.jsp" %>

<head>

<meta name="viewport" content="width=device-width, initial scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Supplier Page</title>

<style>
body {
    background-color:red;
}
</style>
</head>
<body>

<center> <h1 style="color:white"> SUPER MARKET SUPPLIER DETAILS </h1></center><hr>


<nav class="navbar navbar-default">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="#">SUPER MARKET</a>
</div>
<ul class="nav navbar-nav">
<li class="item active"> <a =href="#"> HOME</a></li>

</ul>
</div>
</nav>

<div class="container">
<br><br>

<center>
<h1 style="color:white"><u> Manage Supplier</u></h1><br>
<form action="mysupplier" method="post">


<table>
<tr>
<td>
<h3 style="color:white">Supplier Name : </td>
<td> <input type="text" name="suppliername"></td>
</tr>


<tr>
<td>
<h3 style="color:white">Quantity :</td>
<td> <input type="text" name="quantity"></td>
</tr>



<tr>
<td>
<h3 style="color:white">Mobile Number :</td>
 <td> <input type="text" name="mobilenumber"></td>
</tr>

<tr>
<td>
<h3 style="color:white">Email :</td>
 <td> <input type="text" name="email"></td>
</tr>

</table>

<tr>
<td>
<h4 style="color:blue"><input type="submit" value="SUBMIT">

<input type="reset" value="Cancel"></h4>

</td>
</tr>

</form>
 <a href="Adminlogin"><h1 align="left"><h2 style="color:white">Back</a>
<br><br>


<%@include file="Footer.jsp" %>