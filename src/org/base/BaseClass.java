package org.base;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions a;
	public static Select s;
	
	
	
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
	
	public static void Select1() {
		
		WebElement element1 = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(element1);
		s.selectByVisibleText("Melbourne");
		
	}
	
public static void Select2() {
		
		WebElement element2 = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s = new Select(element2);
		s.selectByVisibleText("Hotel Sunshine");
		
	}
	
public static void Select3() {
	
	WebElement element3 = driver.findElement(By.xpath("//select[@id='room_type']"));
	Select s = new Select(element3);
	s.selectByVisibleText("Standard");
	
}

public static void Select4() {
	
	WebElement element4 = driver.findElement(By.xpath("//select[@id='room_nos']"));
	Select s = new Select(element4);
	s.selectByValue("3");
	
}

public static void Select5() {
	
	WebElement element5 = driver.findElement(By.xpath("//select[@id='adult_room']"));
	Select s = new Select(element5);
	s.selectByValue("3");
	
}
	
public static void Select6() {
	
	WebElement element6 = driver.findElement(By.xpath("//select[@id='adult_room']"));
	Select s = new Select(element6);
	s.selectByValue("2");
	
}
public static void cctype() {
	
	WebElement cctype = driver.findElement(By.xpath("//select[@id='cc_type']"));
	Select s = new Select(cctype);
	s.selectByVisibleText("VISA");
	
}

public static void month() {
	
	WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	Select s = new Select(month);
	s.selectByValue("3");
	
}

public static void year() {
	
	WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	Select s = new Select(year);
	s.selectByValue("2022");
	
}
	
}
