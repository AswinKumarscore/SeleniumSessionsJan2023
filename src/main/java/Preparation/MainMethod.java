package Preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Code Working successfully as on April 18,2023 9:20pm
public class MainMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Scenario 2:

		//FLIPKART:
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		Thread.sleep(4000);
		Flipkart obj = new Flipkart(driver);

		obj.closeTheHomePagePopUp();
		Thread.sleep(4000);

		By searchTextBoxLocator = By.name("q");
		By searchButtonLocator = By.xpath("//button[@class='L0Z3Pu']");

		List<String>flipkartItemList = obj.flipkartSearch("Red Pen", searchTextBoxLocator, searchButtonLocator);
		
		for(String e:flipkartItemList)
		{
			System.out.println(e);
			System.out.println();
		}

		obj.navigateToCurrentWindow();
		String flipkartItemPrice;
		obj.printPriceOfTheItem();
		Thread.sleep(5000);
		obj.addItemsToTheFlipkartCart();
		obj.printPriceOfTheItem();
		

//--------------------------------------------------------------------------------------
		// Amazon.in
		/*
        Thread.sleep(5000);
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://amazon.in");

		By searchTextBoxLocatorAmazon = By.name("field-keywords");
		By searchButtonLocatorAmazon = By.xpath("//input[@type='submit']");

		Amazon amazon = new Amazon(driver1);
		amazon.amazonSearch("Red Pen", searchTextBoxLocatorAmazon, searchButtonLocatorAmazon,"");
		
		*/

		// input[@type='submit']

	}

}
