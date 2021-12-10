package newTest;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageNum2 extends BaseClass{
	
	public PageNum2() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radio;
	
	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinue1() {
		return continue1;
	}

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue1;

}
