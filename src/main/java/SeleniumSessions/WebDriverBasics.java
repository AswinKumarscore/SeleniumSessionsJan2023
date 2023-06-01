package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// chrome//firefox/Safari
		// chrome 111.x
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		// ChromeDriver driver = new ChromeDriver(co);
		// FirefoxDriver driver = new FirefoxDriver();
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver(co); // Interface//Interface//child class object is created using topcast using Interface

		driver.get("https://www.amazon.com");
		String cPath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.out.println(cPath);
		// driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		//verification point/checkpoint/act vs exp result
		if(title.contains("Amazon.com"))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.quit();//close the browser
		driver.close();//close the browser
		//Automation Steps + verification point = automation steps; 
//assignment do topcasting for chrome,firefox and safari browser

	}

}
