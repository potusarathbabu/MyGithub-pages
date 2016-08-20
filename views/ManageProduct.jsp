<%@include file="AdminHeader.jsp" %>

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
    background-color:grey;
}
</style>
</head>
<body>
	
	<center> <h1 style="color:white"> SUPER MARKET PRODUCT DETAILS</h1></center><hr>
	
	
	
	<div align="center">
        <form:form action="myproduct" method="post" commandName="product" modelAttribute="product" enctype="multipart/form-data">
            <table border="0">
                <tr><td>
                    <center><td colspan="2" align="center"><h2 style="color:yellow">Manage Product</td></center>
                </td></tr>
                <tr>
                 <td><form:label path="productname"> <h2 style="color:yellow">Product Name:</form:label></td>
                  <td><form:input path="productname" /></td>
                </tr>
               
                <tr>
                <td><form:label path="quantity"><h2 style="color:yellow">Product Quantity:</form:label></td>
                    <td><form:input path="quantity" /></td>
                </tr><br>
             	<tr>
                    <td><form:label path="price"><h2 style="color:yellow">Product Price:</form:label></td>
                   <td><form:input path="price" /></td>
                </tr>     
             	<tr>
                     <td><form:label path="more"><h2 style="color:yellow">More details</form:label></td>
                     <td><form:input path="more" /></td>
                </tr>     
                 
             	<tr>
                     <td><form:label path="img"><h2 style="color:yellow">Image Upload:</form:label></td>
                     <td><form:input type="file" path="Img"  /></td>
               </tr>       
       
       				 </table>
       				<tr><td>
                <h5 colspan="0" align="center" ><input type="submit" value="Add Product"></h5>
                 <h5 colspan="0" align="center" ><input type="reset" value="Cancel"></h5>
               
              </td></tr>
             
           
      
           
    </div>
    <a href="Adminlogin"><h2 align="left"><h2 style="color:green">Back</a> 
      </form:form>
    <br><br>
   <%@include file="angularjs.jsp" %>
	
