package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class d {
	static WebDriver driver;

	public static void main(String[] args)
	{
//		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
//		//Preceding sibling:
//		By eMail = By.xpath("//input[@id='input-email']/preceding-sibling::label"); 
//		
//		By pwd = By.xpath("//input[@id='input-password']/preceding-sibling::label");
//		String text = driver.findElement(eMail).getText();
//		String passwordText = driver.findElement(pwd).getText();
//		System.out.println(text);
//		System.out.println(passwordText);
//		 
//		//following Sibling
//		//label[@for='input-email']/following-sibling::input[@id='input-email']
//		
//		String aswin ="Aswin Kumar";
//		System.out.println("'+"+aswin+"'");
		String aswin = "Hi I am Aswin Kumar,and I am from India and I belong to the world";
		String tanya =" Hi ,I belong to India ,I may be the person of earth";
		if(tanya.contains(aswin))
		{
			System.out.println("Aswin contains tanya! Haha Congratulations");
			
		}
		else
		{
			System.out.println("Not contains");
		}
		
		
		
		
	}

}
