package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testingbank {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\workspace\\SeleniumAutomation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		
		driver.manage().window().maximize();
		
	
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("arunpalani");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("arunpalani");
		
	
	}

}
