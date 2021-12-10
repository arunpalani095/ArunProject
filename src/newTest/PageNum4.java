package newTest;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageNum4 extends BaseClass {
	
	public PageNum4() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
}
