package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		String alertText = alertJSGetText(3);
		System.out.println("The TExt present in Alert Pop up is "+alertText);
		alertDismiss(3);
		//alertAccept(3);

	}

	public static Alert waitForAlertJsPopUp(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static String alertJSGetText(int timeOut)
	{
		return waitForAlertJsPopUp(timeOut).getText();
	}
	
	public static void alertAccept(int timeOut)
	{
		 waitForAlertJsPopUp(timeOut).accept();
	}
	
	public static void alertDismiss(int timeOut)
	{
		 waitForAlertJsPopUp(timeOut).dismiss();
	}
	
	public static void EnterAlertValue(int timeOut,String value)
	{
		 waitForAlertJsPopUp(timeOut).sendKeys(value);
		 
	}

}
