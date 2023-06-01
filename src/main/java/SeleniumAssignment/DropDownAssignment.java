package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();

	}
	public static void doSelectDropDownValue(By locator,String dropDownValue)
	{
		
		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();
		System.out.println("Total value in Options list is :"+optionList.size());
		
		for(WebElement e:optionList)
		{
			String text = e.getText();
			if(text.equals(dropDownValue))
			{
				e.click();
				break;
			}
		}
	}
	
	public static WebElement  getElement(By locator)
	{
		return driver.findElement(locator);
	}

}
