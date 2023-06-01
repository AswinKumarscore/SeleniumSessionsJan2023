package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By eMail = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By newsLetterRadio = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");//newsletterRadioButton
		By privacyCheckBox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

		By msgTag = By.tagName("h1");

		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(firstName, "Test");
		elUtil.doSendKeys(lastName, "QA");
		elUtil.doSendKeys(eMail, "testQA@gmail.com");
		elUtil.doSendKeys(telephone, "9999944444");
		elUtil.doSendKeys(password, "QWERT@321##");
		Thread.sleep(5000);
		elUtil.doSendKeys(confirmPassword, "QWERT@321##");
		Thread.sleep(5000);
		elUtil.doClick(newsLetterRadio);
		elUtil.doClick(privacyCheckBox);
		elUtil.doClick(continueButton);
		Thread.sleep(10000);

		String message = elUtil.doGetElementText(msgTag);
		if (message.equals("Your Account Has Been Created!")) {
			System.out.println("PASS-- USer account created successfully");
		} else {
			System.out.println("FAIL--User account creation FAILED");
		}

	}

}
