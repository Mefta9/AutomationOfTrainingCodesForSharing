package POMAmazon2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatAcc {
	public WebDriver driver;
	
	@FindBy(id = "createAccountSubmit") WebElement CreateAccount;
	
	public CreatAcc(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);		
		
	}
	
	public void clickOnAcc()
	{
		CreateAccount.click();
	}
	
}
