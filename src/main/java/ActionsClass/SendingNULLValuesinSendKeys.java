package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingNULLValuesinSendKeys {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.Amazon.com/");
		Thread.sleep(2000);
//		driver.findElement(By.name("field-keywords")).sendKeys("Camp cola");
		driver.findElement(By.name("field-keywords")).sendKeys("Camp "+ "Cola "+ "Reliance");
		

	}

}
