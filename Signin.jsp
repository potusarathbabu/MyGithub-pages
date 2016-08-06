<%@include file="Header1.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
 body {
 background-image:url("resources/images/ourProducts.jpg");
 background-size: cover;

}</style>
</head>
<body>
<form action="FruitCart1"method="post">

<center>
<h1 style=color:red;">Enter login ID:<input type="text"name="txtlogin">
<h1 style=color:red;">Enter password:<input type="password"name="txtpass">
<h3><input type="submit"value="login">
<input type="reset"value="cancel"></h3>
<a href="welcome"><h1 align="left">Back</h1></a>
</center>
</form>
<%@include file="Footer.jsp" %>