package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElementsException {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		List<WebElement> panelLinks =driver.findElements(By.className("list-group-iiitem"));//Correct class name is "list-group-item"
//		System.out.println(panelLinks.size());
//		System.out.println("The program is over");
		
		By search = By.name("search");
		System.out.println(driver.findElement(search).isDisplayed());
		//driver.findElement(search).isDisplayed();

	}
	
	public static  boolean checkElementIsDisplayed(By locator)
	{
		List<WebElement> elelIst = driver.findElements(locator);
		if(elelIst.size()>0)
		{
			System.out.println(locator+ "Element is present on the page");
			return true; 
		}
		else
		{
			return false;
		}
		
	}

}
