package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doClick(twitterLink, 15);
		
		if(waitForTotalWindows(3, 5))
		{
			System.out.println("TEST --PASS");
		}
		else
		{
			System.out.println("TEST--FAIL");
		}

	

	}
	
	public static boolean waitForTotalWindows(int totalWindowsToBe,int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindowsToBe));
	}

}
