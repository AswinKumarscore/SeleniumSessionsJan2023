package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co); 
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen(); //fullscreen is not working properly
		
//		String pgSource = driver.getPageSource();
//		System.out.println(pgSource);
//		System.out.println(pgSource.contains("body"));
		
		driver.navigate().refresh(); //used to refresh the page
		driver.get(driver.getCurrentUrl()); //used to refresh the page
		

	}

}
