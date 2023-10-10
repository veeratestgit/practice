package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.chrome.ChromeDriver;

	public class BrowserMethods {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.selenium.dev/downloads/");
			
			String title = driver.getTitle();
			System.out.println("title of the webpage is: " + title);
			String url = driver.getCurrentUrl();
			System.out.println("the url of webpage is: " + url);
			
			driver.close();
			

		}

	}