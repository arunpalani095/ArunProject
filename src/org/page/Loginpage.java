package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass {
	
	public Loginpage() {

		PageFactory.initElements(driver, this);
		
	}
		
		@FindAll({@FindBy(id="username"),@FindBy(name="username")})
		private WebElement txtname;
		
		@FindAll({@FindBy(id="password"),@FindBy(name="password")})
		private WebElement pwds;
		
		@FindBy(xpath = "//input[@name='login']")
		private WebElement login;
		
		@FindBy(xpath="//option[@value='Melbourne']")
		private WebElement firstword;
		
		@FindAll({@FindBy(id="location"),@FindBy(name="location")})
		private WebElement selectfirst;
		

		public WebElement getSelectfirst() {
			return selectfirst;
		}

		public WebElement getTxtname() {
			return txtname;
		}

		public WebElement getPwds() {
			return pwds;
		}

		public WebElement getLogin() {
			return login;
		} 
		
		
	
	
	
	
	

}
