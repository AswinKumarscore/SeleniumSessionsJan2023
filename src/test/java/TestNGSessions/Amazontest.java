package TestNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazontest {
	WebDriver driver;
	//@BeforeMethod //get invoked every time before @Test method
	@BeforeTest //get invoked/called only one before @Test method
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");	
	}
	@Test(priority = 1)
	public void titleTest()
	{
		String title= driver.getTitle();
		System.out.println("THE Page Title is :"+title);
		Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
	}
	
	@Test(priority = 2)
	public void searchExistTest()
	{
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	//@AfterMethod()
	@AfterTest()
	public void tearDown()
	{
		driver.quit();
		
	}

}
