
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class connect {
	
	static Connection c=null;

	public static Connection retrieveConnection() throws SQLException {
		try{
		Class.forName("com.mysql.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_info_system","root","");
		return c;
	   }catch (ClassNotFoundException e){
		System.err.println(e.getMessage());
		return c;
		
	  }
		
	
}

    
}
