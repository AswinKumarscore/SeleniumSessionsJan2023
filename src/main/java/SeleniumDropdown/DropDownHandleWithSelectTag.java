package SeleniumDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelectTag {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		Thread.sleep(3000);
		By country = By.id("Form_getForm_Country");
		WebElement countryEle = driver.findElement(country);
		
		Select select = new Select(countryEle);
		//select.selectByIndex(2);
		
		//select.selectByIndex(5);
		//Select using visible text:
		//select.selectByVisibleText("Australia");
		select.selectByValue("India");
		
	}

}
