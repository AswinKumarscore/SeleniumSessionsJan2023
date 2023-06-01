package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		// TODO Auto-generated method stub
		By username = By.name("username");
		By forgotPwd = By.linkText("Forgot Password?");
		
//		WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(0));
//		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		WebElement forgotPwd_ele = wait.until(ExpectedConditions.presenceOfElementLocated(forgotPwd));
//		username_ele.sendKeys("Test@gmail.com");
//		forgotPwd_ele.click();
		
		waitForElementVisible(username, 10).sendKeys("test123@gmail.com");
		System.out.println("PROGRAM OVER");
		
		
		//Rought work
//		WebDriverWait obj = new WebDriverWait(driver,Duration.ofSeconds(10));
//		obj.until(ExpectedConditions.)
		
		
	}
	
	/**
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator,int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementVisible(By locator,int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement waitForElementVisiblePolling(By locator,int timeout)
	{
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		WebDriverWait wait = new WebDriverWait(driver, null, null)
		WebDriver
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void clickElementWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 wait.until(ExpectedConditions.elementToBeClickable(locator)).click();;

	}
	
	WebDriverWait obj = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	
	
	

}
