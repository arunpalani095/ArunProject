package newTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crazysales {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\workspace\\SeleniumAutomation\\driver\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
			
		Driver.get("https://www.redbus.in/");
		Driver.manage().window().maximize();
		
		WebElement login = Driver.findElement(By.id("src"));
		login.sendKeys("chennai");
		
		WebElement reach = Driver.findElement(By.id("dest"));
		reach.sendKeys("Coimbatore");
		
		
			}
		
	}

