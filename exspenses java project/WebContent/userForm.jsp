<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page import="java.sql.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>User Details Form Page</title>
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
	
<script>
function validate()
{
	if(myform.place.value.trim() == null || myform.place.value.trim() == "")
	{
		alert("Enter Place of interest");
		myform.place.focus();
	}
	if(myform.income.value.trim() == null|| myform.income.value.trim()=="" )
	{
		alert("Enter Annual Income");
		myform.income.focus();
	}
	
	if (myform.apt.selectedIndex == 0)
	{
        alert("Please select a value from the Accommodation drop down.");
        myform.apt.focus();
        
    }
	
	if (myform.transport.selectedIndex == 0)
	{
        alert("Please select a value from the transport drop down.");
        myform.transport.focus();
        
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
		<form name="myform1" method="post" action="LogOutServlet" >
		<h3 align="right"><input  class="text" type="submit" value="logout" name="logout"/></h3>
		</form>
		<br>
		<form name="myform" method="post" action="UserFormPath" >
			<h2 align="center" ">User Expenses Form</h2>
			<table class="tables" align="center" cellspacing="5" cellpadding="10">
			<%
			 Connection c = null;
			 Statement stmt = null;
			List<String> states = new ArrayList<String>();
			 try {
			      Class.forName("org.sqlite.JDBC");
			      c = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/Relocating_Cost");
			      stmt = c.createStatement();
			      ResultSet rs = stmt.executeQuery( "SELECT State_Name FROM States;" );
			      while( rs.next()){
					states.add(rs.getString("State_Name"));			    	  
			      }
			      rs.close();
			      stmt.close();
			      c.close();
			    } catch ( Exception e ) {
			    	e.printStackTrace();
			      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			      System.exit(0);
			    }
			%>
				<tr>
					<td align="right">Place of Interest: </td>
					<td><select name="place" id="place" maxlength="40">
						<option value = "none" selected > Select State</option>
						<%
							for(String state:states){
						%>
						<option value ="<%= state %>" > <%= state %> </option>
						<%} %>
					</select>	
					</td>
				</tr>
				<tr>
					<td align="right">Annual Income($): </td>
					<td><input type="text" name="income"  size=30/> </td>
				</tr>
				
				<tr>
					<td align="right">Accommodation Type: </td>
					<td><select name="apt" id="apt" maxlength="40">
						<option value = "none" selected > Select living style</option>
						<option value = "One_BHK_APT"> 1 BH Apartment</option>
						<option value = "Two_BHK_APT"> 2 BH Apartment</option>
						<option value = "Three_BHK_APT"> 3 BH Apartment</option>
						<option value = "One_BHK_House"> 1 BH Individual House</option>
						<option value = "Two_BHK_House"> 2 BH Individual House</option>
						<option value = "Three_BHK_House"> 3 BH Individual House</option>
					</select>
					</td>
				</tr>
				
				<tr>
					<td align="right">Transport Type: </td>
					<td><select name="transport" id="transport" maxlength="40">
						<option value = "none" selected > Select transport type</option>
						<option value="Public_transport"> PublicTransit</option>
						<option value="Fuel"> OwnVehicle</option>
					</select>
					</td>
				</tr>
				
					<td></td>
					<td align="left"><input  class="submits" type="submit"  onclick="validate()" />
					&nbsp;&nbsp;
					<input  class="submits" type="reset" /></td>
				</tr>
			
			</table>
		
		</form>

</body>
</html>
