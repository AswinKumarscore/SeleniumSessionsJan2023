package SeleniumDropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelectMethods {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		Thread.sleep(3000);
		
		By country = By.id("Form_getForm_Country");
		WebElement countryEle = driver.findElement(country);
		
//		int actCount = getDropDownValueCount(country);
//		if(actCount == 233)
//		{
//			System.out.println("PASS -- Count");
//		}
//		else
//		{
//			System.out.println("FAIL--Total country tc");
//		}
//		
//		System.out.println(getAllDropDownOptions(country).contains("Indddia"));
		
		doSelectDropDownValue(country,"America");
		

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		
	}
	
	public static int getDropDownValueCount(By locator)
	{
		return getAllDropDownOptions(locator).size();
	}

	public static List getAllDropDownOptions(By locator)
	{
		Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsValueList = new ArrayList<String>();
		System.out.println("Total values in options tage : "+optionsList.size());
		for(WebElement e:optionsList)
		{
			String text = e.getText();
			//System.out.println(text);	
			optionsValueList.add(text);
		}
		return optionsValueList;
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

}
