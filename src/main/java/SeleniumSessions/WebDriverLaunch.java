package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLaunch {
	public static void main(String [] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver1.get("https://www.amazon.com");
		//Use cases for multiple browser launch
		//admin and user profile
		//if admin has made some change--to verify if the change is reflecting in user tab
		//two browsers can be launched
		
	}

}
