package JavaScriptExecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClickAndSendKeys {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='persistent']")).click();
		
		//js.executeScript("arguments[0].click();", element);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//input[@id='persistent']")); 
		js.executeScript("arguments[0].click();", ele);
		System.out.println("Program Sucess");
	}

}
