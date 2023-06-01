package Preparation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		String currentWindowID =driver.getWindowHandle();
		
		System.out.println("The Current window ID is "+currentWindowID);

		By searchTextBoxLocatorAmazon = By.name("field-keywords");
		By searchButtonLocatorAmazon = By.xpath("//input[@type='submit']");
		driver.findElement(searchTextBoxLocatorAmazon).sendKeys("Choclate");
		Thread.sleep(4000);
		driver.findElement(searchButtonLocatorAmazon).click();
		Thread.sleep(4000);
		String currentWindowID1 =driver.getWindowHandle();
		System.out.println("The current window ID is "+currentWindowID1);
		By itemsXPath = By.xpath("//div[@class='a-row a-size-small']/parent::div/parent::div//h2");
		Thread.sleep(4000);
		//div[@class='a-row a-size-small']/parent::div/parent::div//h2
		       List<WebElement> itemsList=driver.findElements(itemsXPath);
		       for(WebElement e:itemsList)
		       {
		    	   String text = e.getText();
		    	   System.out.println(text);
		    	   System.out.println();
		    	   e.click();
		    	   break;
		       }

		

	}

}
