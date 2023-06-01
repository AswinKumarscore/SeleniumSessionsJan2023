package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Program working correctly as on April 27,2023 12PM
public class TabSequencingAmazon {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
	
		act.sendKeys(Keys.TAB)
				.pause(1000)
			.sendKeys(Keys.TAB)
			.pause(1000)
			 	.sendKeys(Keys.TAB)
			 	.pause(1000)
			 		.sendKeys(Keys.TAB)
			 		.pause(1000)
			 			.sendKeys(Keys.TAB)
			 			.pause(1000)
			 				.sendKeys("Toy")
			 				.pause(1000)
			 				   .sendKeys(Keys.ENTER)
			 				   .build().perform();
			 				   
		System.out.println("The program is over");
	}

}
