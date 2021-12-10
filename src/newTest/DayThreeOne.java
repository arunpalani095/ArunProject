package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayThreeOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\workspace\\SeleniumAutomation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		click.click();
		
		WebElement firstname = driver.findElement(By.name("name"));
		firstname.sendKeys("Arun");
		
		WebElement mail = driver.findElement(By.id("InputEmail1"));
		mail.sendKeys("jparun095@gmail.com");
		
		WebElement number = driver.findElement(By.id("InputSubject"));
		number.sendKeys("1234567890");
		
		WebElement courses = driver.findElement(By.name("courses"));
		courses.sendKeys("selenium");
		
		
	}

}
