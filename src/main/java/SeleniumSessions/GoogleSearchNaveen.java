package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Code working fine as on April 6,2023 6:15pm
public class GoogleSearchNaveen {
	static WebDriver driver;

	public static void search(String searchKey, By searchLocator, String suggName, By suggestions)
			throws InterruptedException {
		driver.findElement(searchLocator).sendKeys(searchKey);
		Thread.sleep(5000);
		List<WebElement> suggList = driver.findElements(suggestions);
		System.out.println("Total suggestions: " + suggList.size());
		if (suggList.size() > 0) {

			for (WebElement e : suggList) {
				String text = e.getText();
				if (text.length() > 0) {
					System.out.println(text);

					if (text.contains(suggName)) {
						e.click();
						break;
					} else {
						System.out.println("Requested Suggested value not present");
					}

				} else {
					System.out.println("BLANK VALUES --- no suggestions");
					break;
				}
			}
		} else {
			System.out.println("No Search suggestions found");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(3000);

		By searchlocatorByName = By.name("q");
		By suggestions = By.xpath("//div[@class='wM6W7d']/span");
		search("cricket", searchlocatorByName, "cricket", suggestions); // NOTWORKING
		System.out.println("PROGRAM OVER");

	}

	public void unwantedMethod() {
		// In the above code we are not solving for the corner cases-->sending blank
		// search key
		// eg :" " like this

		// div[@class='wM6W7d']/span
	}

}
