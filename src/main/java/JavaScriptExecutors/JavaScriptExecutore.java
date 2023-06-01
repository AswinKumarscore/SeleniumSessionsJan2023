package JavaScriptExecutors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		
//		//WITHOUT JAVASCRIPT UTIL
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("return document.title").toString();
//		System.out.println(js.executeScript("return document.title").toString());
		//System.out.println("TITLE OF amazon is "+js);
		
		JavaScriptUtil obj = new JavaScriptUtil(driver);
		System.out.println("THE TITLE OF AMAZON PAGE: "+obj.getTitleByJS());
		
		System.out.println("NEXt is refreshing the browser  ---");
		Thread.sleep(5000);
		
		obj.refreshBrowserByJS();
		System.out.println("Refreshing the browser is done");
		
//		obj.scrollPageDown();
//		Thread.sleep(2000);
//		obj.scrollPageUp();
		
		//obj.generateConfirmPopUp("Hello! Buddy, This is the confirm POp Up");
		Thread.sleep(4000);
		
		WebElement d = driver.findElement(By.xpath("//h2[text()='For your Fitness Needs']"));
		obj.scrollIntoView(d);
		
		obj.horizontalScrollBy("-1000","-20000");
		
		
		
		
		

	}

}
