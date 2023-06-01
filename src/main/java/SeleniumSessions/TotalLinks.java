package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		int totalLinks = linkList.size();
		System.out.println(totalLinks);
//		for(int i=0;i<totalLinks;i++)
//		{
//			linkList.get(i);
//			String text =linkList.get(i).getText(); 
//			System.out.println(i+" "+text);
//		}
		// printing only links which has text in it
		for (int i = 0; i < totalLinks; i++) {
			linkList.get(i);
			String text = linkList.get(i).getText();
			if (text.length() > 0) {
				System.out.println(i + " " + text);
			}

		}

	}
	
	public static void getElements(By locator)
	{
		
		System.out.println(driver.findElements(locator));
	}

}
