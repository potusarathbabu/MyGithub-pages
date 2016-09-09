<%@include file="VisitorHeader.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books Categories</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<style>
body {
    background-color: LightGray;
}
h1 {
    color: red;
    text-align: center;
}
h5 {
    color:darkgreen;
    text-align: center;
    }
p {
    font-family: regular;
    font-size: 10px;
    text-align: center;
}
 .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      height:300pt;
      margin: auto;
  }
</style>
</head>
<body>

<h1><i><u>SUPER MARKET</u></i></h1>
<p><h5>The Best Offers Provide For Customers</h5></p>
<hr>
<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
       <img src="resources/images/theme.jpg" width="360" height="100" border="5">
      </div>
	 <div class="item">
      
        <img src="resources/images/mix1.jpg" width="360" height="100" border="5">
      </div>

      <div class="item">
        <img src="resources/images/mix2.jpg"  width="360" height="100" border="5">
      </div>
    
      <div class="item">
        <img src="resources/images/mix3.jpg"  width="360" height="100" border="5">
      </div>

      <div class="item">
        <img src="resources/images/mix4.jpg"  width="300" height="100" border="5">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div><br>
<div class="container">
    <div class="row">
    <div class="col-md-4">
      <p><h5>Categories</h5></p>
        <a href="Categories" class="thumbnail">
         <img src="resources/images/1.jpg" alt="Friuts" style="width:400px;height:150px">
     </a>    
</div>

    <div class="col-md-4">
    <p><h5>TODAY SPECIALS OFFERS</h5></p>
      <a href="SpecialOffer" class="thumbnail">
  <img src="resources/images/all2.jpg" alt="Apples" style="width:500px;height:150px">
       
      </a>
       
    </div>
    <div class="col-md-4">
    <p><h5>PRICES</h5></p>
    <a href="Prices" class="thumbnail">
      
        <img src="resources/images/prices.jpg" alt="2 kg Orange=RS.100" style="width:500px;height:150px">
       
      </a>
    </div>
     <div class="col-md-4">
    <p><h5>MyCart</h5></p>
    <a href="MyCart" class="thumbnail">
      
        <img src="resources/images/addcart.jpg" alt="2 kg Orange=RS.100" style="width:500px;height:150px">
       
      </a>
    </div>
  </div>
</div>


<%@include file="Footer.jsp" %>