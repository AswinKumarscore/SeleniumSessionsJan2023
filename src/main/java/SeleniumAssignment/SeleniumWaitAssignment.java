package SeleniumAssignment;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SeleniumWaitAssignment {
	/*
	 * https://naveenautomationlabs.com/opencart/index.php?route=account/register
	 * Fill the Form with help of Selenium Wait -Explicit wait and Fill with form And Verify the Success message after the Successful registration:
	 */
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstName = By.name("firstname");
		By lastName = By.name("lastname");
		By eMail = By.name("email");
		By telephone = By.name("telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By newsletterSubscribe = By.xpath("//input[@name='newsletter'and@value='1']");
		
		By privacypolicyCheckbox = By.xpath("//input[@name='agree']");
		By continueButton = By.xpath("//input[@type='submit']");		

		waitForElementVisible(firstName, 10).sendKeys("Rishi");
		waitForElementVisible(lastName, 3).sendKeys("Sunak");
		waitForElementVisible(eMail, 0).sendKeys("rishisunak21.pm@uk.gov.uk");
		waitForElementVisible(telephone, 0).sendKeys("9999923456");
		waitForElementVisible(password, 0).sendKeys("@#$%^!Pass");
		waitForElementVisible(confirmPassword, 0).sendKeys("@#$%^!Pass");

		clickElementWhenReady(newsletterSubscribe, 2);
		clickElementWhenReady(privacypolicyCheckbox, 2);
		clickElementWhenReady(continueButton, 2);

		String ExpectedText = "Your Account Has Been Created!";
		String ExpectedURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/success";
		String expectedTitle = "Your Account Has Been Created!";

		By titleXPath = By.xpath("//div/h1[text()='Your Account Has Been Created!']");

		String actualText = driver.findElement(titleXPath).getText();

		waitForTitleIsAndCapture(expectedTitle, 3);

		if (actualText.equals(ExpectedText)) {
			System.out.println("TEST--Pass Account is created");
		} else {
			System.out.println("TEST--FAIL...Account is not created");
		}

	}

	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void clickElementWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	public static String waitForTitleIsAndCapture(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
			String title = driver.getTitle();
			System.out.println("TITLE VALUE IS:  " + title);
			return title;
		} else {
			System.out.println("title is not present within the given timeout : " + timeOut);
			return null;
		}
	}

}