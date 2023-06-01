package SeleniumSessions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		// driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		https://naveenautomationlabs.com/opencart/index.php?route=account/login
//		 1.ID ->id is a unique attribute
		driver.findElement(By.name("firstname")).sendKeys("aswin");//entering first name //WORKING PERFECT
		driver.findElement(By.name("lastname")).sendKeys("kumar");//entering lastname  //WORKING PERFECT
		driver.findElement(By.name("agree")).click();

		// 2.name: name is not always unique attribute ,name can be duplicate
		driver.findElement(By.name("firstname")).sendKeys("aswin");//entering first name //WORKING PERFECT
		driver.findElement(By.name("lastname")).sendKeys("kumar");//entering lastname  //WORKING PERFECT
		driver.findElement(By.name("agree")).click();

		// 3.class name:-->It is not unique
		driver.findElement(By.className("form-control")).sendKeys("Aswin");

		// 4.X Path-->it is not an attribute.it is the address of the element in the
		// HTML DOM
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("QA");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Tester");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("testqatesteraustra@gmail.com");//Email
		
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("9999955555");//Telephone
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("@passP#");//Password
		driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("@passP#");//Password confirm
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();//click yes newsletter radiobutton
				driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();//click checkbox
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();//click button
//		
		// 5 .css selector:
		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Tk");
		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Khunwar");
		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();

		// 6.Link text:Only for links:
		driver.findElement(By.linkText("Login")).click(); //login 
		Thread.sleep(5000);
		driver.findElement(By.linkText("Forgotten Password")).click(); //forgotten password

		// 7.PartialLinktext:only for links:
		driver.findElement(By.partialLinkText(null));

		// ForgottenPasssword:
		// forgotten userid:

		// 8.Tag Name:html tag

		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println("header");
		if(header.equals("New Customer"))
		{
			System.out.println("PASS");
		}

		String RecurringPayment = driver.findElement(By.linkText("Recurring payments")).getText();
		System.out.println(RecurringPayment);

		By rp = By.linkText("Recurring payments");
		String text = doGetElementText(rp);
		System.out.println(text);
		
	}

	public static String doGetElementText(By locator) {
		return getElement(locator).getText();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	//https://naveenautomationlabs.com/opencart/index.php?route=account/success

}
