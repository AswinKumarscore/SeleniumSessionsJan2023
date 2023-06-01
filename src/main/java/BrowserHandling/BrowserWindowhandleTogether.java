package BrowserHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowhandleTogether {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		System.out.println("Clicked Linkedin link");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		System.out.println("Clicked Facebook link");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		System.out.println("Clicked Twitter link");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		System.out.println("Clicked Youtube link");
		Set<String> windowHandlesID=driver.getWindowHandles();
		System.out.println("The Size of Window handles "+windowHandlesID.size());
		
		Iterator<String> id = windowHandlesID.iterator();
		  System.out.println("1st"+id.next());
		  System.out.println("2nd"+id.next());
		  System.out.println("3rd"+id.next());
		  System.out.println("4th"+id.next());
		  System.out.println("5th"+id.next());
		  //System.out.println("6th"+id.next());
		
	}

}
