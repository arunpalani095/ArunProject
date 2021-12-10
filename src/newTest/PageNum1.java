package newTest;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageNum1 extends BaseClass {
	
	public PageNum1() {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getP1sumbit() {
		return p1sumbit;
	}

	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(xpath ="//input[@id='Submit']")
	private WebElement p1sumbit;
	
	
	

}
