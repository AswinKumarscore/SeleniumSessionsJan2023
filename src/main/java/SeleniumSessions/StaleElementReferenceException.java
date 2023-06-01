package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
      static WebDriver driver;
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By elem = By.name("firstname");
		WebElement ele = driver.findElement(By.name("firstname"));
		
		//
//		ele.sendKeys("Rohit");
//		driver.navigate().refresh();
//		ele.sendKeys("Rohit Sharma");
		
		
		//
		getElement(elem).sendKeys("Rohit");
		Thread.sleep(3000);
		System.out.println("Rohit Entered??");
		driver.navigate().refresh();
		getElement(elem).sendKeys("Sharma");
		System.out.println("Sharma Entered ??");

	}

}
