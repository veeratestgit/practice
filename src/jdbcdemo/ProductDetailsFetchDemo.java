package jdbcdemo;

//import packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDetailsFetchDemo {

	public static void main(String[] args) throws SQLException {
	
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/productdb";
		String username="root";
		String password="1234";
		String sql_query="select * from products where product_id=?";
		
		Connection connection=null;
		PreparedStatement pstmt=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Id: ");
		int p_id=sc.nextInt();
		
		try {
			//Load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create Connection
			connection=DriverManager.getConnection(url,username,password);
			
			//create the prepared statement
			pstmt=connection.prepareStatement(sql_query);
			pstmt.setInt(1, p_id);
			
			//execute sql query
			ResultSet rs=pstmt.executeQuery(sql_query);
			
			while(rs.next()) {
				System.out.print("product_id:"+rs.getInt("product_id")+"\t" );
				System.out.print("product_name:"+rs.getString("product_name")+"\t" );
				System.out.print("product_category:"+rs.getString("product_category")+"\t");
				System.out.print("product_quantity:"+rs.getInt("product_quantity"));
				
			}
			
		}
		
		catch(Exception e) {
			e.getMessage();
		}
		
		finally {
			//close all connection
			pstmt.close();
			connection.close();
			sc.close();
		}
		
	}

}