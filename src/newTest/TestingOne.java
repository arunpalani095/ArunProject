package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingOne {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\workspace\\SeleniumAutomation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.cssSelector("input[id=email"));
		element.sendKeys("Arun palani");
		
		WebElement element2 = driver.findElement(By.xpath("//input[@id='pass']"));
		element2.sendKeys("12345678");
		
		
		
	}
	
	

}
