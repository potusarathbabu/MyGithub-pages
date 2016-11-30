<%@include file="VisitorHeader.jsp"%>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Books Categories</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<style>
body {
	background-color: LightGray;
}

h1 {
	color: red;
	text-align: center;
}

h5 {
	color: darkgreen;
	text-align: center;
}

p {
	font-family: regular;
	font-size: 10px;
	text-align: center;
}

.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 70%;
	height: 300pt;
	margin: auto;
}
</style>
</head>
<body>

	

	<center><div class="container">

		<div class="col-md-14">
			<a href="welcome1" class="thumbnail"> <img
				src="resources/images/welcome3.gif" alt="literature"
				style="width: 1000px; height: 100px">
				<center>
					<h1>
		<i><u>SUPER MARKET</u></i>
	</h1>
	<p>
	<h5>The Best Offers Provide For Customers</h5>
	</p>
				</center></center>
				</h1>
			</a>
		</div>
		<div class="container">
		<div class="col-md-14">
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
						<img src="resources/images/theme.jpg" width="300" height="100"
							border="5">
					</div>
					<div class="item">

						<img src="resources/images/mix1.jpg" width="300" height="100"
							border="5">
					</div>



					<div class="item">
						<img src="resources/images/mix2.jpg" width="300" height="100"
							border="5">
					</div>

					<div class="item">
						<img src="resources/images/all4.jpg" width="300" height="100"
							border="5">
					</div>

					<div class="item">
						<img src="resources/images/vege2.jpg" width="300" height="100"
							border="5">
					</div>
				</div>

				<!-- Left and right controls -->
				<a class="left carousel-control" href="#myCarousel" role="button"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#myCarousel" role="button"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col-md-4">
				<a href="welcome1" class="thumbnail"> <img
					src="resources/images/all2.jpg" alt="literature"
					style="width: 300px; height: 120px">
					<center>
						<p>
						<h3>FRUITS</h3>
						</p>
					</center>
				</a>
			</div>

			<div class="col-md-4">
				<a href="welcome1" class="thumbnail"> <img
					src="resources/images/capsicum1.jpg" alt="history"
					style="width: 300px; height: 120px">
					<center>
						<p>
						<h3>CAPSICUM</h3>
						</p>
					</center>
				</a>
			</div>
			<div class="col-md-4">
				<a href="welcome1" class="thumbnail"> <img
					src="resources/images/drinks1.jpg" alt="history"
					style="width: 300px; height: 120px">
					<center>
						<p>
						<h3>DRINKS</h3>
						</p>
					</center>
				</a>
			</div>
			<div class="col-md-4">
				<a href="welcome1" class="thumbnail"> <img
					src="resources/images/specialoffer.png" alt="history"
					style="width: 300px; height: 120px">
					<center>
						<p>
						<h3>SPECIAL OFFERS</h3>
						</p>
					</center>
				</a>
			</div>
			<div class="col-md-4">
				<a href="welcome1" class="thumbnail"> <img
					src="resources/images/get1.png" alt="history"
					style="width: 300px; height: 120px">
					<center>
						<p>
						<h3>BUY 1 GET 1</h3>
						</p>
					</center>
				</a>
			</div>
			<div class="col-md-4">
				<a href="welcome1" class="thumbnail"> <img
					src="resources/images/freedelivary.jpg" alt="history"
					style="width: 300px; height: 120px">
					<center>
						<p>
						<h3>FREE DELIVARY</h3>
						</p>
					</center>
				</a>
			</div>
			<div class="col-md-4">
				<a href="welcome1" class="thumbnail"> <img
					src="resources/images/like.jpg" alt="history"
					style="width: 300px; height: 120px">
					<center>
						<p>
						<h3>LIKE</h3>
						</p>
					</center>
				</a>
			</div>
			<div class="col-md-4">
				<a href="welcome1" class="thumbnail"> <img
					src="resources/images/bestoffer.jpg" alt="history"
					style="width: 300px; height: 120px">
					<center>
						<p>
						<h3>BEST OFFER</h3>
						</p>
					</center>
				</a>
			</div>
			</a>
		</div>
	</div>
	</div>
</body>

<%@include file="Footer.jsp"%>