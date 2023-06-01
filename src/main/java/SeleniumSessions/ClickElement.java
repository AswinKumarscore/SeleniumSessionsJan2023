package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElement {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		By email = By.id("username");
		By Password = By.id("password");
		By button = By.id("loginBtn");
		getElement(email);
		// Formula -->Create web element + perform action
		doSendKeys(email, "test123@gmail.com");
		doSendKeys(Password, "@123Fert");
		doClear(email);
		doSendKeys(email, " rever@gmail.com");
		doClick(button);

	}

	// Formula -->Create web element + perform action

	// getWebElement method
	
	public static void doClear(By locator)
	{
		getElement(locator).clear();
		
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public static WebElement getElement(By locator) {
		// System.out.println("Lets see what out put this gives
		// "+driver.findElement(locator));
		return driver.findElement(locator);
	}

}
