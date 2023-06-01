package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPathAxes {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		// input[@id='input-email']/preceding-sibling::label
		// Amazon Website:
		// div[text()='Get to Know Us']/following-sibling::ul//a
		String name ="Make Money with Us";
		getColumnValues(name);
	}
	
	public static void getColumnValues(String columnName)
	{
		List<WebElement> columnValues=driver.findElements(By.xpath("//div[text()='"+columnName+"']/following-sibling::ul//a"));
		for(WebElement e:columnValues)
		{
			String text = e.getText();
			System.out.println(text);
		}
		
		
	}

	public void unwantedMethod()
	{
		// TODO Auto-generated method stub
				//I was just playing around with DOM of https://app.hubspot.com/login
		////div[contains(@class,'UIFormControl__LabelWrapper')]/input[@id='username']
				//Why I am not able to locate element here?
				
				
				////div[@class='private-form__control-wrapper']/child::input[@id='username']
			//	The above code is not working for me;
				
			//ancestor doubt:
		//does ancestor return first value from the element or parent of an element?how
		
	}

}
