package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearchAssignment {
	static WebDriver driver;

	public static void FlipkartSearch(String searchKey, By searchLocator, By suggestions) throws InterruptedException {
		driver.findElement(searchLocator).sendKeys(searchKey);
		Thread.sleep(5000);
		System.out.println(suggestions);
		List<WebElement> suggestionList = driver.findElements(suggestions);
		System.out.println("Suggestion List size? "+suggestionList.size());
		for (WebElement e : suggestionList) 
		{
			String text = e.getText();
			System.out.println(text);
			if (text.contains("pencil box"))
			{
				System.out.println("Yeah Pencil box --suggestion is present");
				e.click();
				break;

			}
		}
		System.out.println("INSIDE FLIPKART SEARCH METHOD,PROGRAM IS OVER");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		By xPath = By.xpath("//button[@class='_2KpZ6l _2doB4z']");
		By searchLocator = By.name("q");
		By suggestions = By.xpath("");
		driver.findElement(xPath).click();
	}

	public void unWantedMethod() {
		// driver.manage().window().fullscreen();
//		By searchlocatorByName = By.name("");
//		By searchlocatorByXPath = By.xpath("");
//		By exit = By.className("_2KpZ6l _2doB4z");
//		By exitXPath = By.xpath("/html/body/div[2]/div/div/button");
		// button[@class='_2KpZ6l _2doB4z']
//		By exitCSS = By.cssSelector("body > div._2Sn47c > div > div > button");
		/// html/body/div[2]/div/div/button
		// body > div._2Sn47c > div > div > button
	}

}
