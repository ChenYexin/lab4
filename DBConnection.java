package book;
import java.sql.*;


public class DBConnection {
	   	
	  	try {
	  		Class.forName("com.mysql.jdbc.Driver");
	  		con = DriverManager.getConnection(URL,USER,PWD);
	  		System.out.println("database connecting succeed");
	  	} catch (SQLException e) {
	  		System.out.println("database connecting failed");
	  		// TODO Auto-generated catch blo-QWAwaaAck
	  		e.printStackTrace();
	  	} catch (ClassNotFoundException e) {
	  		// TODO Auto-generated catch block
	  		System.out.println("driver load failed");
	  		e.printStackTrace();
	  	}
	   }
	   public Connection getConnection(){
		   return con;
	   }
	   public void close(){
		   try {
	    		this.con.close();
	    		System.out.println("database closing succeed");
	    		} catch (SQLException e) {
	    		// TODO Auto-generated catch block
	    		System.out.println("database closing failed");
	    		e.printStackTrace();
	    	}
	   }
}
