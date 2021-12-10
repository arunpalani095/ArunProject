package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projecttwo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\ELCOT\\workspace\\SeleniumAutomation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtmail = driver.findElement(By.xpath("//input[@type='text']"));
		
		txtmail.sendKeys("selenium");
		
		WebElement txtpsd = driver.findElement(By.xpath("//input[@id='pass']"));
		
		txtpsd.sendKeys("12345");
		
		System.out.println(txtpsd.getAttribute("value"));
		
		WebElement txt = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String t = txt.getText();
		System.out.println(t);
		
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(submit.getText());
		
		
		WebElement t2 = driver.findElement(By.xpath("//div[contains(text(),'band')]"));
		System.out.println(t2.getText());
		
		driver.quit();
		
	}

}
