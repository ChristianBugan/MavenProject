package curs15;

import java.sql.Connection;



public class TestDB {
	
	static String URL = "jdbc:mysql://keytraining-demo.c050jeowbe1q.eu-central-1.rds.amazonaws.com:3306/KeyTraining";
	static String USER = "demouser";
	static String PASS = "demouser";

	public static void main(String[] args) {
	
		//Obiect de tip DB connection, care deschide o conexiune la 
		//baza de date bazata pe credentialele de mai sus
		Connection conn = DbConnection.openDbConnection(URL, USER, PASS);
		
		//Query
		String selectQuery = "select * from customers;";
		
		//metoda care priemste obietctul de tip conexiune si query-ul si
		// executa query-ul pe conexiunea primita
		System.out.println(DBQuerys.dbSelectQuery(conn, selectQuery));
		
		
		String updateQuery = "update customers set CustomerName = 'TestX' where CustomerName = 'TestDragos12';";
		DBQuerys.dbUpdateQuery(conn, updateQuery);
		System.out.println(DBQuerys.dbSelectQuery(conn, selectQuery));
		
		
		String deleteQuery = "delete from customers where CustomerName = 'TestX'";
		DBQuerys.dbDeleteQuery(conn, deleteQuery);
		System.out.println(DBQuerys.dbSelectQuery(conn, selectQuery));
		
		
		//inchidem obiectul de tip connection
		DbConnection.closeDbConnection(conn);

	}

}

