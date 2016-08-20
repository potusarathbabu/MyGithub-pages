<%@include file="AdminHeader.jsp" %>

<head>

<meta name="viewport" content="width=device-width, initial scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Category Page</title>

<style>
body {
    background-color:red;
}
</style>
</head>
<body>

<center> <h1 style="color:black"> SUPER MARKET CATEGORY DETAILS</h1></center><hr>


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
<h1 style="color:white"><u> Manage Category</u></h1><br>
<form action="mycategory" method="post">

<table>
<tr>
<td>
<h3 style="color:white"> Category Name: </td>
<td> <input type="text" name="categoryname"></td>
</tr>


<tr>
<td>
<h3 style="color:white">Category Description :</td> 
<td> <input type="text" name="description"></td>
</tr>

</table>


<tr>
<td>
<h4 style="color:blue"><input type="SUBMIT" value="submit">

 <input type="reset" value="Cancel"> </h4>

</td>
</tr>
<h2 style="color:white"> <a href="Adminlogin"><h1 align="left">Back</a>
</form>
<br><br><br><br>

<%@include file="Footer.jsp" %>