package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class product {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String product_id = "301";
		String name = "bag";
		String description = "American tourister ";
		String price = "2999";
		
		String dburl = "jdbc:mysql://localhost:3306/products";
		String username = "root";
		String password = "1234";
		
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?)"); // execute query
		ps.setString(1,product_id);
		ps.setString(2,name);
		ps.setString(3,description);
		ps.setString(4,price);
		
		ps.executeUpdate();
		// see the result
	
	

	}

}
