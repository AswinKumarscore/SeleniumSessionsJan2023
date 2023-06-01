package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		By twitterLink = By.xpath("///a[contains(@href,'twitterR')]");
		
		//Fluent wait returns current class object
		//Hence we can use builder pattern
		
		//Top Casting--When child class object is refered by parent class class reference variable
		// or Interface reference variable then it is known as topcasting
		//Wait wait = new FluentWait(driver);
		/* FLUENT WAIT IMPLEMENTATION
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				                       .withTimeout(Duration.ofSeconds(10))
				                       .ignoring(NoSuchElementException.class)
				                       .ignoring(ElementNotInteractableException.class)
				                       .pollingEvery(Duration.ofMillis(1000))
				                       .withMessage("-----------------Time out is done.....Element not Found Aswin!!  ....");
		 wait.until(ExpectedConditions.elementToBeClickable(twitterLink)).click();
		 System.out.println("The Program is over ");
		 
		 
		 */
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		 WebDriverWait obj = new WebDriverWait(driver,Duration.ofSeconds(4), null);
		 wait.ignoring(NoSuchElementException.class)
		 .ignoring(InvalidSelectorException.class)
		 .ignoring(NoSuchWindowException.class)
		 .pollingEvery(Duration.ofSeconds(1))
		 .withMessage("---time out is done...element is not found....")
		 .until(ExpectedConditions.elementToBeClickable(twitterLink)).click();
		 
		 System.out.println("Program Over");
		
		
				                       
				                       
		
		
	}

}
