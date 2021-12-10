package newTest;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageNum3 extends BaseClass {
	
	public PageNum3() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardno;
	
	@FindBy(id="cc_cvv")
	private WebElement ccv;
	
	@FindBy(xpath ="//input[@id='book_now']")
	private WebElement booknow;
	
	
	
	
	
	
	

}
