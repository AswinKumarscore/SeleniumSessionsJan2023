package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		//testing is happening behind the scene
		//faster
		//can be helpful in linux machine
		//can be used with CI CD Pipeline--Jenkins,GithubActions,Aws
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--incognito");
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		 //co.addArguments("--incognito");
		
		ChromeDriver driver1 = new ChromeDriver(co);
		driver1.get("https://www.amazon.com");
		System.out.println(driver1.getTitle());
		

	}

}
