package newTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Firstframes {
	
	public static WebDriver driver;
	public static Actions a;
	
	
	
	public static void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\workspace\\SeleniumAutomation\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();

	}
	
	public static void LoadUrl(String url) {
		
		driver.get(url);
		Maximize();
		ImplicitWait();
		
	}

	public static void Maximize() {
		driver.manage().window().maximize();
	}
	
	public static void ImplicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void insert(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void click(WebElement element1) {
		element1.click();
		
	}
	
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void getUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	
	public static void singleclick() {
		WebElement COURSES = driver.findElement(By.xpath("//a[text()='COURSES']"));
		a = new Actions(driver);
		a.moveToElement(COURSES).perform();

	}
	
	public static void Secondclick() {
		WebElement OracleTraining = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		a.moveToElement(OracleTraining).perform();

	}
	
	public static void thirdclick() {
		WebElement OracleTraining = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		a.moveToElement(OracleTraining).perform();
	}
	
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	
	
	
	
	
}
