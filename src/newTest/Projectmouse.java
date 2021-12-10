package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Projectmouse {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\workspace\\SeleniumAutomation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(courses).perform();
		
		WebElement OracleTraining = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		a.moveToElement(OracleTraining).perform();
		
		WebElement SQLCertification = driver.findElement(By.xpath("//span[text()='SQL Certification']"));
		SQLCertification.click();
		
		
		
		
	}

}
