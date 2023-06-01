package SeleniumDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		By products = By.xpath("//select[@id='first']");
		By animals =	By.xpath("//select[@id='animals']");
//		doSelectDropDownByIndex(products, 1);
//		doSelectDropDownByIndex(animals, 1);
		
//		doSelectDropDownByValueAttribute(products,"Google");
//		doSelectDropDownByValueAttribute(animals,"big baby cat");
		
		doSelectDropDownByVisibleText(products,"Samsung");
		doSelectDropDownByVisibleText(animals,"Cat");

	}
	
	public static void doSelectDropDownByIndex(By locator,int index)
	{
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByVisibleText(By locator,String text)
	{
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectDropDownByValueAttribute(By locator,String value)
	{
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		
	}

}
