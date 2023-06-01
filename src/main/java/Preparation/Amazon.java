package Preparation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon {
	private WebDriver driver;
	
	public Amazon(WebDriver driver) {
		this.driver = driver;
	}
	
	
		//this method enters a keyword in search tab and click Search button(Icon) and click the first item in the list
		
		//xpath to click first item in list//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']
		public void amazonSearch(String searchKey, By searchTextBoxLocator, By searchButtonLocator,String flipkartText)
				throws InterruptedException {
			
			System.out.println("INSIDE AMAZON SEARCH METHOD");
			driver.findElement(searchTextBoxLocator).sendKeys(searchKey);
			Thread.sleep(5000);
			driver.findElement(searchButtonLocator).click();
			Thread.sleep(5000);

			List<WebElement> itemsList = driver.findElements(By.xpath("//div[@class='a-row a-size-small']/parent::div/parent::div//h2"));
			System.out.println("Amazon itemslist size is "+itemsList.size());
			
			Thread.sleep(5000);
			for (WebElement e : itemsList) {

		    	   String text = e.getText();
		    	   System.out.println(text);
		    	   System.out.println();
		    	   e.click();
		    	   break;
			}
			System.out.println("LAST LINE:INSIDE AMAZON SEARCH METHOD");
		
			Thread.sleep(5000);

		
	}
	public  void clickSameIteamAsInFlipkart()
	{
		
	}
	public  void printPriceOfTheItem()
	{
		
	}
	
	
	public void addItemsToTheAmazonCart()
	{
		
	}
	
	public  void goToAmazonCartSection()
	{
		
	}
	
	public  void printPriceOfTheItemFromCartSection()
	{
		
	}

}
