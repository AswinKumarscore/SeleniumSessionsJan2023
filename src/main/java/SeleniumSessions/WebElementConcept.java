package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();//session id:123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// create a webelement + perform action (click,sendKeys,getText,isDisplayed..)
		// findElement() + Click(),sendKeys();

		// 1st Approach
//		driver.findElement(By.id("input-email")).sendKeys("test543@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("!@AScII@123");

		// 2nd
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		emailId.sendKeys("test543@gmail.com");
//		password.sendKeys("New@21");

		// 3rd:By Locator:
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		WebElement emailId =  driver.findElement(email);
//		WebElement password =driver.findElement(pwd);
//		emailId.sendKeys("test543@gmail.com");
//		password.sendKeys("New@21");

		// 4th Approach:By locator and create generic function to create a web element
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		WebElement emailId=  getElement(email);
//		WebElement password =getElement(pwd);
//		
//		emailId.sendKeys("test543@gmail.com");
//		password.sendKeys("New@21");

		// 5th approach:By locatore and create generic functions for webelement and
		// action
//		 	By email = By.id("input-email");
//			By pwd = By.id("input-password");
//			Thread.sleep(5000);
//			doSendKeys(email,"test543@gmail.com");
//			doSendKeys(pwd,"New@21");
			
		//6th:By locator and create generic functions for webelement and action in util class
			By email = By.id("input-email");
			By pwd = By.id("input-password");
			ElementUtil eleUtil = new ElementUtil(driver);//session id:123
			eleUtil.doSendKeys(email,"test543@gmail.com");
			eleUtil.doSendKeys(pwd,"New@21");
			

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
