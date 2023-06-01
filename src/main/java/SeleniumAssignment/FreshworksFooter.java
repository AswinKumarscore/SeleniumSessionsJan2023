package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Fetch the following footer links:
//Legal,Privacy Notice,Site Terms,Cookie Policy,Do Not Share My Personal Information,Security,Accessibility
//,Unsubscribe,Sitemap
public class FreshworksFooter {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		Thread.sleep(3000);
		//For direct child-->/
		//For Indirect Child -->//
		
		List<WebElement> freshworksFooterList=driver.findElements(By.xpath("//ul[@class= 'sc-ace17a57-0 sc-b9382cdc-2 jurjFh iHWrdf']/li/a/span"));
		for(WebElement e:freshworksFooterList)
		{
			String text=e.getText();
			System.out.println(text);
			
			if(text.contains("Legal"));
			{
				System.out.println(text);
//				e.click();
//				break;
			}
			System.out.println();
		}
		
		//1st xpath-->//ul[@class= 'sc-ace17a57-0 sc-b9382cdc-2 jurjFh iHWrdf']/li
		//2nd path-->//ul[@class= 'sc-ace17a57-0 sc-b9382cdc-2 jurjFh iHWrdf']/li/a/span

	}

}
