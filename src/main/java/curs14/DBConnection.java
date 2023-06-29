package curs14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection openDBConnection(String url, String user, String pass) {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexiune cu Success");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Nu am putut face conexiunea");
		}
		
		return conn;
	}
	
}
