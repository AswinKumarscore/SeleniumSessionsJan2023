package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartPageTest {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = brUtil.getPageTitle();
		System.out.println("The Page title is :"+title);
		System.out.println(brUtil.getPageURL());
		
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(email, "test@gmail.com");
		elUtil.doSendKeys(pwd, "q@w#!");
		Thread.sleep(5000);
		brUtil.closeBrowser();

	}

}
