package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchAssignment {
	static WebDriver driver;

	public static void AmazonSearch(String searchKey, By searchLocator, By suggestions) throws InterruptedException {
		driver.findElement(searchLocator).sendKeys(searchKey);
		Thread.sleep(5000);
		System.out.println(suggestions);

		List<WebElement> suggestionList = driver.findElements(suggestions);
		for (WebElement e : suggestionList) {
			String text = e.getText();
			// System.out.println(e.getText());
			System.out.println(text);
			if (text.contains("pencil box")) {
				System.out.println("Yeah Pencil box --suggestion is present");
				e.click();
				break;

			}
		}

		// System.out.println("Suggestion List size? "+suggestionList.size());
		System.out.println("INSIDE AMAZON SEARCH METHOD,PROGRAM IS OVER");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		By searchlocatorByName = By.name("field-keywords");
		By searchlocatorByXPath = By.xpath("//input[@id='twotabsearchtextbox']");

		By suggestions = By.xpath(
				"//div[@class='left-pane-results-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction']");

		AmazonSearch("Pencil", searchlocatorByName, suggestions);

	}

	public void unwantedMethod() {
		// div[@class='left-pane-results-container']
		// div[@class='left-pane-results-container']//div[@class='s-suggestion
		// s-suggestion-ellipsis-direction']
		// nav-bb-search
	}

}
