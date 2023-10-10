package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.simplilearn.com/");
		//div[@id='megamenu-box']/descendant::li[38]
		WebElement e1 = driver.findElement(By.xpath("//*[@id='megamenu-box']"));
		
		Actions a = new Actions(driver);
		
		a.click(e1).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("div[@id='megamenu-box']/descendant::li[38]")).click();
		
		

	}
}
