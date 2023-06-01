package SeleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static WebDriver driver;

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement retryingElement(By locator, int timeOut) 
	{
		WebElement element = null;
		int attempt = 0;
		while (attempt < timeOut) 
		{
			
			try {
				element = getElement(locator);
				System.out.println("Element Found--Be Happy! :)");
				break;
			} catch (NoSuchElementException e) {
				System.out.println("Element not found in Attempt :" + attempt);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

			attempt++;
		}
		
		if(element==null)
		{
			System.out.println("ELEMENT IS NOT FOUND BUDDY:...Change the approach");
		}
		return element;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		//By twitterLink = By.xpath("//a[contains(@href,'twitter')]");
		By facebookLink = By.xpath("//a[contains(@href,'facebook')]");
		retryingElement(facebookLink,20).click();
		System.out.println("Succesfully Clicked...");

	}

}
