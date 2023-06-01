package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandleCrm {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(12000);

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click(); // Contacts link text in HTML DOM but CONTACTS is
																// present/displayed in UI
//		selectContact("Ali khan");
//		selectContact("Bima P");
//		selectContact("deepti gupta");
//		Thread.sleep(2000);
//		getUserDetails("Ali khan");
		// driver.findElement(By.xpath("//a[text()='Contacts']")).click(); //This XPath
		// will also work successfully
		selectMultipleSameContacts("Ali khan");
		selectMultipleSameContacts("deepti gupta");
	}

	public static void getUserDetails(String userName) {
		List<WebElement> userDetailsList = driver.findElements(By.xpath("(//td/a[text()='" + userName
				+ "']/parent::td/preceding-sibling::td/input[@type='checkbox'])[1]/parent::td/following-sibling::td"));
		System.out.println("USER DETAILS---OF "+userName);
		for (WebElement e : userDetailsList) {
			String text = e.getText();
			System.out.println(text);
		}
	}
	
	public static void selectContact(String userName)
	{
		driver.findElement(By.xpath("//td/a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		//td/a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']
	}
	
	public static void selectMultipleSameContacts(String contactName)
	{
		//create a list "contactsChecks" and store the duplicate value in the list and click multiple
		//single contacts
		List<WebElement> contactsChecks=driver.findElements(By.xpath("//td/a[text()='"+contactName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e: contactsChecks)
		{
			String text = e.getText();
			e.click();
		}
	}
	
	public static void getContactCompanyName(String contatctName)
	{
		
	}

	public void unWantedMethod() {
		// td/a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']
		// (//td/a[text()='Ali
		// khan']/parent::td/preceding-sibling::td/input[@type='checkbox'])[1]/parent::td/following-sibling::td

		// (//td/a[text()='Ali
		// khan']/parent::td/preceding-sibling::td/input[@type='checkbox'])[1]/parent::td/following-sibling::td
	}

}
