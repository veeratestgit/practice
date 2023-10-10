package seleniumScripts;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectDemo3 {
	
	// Write method to draw border around the element
	
		public static void drawborder(WebElement element, WebDriver driver)
		{
		JavascriptExecutor js =  ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		}

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException, IOException {
		// Make connection to MySql
		
		String dburl = "jdbc:mysql://localhost:3306/seleniumtest";
		String username = "root";
		String password = "1234";
		
         Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		//create new option
		ChromeOptions options = new ChromeOptions();
		//disable notification
		options.addArguments("--disable-notifications");
		//To open webdriver
		WebDriver driver = new ChromeDriver(options);
		//maximize window
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		//open remove.bg
		driver.get("https://www.remove.bg/");
		//get the title of the tab opened
		String title = driver.getTitle();
		//get the url of the tab opened
		String url = driver.getCurrentUrl();
		//insert into the table in mysql
		PreparedStatement ps = con.prepareStatement("insert into webtest values(?,?)"); // execute query
		ps.setString(1,title);
		ps.setString(2,url);
		//execute
		ps.executeUpdate();
		//wait for 5 seconds
		Thread.sleep(5000);
		//accept the cookies
		driver.findElement(By.xpath("//button[@class='btn btn-link btn-link-secondary']")).click();
		//click on upload image botton
		WebElement e1 = driver.findElement(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]"));
		//wait for 10 seconds
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait until upload botton appears
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]")));
		//click on the botton
		e1.click();
		//execute the script written AutoIt located at below file location to upload image
		//to intereact with windows
		Runtime.getRuntime().exec("C:\\Users\\INDIA\\Desktop\\all files\\autoscripts\\scripts1.exe");
		//wait for 10 seconds
		Thread.sleep(10000);
		//screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//name file as
		File destFile = new File("./Screenshots/projectrbg.png");
		//store in screenshots
		FileUtils.copyFile(srcFile, destFile);
		//wait
		Thread.sleep(3000);
		//get the title of the tab opened
		String title5 = driver.getTitle();
		//get the url of the tab opened
		String url5 = driver.getCurrentUrl();
		//insert into the table in mysql
		PreparedStatement ps5 = con.prepareStatement("insert into webtest values(?,?)"); // execute query
		ps5.setString(1,title5);
		ps5.setString(2,url5);
		//execute
		ps5.executeUpdate();
		//wait
		Thread.sleep(3000);
		//open amazon
		driver.get("https://www.amazon.com/");
		//get the title of the tab opened
		String title1 = driver.getTitle();
		//get the url of the tab opened
		String url1 = driver.getCurrentUrl();
		//insert into the table in mysql
		PreparedStatement ps1 = con.prepareStatement("insert into webtest values(?,?)"); // execute query
		ps1.setString(1,title1);
		ps1.setString(2,url1);
		//execute
		ps1.executeUpdate();
		//wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//mousehower
		WebElement e2 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		Actions ab = new Actions(driver);
		
		ab.moveToElement(e2).perform();
		//sleep 5 sec
		Thread.sleep(5000);
		//find watchlist and click
		driver.findElement(By.xpath("(//span[@class='nav-text'])[7]")).click();
		//wait
		Thread.sleep(5000);
		/*//get the title of the tab opened
		String title4 = driver.getTitle();
		//get the url of the tab opened
		String url4 = driver.getCurrentUrl();
		//insert into the table in mysql
		PreparedStatement ps4 = con.prepareStatement("insert into webtest values(?,?)"); // execute query
		ps4.setString(1,title4);
		ps4.setString(2,url4);
		//execute
		ps4.executeUpdate();
		//wait
		Thread.sleep(5000);*/
		//find text box to enter email
		WebElement e3 =	driver.findElement(By.xpath("//input[@type='email']"));
		//draw boarder by calling method on email text box
		drawborder(e3,driver);
		//take screenshot
		File srcFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//name file as
		File destFile2 = new File("./Screenshots/projectamazon.png");
		//store in screenshots
		FileUtils.copyFile(srcFile2, destFile2);
		
		Thread.sleep(9000);
		
		driver.get("https://www.redbus.com/");
		//get the title of the tab opened
		String title2 = driver.getTitle();
		//get the url of the tab opened
		String url2 = driver.getCurrentUrl();
		//insert into the table in mysql
		PreparedStatement ps2 = con.prepareStatement("insert into webtest values(?,?)"); // execute query
		ps2.setString(1,title2);
		ps2.setString(2,url2);
		//execute
		ps2.executeUpdate();
		//accept cookies
		driver.findElement(By.xpath("//button[@class = 'sc-fjdhpX jxFepI']")).click();
		//wait
		Thread.sleep(1500);
		// Clear the source text box
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).clear();
		// enter input string in text box
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).sendKeys("Paris");
		//wait
		Thread.sleep(5000);
		// capture element form the list
		driver.findElement(By.xpath("//div[@class='autoFill autosuggest-ul rdc-src']/descendant::li[3]")).click();
		// destination clear box
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).clear();
		//enter destination		
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).sendKeys("London");
		//wait			
		Thread.sleep(5000);
		//select from the list	
		driver.findElement(By.xpath("//div[@class='autoFill autosuggest-ul rdc-dest']/descendant::li[3]")).click();
		//calander
		Thread.sleep(3000);
		//click on date box
		driver.findElement(By.id("date-box")).click();
		//wait
		Thread.sleep(5000);
		//Select date
		driver.findElement(By.xpath("//div[@class='DatePicker__CalendarContainer-sc-1x9sb82-0 bkhtIz']/descendant::span[41]")).click();
		//wait
		Thread.sleep(5000);	
		//click on search button
		driver.findElement(By.id("search_butn")).click();
		//wait
		Thread.sleep(5000);	
		//get the title of the tab opened
		String title3 = driver.getTitle();
		//get the url of the tab opened
		String url3 = driver.getCurrentUrl();
		//insert into the table in mysql
		PreparedStatement ps3 = con.prepareStatement("insert into webtest values(?,?)"); // execute query
		ps3.setString(1,title3);
		ps3.setString(2,url3);
		//execute
		ps3.executeUpdate();
		//wait
		Thread.sleep(5000);
		//take screenshot
		File srcFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("./Screenshots/projectredbus.png");

		FileUtils.copyFile(srcFile1, destFile1);
	}

}
