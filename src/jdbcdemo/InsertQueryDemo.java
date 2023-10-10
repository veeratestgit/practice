package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//String query = "INSERT INTO movies VALUES(' ',' ' )";
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		
		String title = "Finding Nemo";
		String genre = "Comedy";
		String director = "Andrew Stanton ";
		String release_year = "2003";
		
		//PREPARED STATEMENT -> USED FOR ECXECUTING INSERT QUERY WITH PARAMETERS
		PreparedStatement ps = con.prepareStatement("insert into movies values(?,?,?,?)"); // execute query
		ps.setString(1,title);
		ps.setString(2,genre);
		ps.setString(3,director);
		ps.setString(4,release_year);
		
		ps.executeUpdate();
		
		con.close();

	}

}
