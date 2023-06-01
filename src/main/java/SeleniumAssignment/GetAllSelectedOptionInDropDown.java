package SeleniumAssignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionInDropDown {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		
		By week = By.id("select-demo");
		By state = By.id("multi-select");
		WebElement weekEle = getElement(week);
		WebElement stateEle = getElement(state);
		
		Select select1 = new Select(stateEle);
//		select1.selectByVisibleText("California");
		select1.selectByVisibleText("Texas");
		List<String> selectedValues = new ArrayList<String>();
		selectedValues = getAllSelectedOptions(state);
//		getAllSelectedOptions(state);
		System.out.println("The Selected Values are ");
		for(String e:selectedValues)
		{
			System.out.println(e);
		}
		

	}
	
	public static List<String> getAllSelectedOptions(By element)
	{
		WebElement stateEle = getElement(element);
		Select select = new Select(stateEle);
		List<WebElement>allStateSelectList=select.getAllSelectedOptions();
		System.out.println("All state selected List size "+allStateSelectList.size());
		List<String> selectedValues = new ArrayList<String>();
		for(WebElement e:allStateSelectList)
		{
//			System.out.println(e.getText());
			selectedValues.add(e.getText());
		}
		return selectedValues;
		
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}


}
