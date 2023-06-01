package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1")
								.switchTo().frame("pact2")
									.switchTo().frame("pact3")
											.findElement(By.id("glaf")).sendKeys("Ash");
		
		
		
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("pact1");
		//First Crush Text Field
		driver.findElement(By.xpath("//input[@placeholder='First Crush']")).sendKeys("Old..");
		
		//Current Crush Text Field
		driver.switchTo().frame("pact2");
		driver.findElement(By.xpath("//input[@id='jex']")).sendKeys("New...");
		
		//Destiny Text Field
		//input[@id='glaf']
		//driver.switchTo().frame("pact3");
		//driver.findElement(By.xpath("//input[@id='glaf']")).sendKeys("Destiny Text Field..");
		
//		Thread.sleep(2000);
//		driver.switchTo().parentFrame();//Switched to Pact2 from Pact 3
//		driver.findElement(By.xpath("//input[@id='jex']")).sendKeys("  Sara");
//		
//		Thread.sleep(2000);
//		
//		driver.switchTo().parentFrame();//Switched to Pact2 from Pact 1
//		driver.findElement(By.xpath("//input[@placeholder='First Crush']")).sendKeys(" GRD");
//		
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		String a =driver.findElement(By.xpath("(//a[contains(@href,'selectorshub')])[3]")).getText();
		System.out.println(a);
		
		
		//a[contains(@href,'account/forgotten')]
		System.out.println("Last line of the program");
		
		
		
	}

}
