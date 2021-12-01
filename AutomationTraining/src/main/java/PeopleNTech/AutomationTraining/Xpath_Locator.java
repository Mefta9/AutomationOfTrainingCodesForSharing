package PeopleNTech.AutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator {
	static WebDriver driver; //GLOBALLY DECLARING WEBDRIVER INTERFACE
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mefta\\eclipse-workspace\\AutomationTraining\\src\\Drivers\\chromedriver.exe"); 
		//CALLING CONSTRUCTOR OF CHROME DRIVE
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");		
		driver.manage().window().maximize(); // maximizing the page
		
		//Absolute Xpath
		WebElement userID=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
		userID.sendKeys("Meftah");
		
		//Relative Xpath
		WebElement loginB=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		loginB.click();
		
		/*
		WebElement password=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input"));
		password.sendKeys("123");*/
		
		/*
		WebElement loginB=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/button"));
		loginB.click();*/
		
		
	}

}
