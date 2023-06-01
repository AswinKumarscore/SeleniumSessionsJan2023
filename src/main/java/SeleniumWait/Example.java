package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
		
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By forgotPwdLink = By.linkText("Forgot Password?");
		By pricing = By.linkText("Pricing");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickElementWhenReady(forgotPwdLink, 10);

		String title = waitForTitleIsAndCaptureN("Log In", 5);
		System.out.println();
		System.out.println(title);

	}
	
	//NAVEEN CODE
	public static String waitForTitleIsAndCaptureN(String titleFraction, int timeOut)
	{
		System.out.println("NAVEEN CODE");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.titleContains(titleFraction)))
		{
			String title = driver.getTitle();
			System.out.println("tHE tITLE VALUE INSIDE WAITFORTITLEISANDCAPTURE IS "+title);
			return title;
		} 
		else
		{
			System.out.println("title is not present within the given timeout : " + timeOut);
			return null;
		}
	}
	
	
	//ASWIN CODE
	public static String waitForTitleIsAndCaptureA(String titleFraction,int timeOut)
	{
		System.out.println("ASWIN CODE");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleContains(titleFraction)))
		{
			
			String title = driver.getTitle();
			System.out.println("The Title of the page  is"+title);
			return title;
		}
		else
		{
			System.out.println("Title is not present within the given timeout: "+timeOut);
			return null;
		}
		
	}

}
