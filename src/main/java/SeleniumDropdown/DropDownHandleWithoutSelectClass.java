package SeleniumDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelectClass {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		//select[@id='Form_getForm_Country']/option  
		By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		doSelectValueFromDropDownWithoutSelect(countryOptions,"Geranto");
		
	}
	
	public static boolean doSelectValueFromDropDownWithoutSelect(By locator,String value)
	{
		boolean flag = false;
		List<WebElement> optionsList = driver.findElements(locator);
		for(WebElement e:optionsList)
		{
			String text = e.getText();
			if(text.equals(value))
				{
				flag = true;
				e.click();
				break;
				
				}
		}
		if(flag==false)
		{
			System.out.println(value+"is not present in the dropdown "+locator);
		}
		return flag;
		
	}

}
