package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projectdebug {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\workspace\\SeleniumAutomation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement createaccountbtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		createaccountbtn.click();
		
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		firstname.sendKeys("arun");
		
	}

}
