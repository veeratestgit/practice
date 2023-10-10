package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionHandling {
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			
			// This is DB connection string
			
			String dburl = "jdbc:mysql://localhost:3306/animated_movies";
			String username = "root";
			String password = "1234";
			String query = "Call SelectAllMovies()";
			
			Connection con = null;
			
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		con = DriverManager.getConnection(dburl,username,password);
			Statement stmt = con.createStatement(); // execute query
			ResultSet rs = stmt.executeQuery(query); 
			// see the result
		
			while(rs.next()) {
				
				System.out.print("Title: " + rs.getString("title") + "\t");
				System.out.print("genre: " + rs.getString("genre") + "\t");
				System.out.print("director: " + rs.getString("director") + "\t");
				System.out.println("release_year: " + rs.getString("release_year"));
			}

		}
			
			catch(Exception e) {
				System.out.println(e.getMessage());
			
			}
			finally {
				con.close();
			}
		}	

	}