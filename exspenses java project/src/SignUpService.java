import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class SignUpService 
{
	public boolean signUpAuthentication(String fname,String lname,String email,String mobile,String userPassword,String userName)
	{
		if( (fname!=null && fname.trim()!="") && (lname!=null && lname.trim()!="") 
				&& (email!=null && email.trim()!="") && (mobile!=null && mobile.trim()!=""))
		{
			Connection c = null;
			Statement stmt = null;
			
		    try	    
		    {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/Relocating_Cost");
		      stmt = c.createStatement();
		      int rs = stmt.executeUpdate("INSERT INTO Users_Auth(User_Name,password) VALUES ('"+userName+"','"+userPassword+"');");
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) 
		    {
		    	e.printStackTrace();
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    return true;		
			
		}	
		else
		{
			JOptionPane.showMessageDialog(null,"Please fill all the required sign up forms");
			return false;
		}
		

	}
}



