package PeopleNTech.AutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	static WebDriver driver; //GLOBALLY DECLARING WEBDRIVER INTERFACE
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mefta\\eclipse-workspace\\AutomationTraining\\src\\Drivers\\chromedriver.exe"); 
		//CALLING CONSTRUCTOR OF CHROME DRIVE
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");		
		driver.manage().window().maximize(); // maximizing the page

		
		//ID
		WebElement SearchIcon=driver.findElement(By.id("nav-search-submit-button"));  
		SearchIcon.click();
		
		
		//linktext
		WebElement bestsellers=driver.findElement(By.linkText("Best Sellers"));  
		bestsellers.click();
		
		
		//Partial linktext
		WebElement PLinkText=driver.findElement(By.partialLinkText("Epic"));  
		PLinkText.click();
		
		
		//Name 
		WebElement Searchfield=driver.findElement(By.name("field-keywords"));  
		Searchfield.sendKeys("PC Mouse");

		WebElement SearchIcon1=driver.findElement(By.id("nav-search-submit-button"));  
		SearchIcon1.click(); // click on serch bar after the text
		
		
		
		
	}

}
