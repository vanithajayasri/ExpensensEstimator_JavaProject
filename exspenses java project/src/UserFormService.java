import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pojo.Options;

public class UserFormService {
	public Options getOptionsList(String income, String place,String apt,String transport){
		Options op = new Options();
		 Connection c = null;
		 Statement stmt = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/Relocating_Cost");
		      stmt = c.createStatement();
		      int id = 0;
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM States WHERE State_Name = '"+place+"';" );
		      while( rs.next()){
		    	  id = rs.getInt("ID");
		      }
		      int total = 0;
		      ResultSet rs1 = stmt.executeQuery( "SELECT * FROM living_cost WHERE States_Id = "+id+";" );
		      while( rs1.next()){
		    	  switch(apt){
		    	  case "One_BHK_APT":
		    		  op.setLivingCost(rs1.getString("One_BHK_APT"));
		    		  break;
		    	  case "Two_BHK_APT":
		    		  op.setLivingCost(rs1.getString("Two_BHK_APT"));
		    		  break;
		    	  case "Three_BHK_APT":
		    		  op.setLivingCost(rs1.getString("Three_BHK_APT"));
		    		  break;
		    	  case "One_BHK_House":
		    		  System.out.println(rs1.getString("One_BHK_House"));
		    		  op.setLivingCost(rs1.getString("One_BHK_House"));
		    		  break;
		    	  case "Two_BHK_House":
		    		  op.setLivingCost(rs1.getString("Two_BHK_House"));
		    		  break;
		    	  case "Three_BHK_House":
		    		  op.setLivingCost(rs1.getString("Three_BHK_House"));
		    		  break;
		    	  }
		    	  op.setFood(rs1.getString("Food_Exp"));
		    	  op.setFuel(rs1.getString("Fuel"));
		    	  op.setMiscellaneous(rs1.getString("Miscellaneous"));
		    	  op.setStateTax(rs1.getDouble("State_tax"));
		    	  op.setTransport(rs1.getString("Public_transport"));
		    	  op.setTotal(op.calculateTotal(transport));
		      }
		      rs.close();
		      rs1.close();
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		    	e.printStackTrace();
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
	
		return op;
	}
}
