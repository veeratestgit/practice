package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//connecting to Database
		//mandatory first line
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connect to DB -> use class drivermanager and method getconnection 
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "1234";
		// connecting to particular database  library
		Connection con = DriverManager.getConnection(dburl,username,password);
		System.out.println("Successfully connected to database");
		
		//run a querry
		
		String query = "select * from movies ";
		
		//Send query to the DB
		Statement stmt = con.createStatement();
		//execute the query and fetch the output and store it in a object 
		ResultSet rs = stmt.executeQuery(query); 
		//print the rows on the console
		
		while(rs.next()) {
			System.out.print("Title: " + rs.getString("title") + "\t");
			System.out.print("genre: " + rs.getString("genre") + "\t");
			System.out.print("director: " + rs.getString("director") + "\t");
			System.out.println("release_year: " + rs.getString("release_year"));
		}
		
		//close the connection
		con.close();
		
	}

}
