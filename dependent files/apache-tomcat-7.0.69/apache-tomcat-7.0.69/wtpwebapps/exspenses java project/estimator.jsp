<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Estimation Page</title>
<style>
	
	body { background-color:#ffe6ff;}

	h1 { text-align :center;}
	.anchors{ 
	  	font-size:20pt; 
	  	text-decoration:none;
	  	color:blue;
	  	position:relative;
	  	left:40%;
		
		
	 }
	 
	.tables{
		font-size:15pt;
		border:1px solid;
		padding:20px;
		height:250px;
		
				
	}
	.submits{ font-size:13pt;background:#ffffcc;}

</style>
	
</head>
<body>
	<h1 style="font-family:Apple chancery;">  EXPENSES ESTIMATOR </h1>

		<a href="signIn.jsp" class="anchors">Home</a>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="userForm.jsp" class="anchors"> Expenses Form</a>
		<hr />
		<br>
		<h3>Hello <%=request.getAttribute("fname") %> !!!!
		<br /> Welcome to Expenses Estimator App </h3>
		
		<form method="post" action="signUpPath" >
			<h2 align="center">Details Entered</h2>
			<table class="tables" align="center" cellspacing="5" cellpadding="10">
			
				<tr>
					<td align="right">Accommodation choice : </td>
					<td><input type="text" name="aptChoice"  size=30/> </td>
				</tr>
				<tr>
					<td align="right">Transport choice: </td>
					<td><input type="text" name="transportChoice"  size=30/> </td>
				</tr>			
			</table>
		
			<br /><h2 align="center" ">Expenses Estimated</h2>
			<table class="tables" align="center" cellspacing="5" cellpadding="10">
			
				<tr>
					<td align="right">Living cost($): </td>
					<td><input type="text" name="livingCost" size="30" /> </td>
				</tr>
				<tr>
					<td align="right">Food($): </td>
					<td><input type="text" name="food"  size=30/> </td>
				</tr>
				<tr>
					<td align="right">Fuel($): </td>
					<td><input type="text" name="fuel"  size=30/> </td>
				</tr>	
				<tr>
					<td align="right">State Tax($): </td>
					<td><input type="text" name="stax" size="30" /> </td>
				</tr>
				<tr>
					<td align="right">Federal Tax($) : </td>
					<td><input type="text" name="ftax"  size=30/> </td>
				</tr>
				<tr>
					<td align="right">Transport($): </td>
					<td><input type="text" name="fuel"  size=30/> </td>
				</tr>
				
				<tr>
					<td align="right">Miscellaneous($): </td>
					<td><input type="text" name="fuel"  size=30/> </td>
				</tr>
				
				<tr>
					<td align="right">Total Expenditure per annum ($): </td>
					<td><input type="text" name="total"  size=30/> </td>
				</tr>		
			</table>
		</form>

</body>
</html>l>