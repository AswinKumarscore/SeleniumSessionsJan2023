package JavaScriptAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// ALERT popup
	
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		System.out.println(alertText);
		//alert.accept();
		alert.dismiss();
		System.out.println("Program over");
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		/*
		//CONFIRM ALERT
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert = 	driver.switchTo().alert();
		Thread.sleep(3000);
		String confirmAlertText = alert.getText();
		System.out.println(confirmAlertText);
		
		//alert.accept();
		alert.dismiss();
		Thread.sleep(3000);
		
		
		//js pROMPT POPUP
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		String promptAlertText = alert.getText();
		System.out.println(promptAlertText);
		alert.accept();
		
		*/
		
		

	}

}
