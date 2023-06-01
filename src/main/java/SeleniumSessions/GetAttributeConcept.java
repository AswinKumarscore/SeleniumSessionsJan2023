package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String namePlaceholder =driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(namePlaceholder);
//		//input-lastname
//		
//		String lastnamePlaceholder =driver.findElement(By.id("input-lastname")).getAttribute("placeholder");
//		System.out.println(lastnamePlaceholder);
//		//input-email
//		String emailPlaceholder =driver.findElement(By.id("input-email")).getAttribute("placeholder");
//		System.out.println(emailPlaceholder);
//		//input-password
//		String passwordPlaceholder = driver.findElement(By.id("input-password")).getAttribute("placeholder");
//		System.out.println(passwordPlaceholder);
		By fn = By.id("input-firstname");
		By loginLink = By.linkText("Login");
		String fname = doGetAttributValue(fn,"placeholder");
		String firstNameType = doGetAttributValue(fn, "type");
		String hrefValue = doGetAttributValue(loginLink,"href");
		System.out.println(hrefValue);
		System.out.println("The firstname placeholder is "+fname);
		System.out.println("The firstname type  is "+firstNameType);
	//<a href="https://naveenautomationlabs.com/opencart/index.php?route=account/login" class="list-group-item">Login</a>
		//https://naveenautomationlabs.com/opencart/index.php?route=account/login
		if(fname.equals("FirstName"))
		{
			System.out.println("PASS--correct placeholder value");
		}
		else
		{
			System.out.println("FAIL--Incorrect placeholder value");
		}
		
		


	}
	
	public static String doGetAttributValue(By locator,String attrName)
	{
		return getElement(locator).getAttribute(attrName);
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

}
