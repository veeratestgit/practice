package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProcedureDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "1234";
		String query = " Call SelectALLMovies";
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		Statement stmt = con.createStatement();
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
