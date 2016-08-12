
<%@include file="Header1.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Super Market AddProduct</title>
<meta name="viewport" content="width=device-width, initial scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<style>
body {
    background-image: url("resources/images/add to cart.jpg");
    background-image:cover;
}
</style>
<body>
<center> <h1 style="color:red"> WELCOME TO SUPER MARKET </h1></center><hr>

<form:form class="form-horizontal" method="post" action="myproduct"   commandName="product">
<center>
<table>
    <tr>
        
 <div class="form-group">
      <label class="control-label col-sm-2" path="pdtname" for="pdtname"><font color="white">Product Name:</font></label>
      <div class="col-sm-5">          
        <input type="text" class="form-control" id="pdtname" path="pdtname" placeholder="Enter your productname here" required/>
      </div>
      
    </div>
        
    </tr>
     
     <tr>
        <div class="form-group">
      <label class="control-label col-sm-2" path="quantity" for="quantity"><font color="white">Product-Quantity:</font></label>
      <div class="col-sm-5">          
        <input type="text" class="form-control" id="quantity" path="quantity" placeholder="Enter quantity here" required/>
      </div>
      
    </div>
        
        
    </tr>
    <tr>
        <div class="form-group">
      <label class="control-label col-sm-2" path="price" for="price"><font color="white">Product-Price:</font></label>
      <div class="col-sm-5">          
        <input type="text" class="form-control" id="price" path="price" placeholder="Enter Product price here" required/>
      </div>
      <tr>
      <div class="form-group">
      <label class="control-label col-sm-2" path="more" for="more"><font color="white">More:</font></label>
      <div class="col-sm-5">          
        <input type="text" class="form-control" id="more" path="more" placeholder="Enter your more details here" required/>
      </div>
      
    </div>
 </tr>
 <tr>
  <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="img">Product Picture: </label>
                <div class="col-md-7">
                    <form:input type="file" path="img" id="img" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="img" class="help-inline"/>
                        </tr>
                    </div>
                </div>
            </div>
        </div>
     
   
     <tr>
     <td colspan="2"><input type="submit" value="Add Product"></td>
    
    
   
     <td colspan="2"><input type="reset" value="Reset"></td>
    
</tr>
    
</table>
</center>
</form:form>




</html>