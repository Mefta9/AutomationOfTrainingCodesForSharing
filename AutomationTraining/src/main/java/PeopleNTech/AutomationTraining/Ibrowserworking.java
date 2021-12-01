package PeopleNTech.AutomationTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowserworking {

	static WebDriver driver; //GLOBALLY DECLARING WEBDRIVER INTERFACE
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//HOW TO OPEN THE BROWSER - NEED WEBDRIVER INTERFACE
	// below set property ACEPTING 2 ARGUMENTS(KEY & VALUE), VALUE IS THE LOCATION/PATH OF WEBDRIVER.
	//note:NULL IS STRING DATATYPE.
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mefta\\eclipse-workspace\\AutomationTraining\\src\\Drivers\\chromedriver.exe"); 
		
	//CALLING CONSTRUCTOR OF CHROME DRIVE
	driver = new ChromeDriver();
		
	driver.navigate().to("https://www.amazon.com");		
	driver.manage().window().maximize(); // maximizing the page
	
	Thread.sleep(6000); // pause for 6 seconds added interrupedExceoption after main method above
	driver.navigate().refresh(); //Refresh
	Thread.sleep(6000); 
	driver.navigate().back(); //Going back
	Thread.sleep(6000); 
	driver.navigate().forward(); // going forward
	Thread.sleep(6000);
	
	//WINDOW HANDLE - String datatype
	String windowhandle = driver.getWindowHandle();// created a new object for window handle (unique ID)
	System.out.println(windowhandle); // PRINTING UNIQUE ID/WINDOW HANDLE.
	
	String urlofBrowser= driver.getCurrentUrl(); // GETTING URL
	System.out.println(urlofBrowser); // PRINTING URL
	
	/*close the website: close will close only 1 window, 
	quit will close all windows of the browser*/
	driver.close();
	

	
	
	}

}
