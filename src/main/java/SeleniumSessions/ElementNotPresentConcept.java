package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresentConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
//		driver.findElement(By.id("twotabsearchtextbox11")).sendKeys("Macbook");
		//NoSuchElementException -->is the valid exception in selenium
		//ElementNotFound Exception -- not in selenium
		//thread.sleep(5000) -->it is a static wait
		By search = By.id("twotabsearchtextbox");
		getElement(search);

	}
	
	public static WebElement getElement(By locator)
	{
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			System.out.println("Element is found Successfully,be Happy Aswin");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is not found using this locator ...."+locator);
			try {
				Thread.sleep(5000); 
			}
			catch(InterruptedException e1)
			{
				e1.printStackTrace();
			}
			element = driver.findElement(locator);
			System.out.println("The locator is present in DOM");
			
		}
		return element;
		
	}
	

}
