package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetAndToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(co);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.get("https://www.google.com");
		
		
		driver.get("https://www.amazon.com");
		driver.navigate().back();
		driver.navigate().forward();

	}

}
