package seleniumScripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBCSelenium {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// TODO Auto-generated method stub
		
		//login to mysql create database with table in it
		
		
       WebDriver driver = new ChromeDriver();
       
		//maximaize the window
       
		driver.manage().window().maximize();
		
		//open chrome browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//get the title of the tab opened
		
		String title = driver.getTitle();
		
		//get the url of the tab opened
		
		String url = driver.getCurrentUrl();
		
		//make connection to the mysql
		
		String dburl = "jdbc:mysql://localhost:3306/seleniumtest";
		String username = "root";
		String password = "1234";
		
         Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		//con = DriverManager.getConnection(dburl,username,password);
		//insert values into table
		
		PreparedStatement ps = con.prepareStatement("insert into webtest values(?,?)"); // execute query
		ps.setString(1,title);
		ps.setString(2,url);
		//execute
		
		ps.executeUpdate();
		
		//navigate to another link on same tab
		
		driver.navigate().to("https://github.com/");
		
		//get the title of the new tab opened
		
		title= driver.getTitle();
		
		//get the url of new link
		
		url = driver.getCurrentUrl();
		
		//insert values into table
		
		ps = con.prepareStatement("insert into webtest values(?,?)"); // execute query
		ps.setString(1,title);
		ps.setString(2,url);
		ps.executeUpdate();
		
		//close the connection
		
		con.close();
		
		
		
		
		
		
		
		

	}

}