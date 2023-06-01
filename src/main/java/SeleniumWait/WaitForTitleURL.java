package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		//driver.get("https://classic.freecrm.com/");
		driver.get("https://classic.crmpro.com/");
		
		By forgotPwdLink = By.linkText("Forgot Password?");
		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.clickElementWhenReady(forgotPwdLink,5);
		eleUtil.clickElementWhenReady(forgotPwdLink,15);
		
		System.out.println("Forgot pwd link is clicked");
		
		waitForFullTitleAndCapture("CRMPRO Log In Screen",15);
		//String title = waitForTitleIsAndCapture("Log in",25);
//		waitForTitleAndCapture("Log in",5);
//		System.out.println(waitForTitleAndCapture("Log in",20));
//		System.out.println(waitForTitleAndCapture("Log in",15));
		
	
	}
	
	public static String waitForTitleIsAndCapture(String titleFraction,int timeOut)
	{
		System.out.println("iNSIDE waitForTitleAndCapture mETHOD ");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleContains(titleFraction)))
		{
			System.out.println("Inside IF Condition");
			String title = driver.getTitle();
			System.out.println("TEST PASS-------The Title of the page  is"+title);
			return title;
		}
		else
		{
			System.out.println("TEST FAIL-------");
			System.out.println("Title is not present within the given timeout: "+timeOut);
			return null;
		}
		
	}
	
	
	public static String waitForFullTitleAndCapture(String fullTitle,int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleIs(fullTitle)))
		{
			String title = driver.getTitle();
			System.out.println("TEST-PASS");
			return title;
			
		}
		else
		{
			System.out.println("The Required Title is not present with the given timeout"+timeout);
			System.out.println("TEST-FAIL");
			return null;
			
		}
	}

}
