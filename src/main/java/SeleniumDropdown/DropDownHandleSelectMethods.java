package SeleniumDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleSelectMethods {
	static WebDriver driver;
	public static void main(String [] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		
		By week = By.id("select-demo");
		By state = By.id("multi-select");
		
		WebElement weekEle = driver.findElement(week);
		WebElement stateEle = driver.findElement(state);
		
		Select select1 = new Select(stateEle);
		System.out.println(select1.isMultiple());
		
		
		Select select2 = new Select(weekEle);
		
		System.out.println(select2.isMultiple());
		System.out.println("program over");
		
		select1.selectByVisibleText("California");
		select1.selectByVisibleText("Texas");
		select1.selectByVisibleText("Florida");
		
		List<WebElement>allStateSelectList=select1.getAllSelectedOptions();
		System.out.println("All selected options are ");
		for(WebElement e:allStateSelectList)
		{
			System.out.println(e.getText());
		}
		Thread.sleep(3000);
		
		select1.getFirstSelectedOption();
		select1.getAllSelectedOptions();
		System.out.println("The first selected option "+select1.getFirstSelectedOption().getText());
		
		select1.deselectByVisibleText("Texas");
		System.out.println();
		Thread.sleep(3000);
		select1.deselectAll();
		
		

		
		
		
		
		//Assignment:create a utlity for finding the list of the element which is selected?
		
	}
	
	public void getAllSelectedOptions(By locator)
	{
		
	}

}
