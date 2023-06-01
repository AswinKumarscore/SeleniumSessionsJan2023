package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForURL {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.get("https://classic.crmpro.com/");

		By forgotPwdLink = By.linkText("Forgot Password?");
		By pricing = By.linkText("Pricing");
		
		String fullURL = "https://classic.freecrm.com/login.cfm?pr=1";
		String partialURLValue = "classic.freecrm";
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.clickElementWhenReady(forgotPwdLink,10);
		waitForURLAndCaptureFullUrl(fullURL, 10);
		//waitForURLAndCaptureUrlContains(partialURLValue,10);

	}
	
	public static String waitForURLAndCaptureFullUrl(String urlValue, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlToBe(urlValue)))
		{
			String url = driver.getCurrentUrl();
			System.out.println("Current URL of Page is :"+url);
			System.out.println("TEST PASS");
			return url;
		}
		else
		{
			System.out.println("URL is not present with the gicen timeout :" +timeOut);
			System.out.println("TEST-- FAIL");
			return null;
		}
		
		
	}
	
	public static String waitForURLAndCaptureUrlContains(String partialUrlValue, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		
		if(wait.until(ExpectedConditions.urlContains(partialUrlValue)))
		{
			String url = driver.getCurrentUrl();
			System.out.println("Current URL of Page is :"+url);
			System.out.println("TEST PASS--Partial URL value is correct");
			return url;
		}
		else
		{
			System.out.println("URL is not present with the gicen timeout :" +timeOut);
			System.out.println("TEST-- FAIL");
			return null;
		}
		
		
	}


}
