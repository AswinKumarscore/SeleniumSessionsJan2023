package SeleniumAssignment;

//CODE WORKING SUCCESSFULLY AS ON APRIL 17,2023

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSmall {

	static WebDriver driver;
	// keyword-->Parker pen
	// a[@class='s1Q9rs'] -->2st element x path
	// button[@class='_2KpZ6l _2U9uOA _3v1-ww'] --> add to cart button:
	//// span[text()='Cart'] -->Click Cart button at the header

	//// div[@class='_30jeq3 _16Jk6d'] -->print the price of the item using get text
	//// in ITems section:

	//// span[@class='_2-ut7f _1WpvJ7'] -->Print the price of the item in Cart
	//// section

	public static void flipkartSearch(String searchKey, By searchTextBoxLocator, By searchButtonLocator)
			throws InterruptedException {
		System.out.println("INSIDE FLIPKART SEARCH METHOD");
		driver.findElement(searchTextBoxLocator).sendKeys(searchKey);
		Thread.sleep(5000);
		driver.findElement(searchButtonLocator).click();
		Thread.sleep(5000);

		List<WebElement> itemsList = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
		System.out.println(itemsList.size());
		for (WebElement e : itemsList) {
			String text = e.getText();
			System.out.println(text);
			e.click();
			break;
		}
		System.out.println("LAST LINE:INSIDE FLIPKART SEARCH METHOD");
		// String
		Thread.sleep(5000);

	}

	public static void closeTheHomePagePopUp() {
		By xPath = By.xpath("//button[@class='_2KpZ6l _2doB4z']");
		driver.findElement(xPath).click();

	}
	
	public static void clickAddToCart() {
		System.out.println("INSIDE CLICK ADD TO CART METHOD");
		By xPath = By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
		driver.findElement(xPath).click();
		
		
		// button[@class='_2KpZ6l _2U9uOA _3v1-ww']
	}
	
	public static void goToCartPage() throws InterruptedException
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
	
	public static void increaseTheQuantityByOne() throws InterruptedException
	{
		//button[text()='+']
		By xpath = By.xpath("//button[text()='+']");
		Thread.sleep(3000);
		//getElement(xpath).click();
		driver.navigate().refresh();
		Thread.sleep(10000);
		System.out.println("In Increase the Quantity By One After Thread.sleep(10000)");
		
		
		try {
			getElement(xpath).click();
		} catch (NoSuchElementException e) {
			System.out.println("The user cannot increase the Quantity as it is Out of Stock/limited stock");
			// TODO: handle exception
		}
		System.out.println("Last Line of Increase the Quantity by One");

	}
	
	public static WebElement getElement(By locator) {
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

	public static void printPriceOfTheItem() throws InterruptedException {
		System.out.println("INSIDE PRINT PRICE OF THE ITEM METHOD");
		Thread.sleep(5000);
		By priceXPath = By.xpath("//div[@class='_30jeq3 _16Jk6d']");
		String itemPrice = driver.findElement(priceXPath).getText();
		System.out.println("The Item price is " + itemPrice);
	}
	
	public static void printThePriceOfTheItemFromCartPage()
	{
		System.out.println("Inside--printThePriceOfTheItemFromCartPage");
		By xPathP = By.xpath("//span[@class='_2-ut7f _1WpvJ7']");
		String newPrice = getElement(xPathP).getText();
		System.out.println("The Price of the Item after The Quantity is Increased By One "+newPrice);
		System.out.println("Last Line of--printThePriceOfTheItemFromCartPage");
		
	}
	
	public static void navigateToCurrentWindow() throws InterruptedException
	{
		Thread.sleep(5000);
		String windowId = driver.getWindowHandle();
		System.out.println("This may be Parent  Window id " + windowId);
		Set<String> windowsIds = driver.getWindowHandles();

		List<String> windowsIdList = new ArrayList<String>(windowsIds);
		String parentWindowID = windowsIdList.get(0); // Parent Window
		String childWindowID = windowsIdList.get(1); // Child Window

		driver.switchTo().window(childWindowID);
		System.out.println("Child  window title  " + driver.getTitle());
		
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		Thread.sleep(3000);
		closeTheHomePagePopUp();

		// input[@name='q']
		By searchTextBoxLocator = By.name("q");
		By searchButtonLocator = By.xpath("//button[@class='L0Z3Pu']");
		//flipkartSearch("Sparx sandals", searchTextBoxLocator, searchButtonLocator);
		flipkartSearch("Pencil", searchTextBoxLocator, searchButtonLocator);
		navigateToCurrentWindow();

//		String windowId = driver.getWindowHandle();
//		System.out.println("This may be Parent  Window id " + windowId);
//		Set<String> windowsIds = driver.getWindowHandles();
//
//		List<String> windowsIdList = new ArrayList<String>(windowsIds);
//		String parentWindowID = windowsIdList.get(0); // Parent Window
//		String childWindowID = windowsIdList.get(1); // Child Window
//
//		driver.switchTo().window(childWindowID);
//		System.out.println("Child  window title  " + driver.getTitle());
//		
		printPriceOfTheItem();
		Thread.sleep(5000);
		clickAddToCart();
//		driver.navigate().refresh();
//		goToCartPage();
		printPriceOfTheItem();
		
		


	}

}
