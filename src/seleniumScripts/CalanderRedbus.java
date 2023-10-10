package seleniumScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderRedbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maxamize the window
		
		driver.manage().deleteAllCookies(); // delete the cookies of the browser
		
		driver.get("https://www.redbus.com/");
		//Thread.sleep(1000);
		//driver.navigate().to("https://www.facebook.com/");
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('onward_cal').value = '30/09/2023'");
		

	}

}
