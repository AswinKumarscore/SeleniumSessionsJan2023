package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmallAssignment {
	static WebDriver driver;

	public static void flipkartSearch(String searchKey, By searchTextBoxLocator, By searchButtonLocator)
			throws InterruptedException {

		driver.findElement(searchTextBoxLocator).sendKeys(searchKey);
		Thread.sleep(5000);
		driver.findElement(searchButtonLocator).click();
		Thread.sleep(5000);

		List<WebElement> itemsList = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		System.out.println(itemsList.size());
		// div[@class='_4rR01T']
		int count = 1;
		for (WebElement e : itemsList) {
			if (count == 1) {
				String text = e.getText();
				System.out.println(text);
				System.out.println();
				System.out.println("The count value is " + count);
				e.click();
				break;
			}
			count = count + 1;
		}
		Thread.sleep(10000);
		// <div class="_30jeq3 _16Jk6d">₹27,990</div>
		// Printing the price of the item
		// String price = driver.findElement(By.xpath("//div[@class='_30jeq3
		// _16Jk6d']")).getText();
		By pricepath = By.xpath("//div[@class='_30jeq3 _16Jk6d']");
		// String price2 = driver.findElement(By.className("_30jeq3
		// _16Jk6d")).getText());
		// String price3 =
		// driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div[1]/div/div[1]")).getText();
		// *[@id="container"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div[1]/div/div[1]
		// div[@class ='_30jeq3 _16Jk6d']
//		String textPrice = driver.findElement(pricepath).getText();
//		System.out.println("The price of the item is "+textPrice);
//		System.out.println("Program Over");
		String a = getElement(pricepath).getText();
		System.out.println("The value of String a is" + a);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		// driver.manage().window().fullscreen();
		By xPath = By.xpath("//button[@class='_2KpZ6l _2doB4z']");
		driver.findElement(xPath).click();

		By searchTextBoxLocator = By.name("q");
		By searchButtonLocator = By.xpath("//button[@class='L0Z3Pu']");
		flipkartSearch("vu tv", searchTextBoxLocator, searchButtonLocator);
	}

	public static WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			System.out.println("element is found with locator: " + locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not found using this locator..." + locator);
			try {
				Thread.sleep(5000);// static wait ---> dynamic wait- exp wait
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			element = driver.findElement(locator);
		}
		return element;
	}

	public void unwantedMethod() {
		// button[@class='L0Z3Pu']
		// _4rR01T //-->Next locator find elements after search

		// div[@class='left-pane-results-container']
		// div[@class='left-pane-results-container']//div[@class='s-suggestion
		// s-suggestion-ellipsis-direction']
		// nav-bb-search

	}

}
