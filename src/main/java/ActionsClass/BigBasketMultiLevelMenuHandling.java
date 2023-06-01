package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		Thread.sleep(3000);
		WebElement level1 = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(level1).build().perform();
		Thread.sleep(3000);
		
		WebElement level2 = driver.findElement(By.xpath("(//a[text()='Beverages'])[2]"));
		act.moveToElement(level2).build().perform();
		Thread.sleep(3000);
		WebElement level3 = driver.findElement(By.linkText("Tea"));
		
		act.moveToElement(level3).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Tea Bags")).click();
		
		System.out.println("program over");
		
		
		
		

	}

}
