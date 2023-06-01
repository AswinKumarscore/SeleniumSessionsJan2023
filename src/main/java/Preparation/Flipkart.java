package Preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkart {
	private WebDriver driver;
	String text;

	public Flipkart(WebDriver driver) {
		this.driver = driver;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	// this method enters a keyword in search tab and click Search button(Icon)
	public  List<String> flipkartSearch(String searchKey, By searchTextBoxLocator, By searchButtonLocator)
			throws InterruptedException {
		
		System.out.println("INSIDE FLIPKART SEARCH METHOD");
		driver.findElement(searchTextBoxLocator).sendKeys(searchKey);
		Thread.sleep(5000);
		driver.findElement(searchButtonLocator).click();
		Thread.sleep(5000);

		List<WebElement> itemsList = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
		
		List<String> itemsListArrayList = new ArrayList<String>(); 
		
		for (WebElement e : itemsList) {
			String text = e.getText();
			itemsListArrayList.add(text);			
		}
	
		System.out.println(itemsList.size());
		for (WebElement e : itemsList) {
			String text = e.getText();
			System.out.println(text);
			e.click();
			break;
		}
		System.out.println("LAST LINE:INSIDE FLIPKART SEARCH METHOD");
	
		Thread.sleep(5000);
		return itemsListArrayList;

	}

	public static void clickFirstItemInTheItemsList() {

	}

	public  String printPriceOfTheItem() throws InterruptedException 
	{
		System.out.println("INSIDE PRINT PRICE OF THE ITEM METHOD");
		Thread.sleep(5000);
		By priceXPath = By.xpath("//div[@class='_30jeq3 _16Jk6d']");
		String itemPrice = driver.findElement(priceXPath).getText();
		System.out.println("The Item price is " + itemPrice);
		
		return itemPrice;
	}

	public  void addItemsToTheFlipkartCart() {
		System.out.println("INSIDE CLICK ADD TO CART METHOD");
		By xPath = By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
		driver.findElement(xPath).click();
		

	}
	
	public  void goToCartPage() throws InterruptedException
	{
		System.out.println("INSIDE GO TO CART METHOD");
		Thread.sleep(5000);
		Thread.sleep(12000);
		//a[@class='_3SkBxJ']
		By goToCartxPath = By.xpath("//a[@class='_3SkBxJ']");
		getElement(goToCartxPath).click();
		//driver.findElement(goToCartxPath).click();
		System.out.println("Last line of GO TO CART METHOD");
				//span[text()='Cart']
		
	}

	public  void printPriceOfTheItemInCartSection() {
		System.out.println("Inside--printThePriceOfTheItemFromCartPage");
		By xPathP = By.xpath("//span[@class='_2-ut7f _1WpvJ7']");
		String newPrice = getElement(xPathP).getText();
		System.out.println("The Price of the Item after The Quantity is Increased By One "+newPrice);
		System.out.println("Last Line of--printThePriceOfTheItemFromCartPage");
		

	}
	
	public  void closeTheHomePagePopUp() {
		By xPath = By.xpath("//button[@class='_2KpZ6l _2doB4z']");
		driver.findElement(xPath).click();

	}

	public  void navigateToCurrentWindow() throws InterruptedException
	{
		Thread.sleep(5000);
		String windowId = driver.getWindowHandle();
		System.out.println("This may be Parent  Window id " + windowId);
		Set<String> windowsIds = driver.getWindowHandles();

		List<String> windowsIdList = new ArrayList<String>(windowsIds);
		String parentWindowID = windowsIdList.get(0); // Parent Window
		String childWindowID = windowsIdList.get(1); // Child Window

		driver.switchTo().window(childWindowID);
//		System.out.println("Child  window title  " + driver.getTitle());
		
		
	}
	
	public  WebElement getElement(By locator) {
		WebElement element=null;
		try {
			element = driver.findElement(locator);
			System.out.println("element is found with locator: " + locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not found using this locator..." + locator);	
			try {
				Thread.sleep(5000);//static wait  ---> dynamic wait- exp wait
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			element = driver.findElement(locator);
		}
		return element;
	}

}
