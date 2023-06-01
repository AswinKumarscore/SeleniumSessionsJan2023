package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println("The Page title is :"+title);
		System.out.println(brUtil.getPageURL());
		
		By firstName 		= By.id("input-firstname");
		By lastName 		=By.id("input-lastname");
		By eMail 			=By.id("input-email"); 
		By telephone 		= By.id("input-telephone");
		By password 		=  By.id("input-password");
		By confirmPassword 	= By.id("input-confirm");

	}

}
