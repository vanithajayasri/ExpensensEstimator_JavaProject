import javax.swing.JOptionPane;
import java.sql.*;

public class SignInService
{
public boolean authentication(String id,String pwd)
	
	{
		if( (pwd==null ||pwd.trim()=="")|| (id==null || id.trim() ==""))
		{
			JOptionPane.showMessageDialog(null,"Please fill all the required forms");
			return false;
		}
		 Connection c = null;
		 Statement stmt = null;
		 int size = 0;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/Relocating_Cost");
		      stmt = c.createStatement();
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM Users_Auth WHERE User_Name = '"+id+"' AND password = '"+pwd+"';" );
		      while( rs.next()){
		    	  //System.out.println(rs.getInt("ID"));
		    	  size ++;
		      }
		      rs.close();
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		    	e.printStackTrace();
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    if(size == 0)
		    	{
		    	return false;
		    	}
		return true;		
	}

}
