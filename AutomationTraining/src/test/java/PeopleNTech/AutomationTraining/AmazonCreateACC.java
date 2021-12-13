package PeopleNTech.AutomationTraining;

import org.testng.annotations.Test;

import POMAmazon2.AddInfo;
import POMAmazon2.CreatAcc;
import POMAmazon2.SignInPage1;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonCreateACC {
	public WebDriver driver;
  @Test
  public void f() {
	  
	 SignInPage1 Sign =new SignInPage1(driver);
	 Sign.click();
	  
	 CreatAcc Click = new CreatAcc(driver);
	 Click.clickOnAcc();
	  
	 AddInfo Allinfo = new AddInfo(driver); // CREATED NEW OBJECT 'Allinfo'
	 Allinfo.Myname(); //ONLY NAME OF THE METHOD
	 Allinfo.MyPhone();
	 Allinfo.Password();
	 Allinfo.RePassword();
	 Allinfo.Continue();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mefta\\eclipse-workspace\\AutomationTraining\\src\\Drivers\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");		
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
