<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SignIn Page </title>
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
	a:visited { color: blue;} 
	.tables{
		font-size:15pt;
		border:1px solid;
		padding:20px;
		height:250px;
		
				
	}
	.submits{ font-size:13pt;background:#ffffcc;}
</style>
	
<script>
function validate(){
	if(myform.userId.value.trim() == null || myform.userId.value.trim() == ""){
		alert("Enter userid");
	}
	if(myform.password.value.trim() == null|| myform.password.value.trim()=="" ){
		alert("Enter password");
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
		<form name="myform" method="post" action="SignInPath">
			<h2 align="center"> Sign In Form</h2>
			<table class="tables" align="center" cellspacing="5" cellpadding="10">
			
				<tr>
					<td align="right">UserId: </td>
					<td><input type="text" name="userId" size="30" /> </td>
				</tr>
				<tr>
					<td align="right">Password: </td>
					<td><input type="password" name="password"  size=30/> </td>
				</tr>
				<tr>
					
					<td align="left"><a href="signUpForm.jsp" >SignUp ?</a></td>
					<td align="center"><input  class="submits" type="submit" onClick="validate()"/></td>
				</tr>
				
			</table>
		
		</form>

</body>
</html>