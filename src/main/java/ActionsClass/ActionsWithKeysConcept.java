package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeysConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(2000);
		
		By firstName = By.id("input-firstname");
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(firstName),"Robin")
						.sendKeys(Keys.TAB)
						.pause(1000)
						.sendKeys("Sharma")
						.pause(1000)
						.sendKeys(Keys.TAB)
						.sendKeys("Robinmaster345@gmail.com")
						.pause(1000)
						.sendKeys(Keys.TAB)
						.sendKeys("9999934567")
						.pause(1000)
						.sendKeys(Keys.TAB)
						.sendKeys("123@345@321")
						.pause(1000)
						.sendKeys(Keys.TAB)
						.sendKeys("123@345@321")
						.pause(1000)
						.sendKeys(Keys.TAB)  // this is for newletter NO TAB
						.pause(1000)
						.sendKeys(Keys.TAB) // privacy policy tab
						.pause(1000)
						.sendKeys(Keys.TAB)
						.pause(2000)
						.click()  // privacy policy checkbox tab
						.pause(2000) 
						.sendKeys(Keys.TAB) //FINAL CLICK BUTTON
						.build().perform();
						
		
	}

}
