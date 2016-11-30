<%@include file="VisitorHeader.jsp" %>
<html lang="en">
<head>
  <title>View Product Details</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script>document.write('<base href="' + document.location + '" />');</script>
    <link href="./resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="./resources/css/style.css" rel="stylesheet" media="screen">
    <script data-require="angular.js@1.0.x" src="http://code.angularjs.org/1.0.7/angular.min.js" data-semver="1.0.7"></script>
</head>
<style>
body{
background-color:#98A4DD;
}
</style>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-home"></span></a>
    </div>
    
  </div>
</nav>
<div>

</div>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">

    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>Id</th>
    <th>Product Name</th>
    <th>Product Price</th>
    <th>Quantity</th>
     <th>Product Image</th>
    </tr>
        <tr >
             <td>${product.id}</td>
            <td>${product.productname}</td>
            <td>${product.price}</td>
            <td>${product.quantity}</td>
            <td><img src="resources/images/${product.productname}.jpg" style=height:100px;width:200px;"/></td>
            <td><a href="myUCheck">
           <img src="resources/images/addcart.jpg" alt="literature"  style="width:200px;height:100px"></a></td>
           <td><a href="Payment">
           <img src="resources/images/buy4.png" alt="literature"  style="width:200px;height:150px"></a></td>
        </tr>    
    </table>
</div>

</body>

</html>
