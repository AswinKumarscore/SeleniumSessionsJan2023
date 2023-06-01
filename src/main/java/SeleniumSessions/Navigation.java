package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co); 
		
		
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle()); //Amazon.com. Spend less. Smile more.
		
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());  //Google
		
		driver.navigate().back();
		System.out.println(driver.getTitle());//Amazon.com. Spend less. Smile more.
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());//Google
		
		driver.navigate().back();
		System.out.println(driver.getTitle());//Amazon.com. Spend less. Smile more.
		

	}

}
