package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsFullScrollingConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		System.out.println("Thread sleep 0f 8 seconds is done");
		Actions act = new Actions(driver);
		/*
		
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		act.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
		*/
		
		//TO REFRESH THE PAGE:
		//act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
//		act.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
		
		System.out.println("Refresh  ");
		driver.navigate().refresh();
		
		System.out.println("Yeah Program is over");
		//Naveen keys.command is working fine for windows
	}

}
