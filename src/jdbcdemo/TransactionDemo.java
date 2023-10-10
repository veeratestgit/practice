package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "1234";
		String query = " Call SelectALLMovies";
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		System.out.println("successfully connected to database");
		
		String q1 = "insert into movies values('movie10','comedy','director10','1957')";
		String q2 = "update movies set director = 'jhon' where title = 'movie10'";
		String q3 = "delete from movies where title = 'Finding Nemo'";
		boolean flag = false;
		
		Statement stmt = con.createStatement();
		stmt .addBatch(q1);
		stmt .addBatch(q2);
		stmt .addBatch(q3);
		int[] result = stmt.executeBatch();
		con.setAutoCommit(false);
		
		for(int i =0;i<result.length; i++){
			System.out.println(i);
			if(result[i]==0){
				flag=true;
			}
		}
		if(flag == false){
			con.commit();
			System.out.println("transcation succcessfull");
		}
		else{
			con.rollback();
			System.out.println("transcation  fail");
		}
		

	}

}
