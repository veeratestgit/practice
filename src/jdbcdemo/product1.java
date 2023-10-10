package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class product1 {
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			
			// This is DB connection string
			
			String dburl = "jdbc:mysql://localhost:3306/products";
			String username = "root";
			String password = "1234";
			String query = "Call SelectAllProducts()";
			
			Connection con = null;
			
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		con = DriverManager.getConnection(dburl,username,password);
			Statement stmt = con.createStatement(); // execute query
			ResultSet rs = stmt.executeQuery(query); 
			// see the result
		
			while(rs.next()) {
				
				System.out.print("product_id: " + rs.getString("product_id") + "\t");
				System.out.print("name: " + rs.getString("name") + "\t");
				System.out.print("description: " + rs.getString("description") + "\t");
				System.out.println("price: " + rs.getString("price"));
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
