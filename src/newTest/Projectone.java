package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projectone {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\workspace\\office.org\\liber\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtmail = driver.findElement(By.xpath("//input[@type='text']"));
		
		txtmail.sendKeys("selenium");
		
		WebElement txtpsd = driver.findElement(By.xpath("//input[@id='pass']"));
		
		txtpsd.sendKeys("12345");
		
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		
		submit.click();
		
		
		
		

	}

}
