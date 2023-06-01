package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameChainingConcept {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1")
								.switchTo().frame("pact2")
									.switchTo().frame("pact3")
											.findElement(By.id("glaf")).sendKeys("Ash");

}
}
