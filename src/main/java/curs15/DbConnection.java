package curs15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection openDbConnection(String url, String user, String pass) {
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexiune cu success");
		}catch(SQLException e) {
			System.out.println("Nu am putut face conexiunea!");
		
		}
		return conn;
	}
	
	public static void closeDbConnection(Connection conn) {
		try {
			
			conn.close();
			System.out.println("Conexiunea a fost inchisa!");
			
		}catch(SQLException e) {
			System.out.println("Nu am putut inchide conexiunea!");
		}
	}
	
	
	
}
