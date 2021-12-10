package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\workspace\\SeleniumAutomation\\driver\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		
		WebElement login = Driver.findElement(By.xpath("//a[text()='Create New Account']"));
		login.click();
		
		Thread.sleep(3000);
		
		WebElement dropdown = Driver.findElement(By.id("month"));
		
		Select s = new Select(dropdown);
		
		s.selectByVisibleText("jun");
		
		
		
	}

}
