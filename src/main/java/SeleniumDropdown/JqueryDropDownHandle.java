package SeleniumDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);

		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);

		By choices = By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li/span");

		// 1.TC_1:Single selection:
//		selectChoice(choices,"choice 7");
//		
//		selectChoice(choices,"choice 6");

		// 2.TC_2:Multiple selection:
//		selectChoice(choices,"choice 6 2 3","choice 1","choice 2","choice 6 2 2","choice 4");

		// 3.TC_3: All selection:
		selectChoice(choices, "all");

	}

	// Integer is also applicable,double also applicable
//public static void selectChoice(By locator, int... value) 
	public static void selectChoice(By locator, String... value) {

		List<WebElement> optionsList = driver.findElements(locator);

		System.out.println(optionsList.size());

		if (!value[0].equalsIgnoreCase("all"))
		{
			for (WebElement e : optionsList) 
			{
//			System.out.println("Inside for each loop");
				String text = e.getText();
				System.out.println("The text value is " + text);

				// multiple selection logic:

				for (int i = 0; i < value.length; i++)
				{

					if (text.contains(value[i]))
					{
						e.click();
						break;
					}
				}
			}

		}
		else 
		{
			// all selection logic
			for (WebElement e : optionsList)
			{
				
				String text = e.getText();
				
				if (!text.equals("-"))
				{
					System.out.println(text);
					e.click();
				}
			}
		}

	}

}
