package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDropDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//common for all program
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		Statement stmt = con.createStatement();
	//until this
				String query1 = "create database mydatabase";
				String query2 = "use mydatabase";
				String query3 = "drop database mydatabase";
				
				 // execute query
			    stmt.executeUpdate(query1); 
				System.out.println("Database mydatabase created successfully");
				stmt.executeUpdate(query2);
				System.out.println("Selected database: mydatabase");
				stmt.executeUpdate(query3);
				System.out.println("Deleted database: mydatabase");
				stmt.close();
				

	}

}
