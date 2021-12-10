package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Framessupport extends Firstframes {
	
	public static void main(String[] args) {
		
		launchbrowser();
		LoadUrl("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		insert(username, "Arun");
		WebElement password = driver.findElement(By.id("pass"));
		insert(password, "123456");
		WebElement button = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		click(button);
		title();
		getUrl();
		LoadUrl("http://www.greenstechnologys.com/");
		singleclick();
		Secondclick();
		thirdclick();
		close();
		
	}

}
