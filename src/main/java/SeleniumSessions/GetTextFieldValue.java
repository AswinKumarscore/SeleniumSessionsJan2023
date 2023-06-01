package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//Formula in Selenium ==> First find the element + then Perform actions on it that you need to
		WebElement emailId = driver.findElement(By.id("input-email"));
		emailId.sendKeys("Test@gmail.com");
		emailId.getAttribute("value"); 
		System.out.println(emailId.getAttribute("value"));
		
		
		

	}

}
