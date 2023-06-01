package Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		FirefoxDriver driver = new FirefoxDriver();
//		System.out.println("Mozilla Browser is Launched");
//		System.out.println("The Current title is "+driver.getTitle());
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://Amazon.com");
		String title = driver.getTitle();
		System.out.println("The Current title is "+driver.getTitle());
		
		if(title.contains("ore"))
		{
			System.out.println("The TEST CASE IS PASS--  ore is present in the Title");
		}
		else
		{
			System.out.println("TEST CASE FAIL-ore is not present in the Title");
		}
		
		
		
		
//		WebDriver driver1 = new ChromeDriver();
//		System.out.println("Chrome Browser is Launched");
//		driver1.get("https://Flipkart.com");
//		String title = driver1.getTitle();
//		System.out.println("The Title of the Current Page is "+title);
		
//		Thread.sleep(1000);
//		driver1 = new EdgeDriver();
//		System.out.println("Edge Browser is Launched");
//		driver1.get("https://Flipkart.com");
//		Thread.sleep(1000);
//		
//		driver1 = new FirefoxDriver();
//		System.out.println("Mozilaa Browser is Launched");
//		driver1.get("https://Flipkart.com");
//		Thread.sleep(1000);

	}

}
