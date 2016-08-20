
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header</title>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="welcome">Visitors Home</a>
      <a class="navbar-brand" href="FruitCart1">User Home</a>
      <a class="navbar-brand" href="Adminlogin">Admin Home</a>
      <a class="navbar-brand" href="TermsConditions">Terms&Conditions </a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="aboutus"></a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="aboutus">My categories <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="ManageCategory">Category</a></li>
          <li><a href="ManageProduct">Product</a></li>
          <li><a href="ManageSupplier">Supplier</a></li>
        </ul>
      </li>
      <li><a href="product">My Products</a></li>
   
    </ul>
       <ul class="nav navbar-nav navbar-right">
  		
      <li><a href="Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
     >
    </ul>
   
  </div>
</nav>

