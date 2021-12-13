package POMAmazon2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage1 {
	public WebDriver driver;
	
	@FindBy(id = "nav-link-accountList-nav-line-1") WebElement SignIn;
	
	
	public SignInPage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void click() {
		SignIn.click();
		
	}

}
