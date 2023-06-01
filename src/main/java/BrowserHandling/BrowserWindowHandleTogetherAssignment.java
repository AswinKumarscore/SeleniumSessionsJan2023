package BrowserHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogetherAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		Thread.sleep(3000);
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		System.out.println("Clicked Facebook link");
		System.out.println("URL is "+driver.getCurrentUrl());
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext())
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
		
/*
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		System.out.println("Clicked Facebook link");
		System.out.println("URL is "+driver.getCurrentUrl());
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		System.out.println("Clicked Twitter link");
		System.out.println("URL is "+driver.getCurrentUrl());
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		System.out.println("Clicked Youtube link");
		System.out.println("URL is "+driver.getCurrentUrl());
		Thread.sleep(2000);
		*/

	}

}
