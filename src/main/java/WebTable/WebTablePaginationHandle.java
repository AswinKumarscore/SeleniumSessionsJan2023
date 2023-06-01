package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		//xpath for Country
		//td[text()='Denmark']
		
		
		//X Path for next button
		//a[text()='Next']
		
		//xpath for select checkbox
		//td[text()='Denmark']/preceding-sibling::td/input[@type='checkbox']
		
		while(true)
		{
			if(driver.findElements(By.xpath("//td[text()='Bulleya']")).size()>0)
				{
				
				 selectCountryCheckBox("Bulleya");
				 break;
				
				}
			else
			{
				WebElement next = driver.findElement(By.xpath("//a[text()='Next']"));
				if(next.getAttribute("class").contains("disable"))
				{
					System.out.println("The asked country is not present");
					break;
				}
				next.click();
			}
		}
		
	
		System.out.println("The Program is over");
		

	}
	public static void selectCountryCheckBox(String countryName)
	{
		WebElement country = driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']"));
		country.click();
		//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']
	}

}
