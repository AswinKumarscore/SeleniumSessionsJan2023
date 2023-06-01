package BrowserHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowhandleTogetherNaveen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent page
		Thread.sleep(3000);
		String parentWindowId = driver.getWindowHandle();
		System.out.println("The Parent window ID is " + parentWindowId);

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		System.out.println("Clicked Linkedin link");

		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		System.out.println("Clicked Facebook link");

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		System.out.println("Clicked Twitter link");

		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		System.out.println("Clicked Youtube link");

		Set<String> windowHandlesID = driver.getWindowHandles();

		Iterator<String> it = windowHandlesID.iterator();
		while (it.hasNext())
		{

			String windowId = it.next();
			driver.switchTo().window(windowId);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(1000);
			if(!windowId.equals(parentWindowId))
			{
				driver.close();
			}
			
		}
		
		//System.out.println("The Current Window url is "+driver.getCurrentUrl());
		driver.switchTo().window(parentWindowId);
		System.out.println("The Current Url is "+driver.getCurrentUrl());

	}

}
