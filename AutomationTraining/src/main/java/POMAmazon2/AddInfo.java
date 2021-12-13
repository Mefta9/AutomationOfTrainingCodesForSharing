package POMAmazon2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddInfo {
public WebDriver driver;
@FindBy(id = "ap_customer_name") WebElement UrName;
@FindBy(id = "ap_email") WebElement Phone;
@FindBy(id = "ap_password") WebElement Pass;
@FindBy(id = "ap_password_check") WebElement RePass;
@FindBy(id = "continue") WebElement Continue;


public AddInfo(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);		
}

	public void Myname() {
		UrName.sendKeys("Meftah U");
		
	}
	public void MyPhone() {
		Phone.sendKeys("3013668787");
		
	}
	public void Password() {
		Pass.sendKeys("1234");
		
	}
	public void RePassword() {
		RePass.sendKeys("1234");
		
	}
	
	public void Continue() {
		Continue.click();
		
	}

}
