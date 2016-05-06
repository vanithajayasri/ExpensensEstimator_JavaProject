<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>SignUp Page</title>
<style>
	
	body { background-color:#ffe6ff;}

	h1 { text-align :center;}
	
	.submits{ font-size:13pt;background:#ffffcc;}
	
	.anchors
	{ 
	  	font-size:20pt; 
	  	text-decoration:none;
	  	color:blue;
	  	position:relative;
	  	left:40%;
		
		
	 }
	 
	.tables
	{
		font-size:15pt;
		border:1px solid;
		padding:20px;
		height:250px;
		
				
	}
	

</style>

<script>
	function validateNames(idname)
	{
		var txtbox= document.getElementById(idname);  
		var name = txtbox.value;
		var reg1 = /^[a-zA-Z]+[\s]?[a-zA-Z ]+$/;
		txtbox.style.color ='white'; 
        if(reg1.test(name)) 
        	{
        		txtbox.style.backgroundColor ='green'; 
        	}	
    	else 
    		{
        		txtbox.style.backgroundColor ='red';
    		}
   
	}
	
	function validateEmail()
    {
        var txtbox= document.getElementById("emailid");
        var email= txtbox.value;
        var emailrx = /^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
   		 txtbox.style.color ='white'; 
        if(emailrx.test(email))                                                
         {
        	txtbox.style.backgroundColor ='green';                                     
     	 }
	    else 
	      {
	        txtbox.style.backgroundColor ='red';                                     
	      }
	                                            
	        
    }
	
	
	function validateMobile()
	{
		var txtbox= document.getElementById("mobileid");  
		var mobile = txtbox.value;
		var reg2 = /\d{3}[-]\d{3}[-]\d{4}/;
		txtbox.style.color ='white'; 
        if(reg2.test(mobile)) 
        	{
        		txtbox.style.backgroundColor ='green'; 
        	}	
    	else 
    		{
        		txtbox.style.backgroundColor ='red';
    		}
   
	}

</script>

	
</head>
<body>
	<h1 style="font-family:Apple chancery;">  EXPENSES ESTIMATOR </h1>

		<a href="signIn.jsp" class="anchors">Home</a>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="userForm.jsp" class="anchors"> Expenses Form</a>
		<hr />
		<br>
		<form method="post" action="SignUpPath" >
			<h2 align="center" "> Sign Up Form</h2>
			<table class="tables" align="center" cellspacing="5" cellpadding="10">
			
				<tr>
					<td align="right">First Name: </td>
					<td><input type="text" name="fname" size="30" id="fnameid" onkeyup="validateNames('fnameid')" /> </td>
				</tr>
				<tr>
					<td align="right">Last Name: </td>
					<td><input type="text" name="lname"  size=30 id="lnameid" onkeyup="validateNames('lnameid')" /> </td>
				</tr>
				
				<tr>
					<td align="right">Email Id: </td>
					<td><input type="text" name="email"  size=30  id="emailid" onkeyup="validateEmail()" /> </td>
				</tr>
				
				<tr>
					<td align="right">Mobile[xxx-xxx-xxxx]: </td>
					<td><input type="text" name="mobile"  size=30  id="mobileid" onkeyup="validateMobile()"/> </td>
				</tr>
				
				<tr>
					<td align="right">User Name: </td>
					<td><input type="text" name="username" size="30" id="usernameid" onkeyup="validateNames('fnameid')" /> </td>
				</tr>
				
				<tr>
					<td align="right">Password: </td>
					<td><input type="password" name="userpassword" size="30" id="passwordid" onkeyup="validateNames('fnameid')" /> </td>
				</tr>
				
				<tr>
					<td></td>
					<td align="left"><input  class="submits" type="submit"  />
					&nbsp;&nbsp;<input  class="submits" type="reset" /></td>
				</tr>
			
			</table>
		
		</form>

</body>
</html>