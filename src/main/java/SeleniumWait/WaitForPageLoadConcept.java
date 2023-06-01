package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoadConcept {

	static WebDriver driver;
	
	public static Boolean isPageLoaded(int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == \'complete\'")).
				toString();
		return Boolean.parseBoolean(flag);
	}
	
	public static void waitForPageLoad(int timeOut)
	{
		int attempt = 0;
		while(attempt<timeOut)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			String pageState = js.executeScript("return document.readyState").toString();
			System.out.println("THE PAGE STATE VALUE IS :"+pageState);
			String expectedState ="complete";
			if(pageState.equals(expectedState))
			{
				System.out.println("ATTEMPT: "+attempt);
				System.out.println("THE Page is Successfully loaded..Enjoy :PageState is "+pageState);
				break;
			}
			else
			{
				System.out.println("ATTEMPT :"+attempt);
				System.out.println("THE Page state is not loaded Guys...Dont worry...Try another time  .Current Page state is :"+pageState);
			}
			attempt++;
		}	
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		//driver.get("https://classic.crmpro.com/");
		driver.get("https://selectorshub.com/xpath-practice-page/");
//		waitForPageLoad(25);
		if(isPageLoaded(10))
		{
			System.out.println("THE Page is Fully loaded and ready to interact--Be Happy");
		}
		else
		{
			System.out.println("The Page is not loaded--But Dont Worry,Try Once Again :)");
		}
//		By forgotPwd = By.xpath("//a[text()='Forgot Password?']");
//		driver.findElement(forgotPwd).click();
//		System.out.println("The program over..");
		
		

	}

}
