package BrowserHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {
	/*
	 * Steps:
	 * 1)launch browser
	 * 2)launch Flipkart/Amazon/Google(or Any Website)url
	 * 3)switch to new window using blank tab
	 * 4)Launch any url in new window/tab and get title of it
	 * 5)Finally Switch back to Parent window and get the URL of it
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		String ParentWindowId = driver.getWindowHandle();
		driver.get("https://Amazon.com");
		
		//   driver.switchTo().newWindow(WindowType.TAB);  //Opens a blank tab
		  driver.switchTo().newWindow(WindowType.WINDOW);//Opens a new WINDOW
		Thread.sleep(3000);
		driver.get("https://Flipkart.com");
		Thread.sleep(3000);
		System.out.println("Current Window title is "+driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentWindowId);
		System.out.println("Current Window Title is "+driver.getTitle());
		
		System.out.println("THE PROGRAM OVER SUCCESSFULLY");
		

	}

}
