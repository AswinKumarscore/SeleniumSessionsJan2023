package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysClickConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(2000);
		By emailId = By.name("email");
		WebElement eemailID = driver.findElement(emailId);
		By password = By.name("password");	
		WebElement ppassword  = driver.findElement(password);
		By loginBtn = By.xpath("//div/following-sibling::input[@type='submit']");
		WebElement lloginBtn  = driver.findElement(loginBtn);
		
		Actions act = new Actions(driver);
		act.sendKeys(eemailID,"aaa@gmail.com").build().perform();
		act.sendKeys(ppassword,"@#***jbfcjbcj").build().perform();
		
		Thread.sleep(2000);
		act.click(lloginBtn).build().perform();
				
		
		

	}

}
