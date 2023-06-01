package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollingConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		System.out.println("PAGE SCROLLING DOWN IS DONE---");
		
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		System.out.println("PAGE UP SCROLLING  IS DONE---");

	}

}
