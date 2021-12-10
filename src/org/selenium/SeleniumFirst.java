package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\workspace\\SeleniumAutomation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		driver.get("http://gmail.com/");
		
		driver.get("http://www.flipkart.com/");
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		
	}

}
