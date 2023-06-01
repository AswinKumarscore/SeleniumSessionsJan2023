package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImagesNaveen {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		// create a list of webelement of name imagesList
		// Selenium formula :Find element + Perform action on it
//		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
//		System.out.println("Total images :" + imagesList.size());
//		for (WebElement e : imagesList) {
//			String altValue = e.getAttribute("alt");
//			System.out.println(altValue);

		By image = By.tagName("img");
		By links = By.tagName("a");

		// getElementsAttributeValue(links, "href");
		getElementsAttributeValue(image, "alt");
		List<String> imagesAttrList = getElementsAttributeValue(image,"alt");
		if(imagesAttrList.contains("Keyboards"))
		{
			System.out.println("PASS--Contains Keyboards");
		}
		else
		{
			System.out.println("FAIL");
		}

	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<String> getElementsAttributeValue(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();
		// for loop:
//		for (int i = 0; i < eleList.size(); i++) {
//			eleList.get(i).getAttribute(attrName);
//			System.out.println(eleList.get(i).getAttribute(attrName));
//		}
		// for each loop:
		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			//System.out.println(attrValue);
			eleAttrList.add(attrValue);
		}
		return eleAttrList;

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
