package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConceptAswin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//locators concept using by name for registration
		By name = (By.name("firstname"));//firstname
		driver.findElement(By.name("firstname")).sendKeys("aswin");//entering first name //WORKING PERFECT
		driver.findElement(By.name("lastname")).sendKeys("kumar");//entering lastname  //WORKING PERFECT
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");//entering email  //WORKING PERFECT
		driver.findElement(By.name("telephone")).sendKeys("9999944444");//entering telephone  //WORKING PERFECT
		driver.findElement(By.name("password")).sendKeys("Test#66HYT");//entering password //WORKING PERFECT
		driver.findElement(By.name("confirm")).sendKeys("Test#66HYT");//entering password confirm  //WORKING PERFECT
		driver.findElement(By.name("newsletter")).click();//clicking newsletter yes //WORKING CORRECTLY BUT MAY NOT WORK ALL THE TIME
		driver.findElement(By.name("agree")).click();//CLICKING checking checkbox privacy policy ////WORKING CORRECTLY BUT MAY NOT WORK ALL THE TIME
		driver.findElement(By.name("")).sendKeys("aswin");//clicking continue //CLICKING THE CONTINUE BUTTON //NO NAME LOCATOR AVAILABLE FOR CONTINUE BUTTON
      
		
		Thread.sleep(5000);
//		driver.close();
		

	}

}
