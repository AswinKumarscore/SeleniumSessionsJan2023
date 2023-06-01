package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooter {
	// Fetch google Footer Section:
	/*
	 * 7 links: 1)About b)Advertising c)Business d)How Search Works e)Privacy Terms
	 * f)Settings
	 */
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://google.com");
		
		//LEFT FOOTER:
//		List<WebElement> googleLeftfooterList = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
//		System.out.println(googleLeftfooterList.size());
		
//		for (WebElement e : googleLeftfooterList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.contains("About")) {
//				System.out.println("About footer link is present");
//				System.out.println(" Href value of  ||" + e.getText() + "|| is " + e.getAttribute("href"));
//				System.out.println();
//
//			}
//			if (text.contains("Advertising")) {
//				System.out.println("About footer link is present");
//				System.out.println(" Href value of  ||" + e.getText() + "|| is " + e.getAttribute("href"));
//				System.out.println();
//			}
//			if (text.contains("Business")) {
//				System.out.println("Business footer link is present");
//				System.out.println(" Href value of  ||" + e.getText() + "|| is " + e.getAttribute("href"));
//				System.out.println();
//			}
//			if (text.contains("How Search works")) {
//				System.out.println("How Search works is present");
//				System.out.println(" Href value of  ||" + e.getText() + "|| is " + e.getAttribute("href"));
//				System.out.println();
//			}
//			
//		}
		//RIGHT FOOTER
		//div[@class='KxwPGc iTjxkf']/a
		System.out.println("---------googleRightfooterList-----------");
		List<WebElement> googleRightfooterList = driver.findElements(By.xpath("//div[@class='KxwPGc iTjxkf']/a"));
		System.out.println(googleRightfooterList.size());
		for(WebElement e:googleRightfooterList)
		{
			String text = e.getText();
			System.out.println(text);
		}
		//Setting RightFooter;
		System.out.println("--------Setting RightFooter------");
		
		List<WebElement> settingsGoogleRightfooterList = driver.findElements(By.xpath("//div[@class='ayzqOc pHiOh']"));
		System.out.println(settingsGoogleRightfooterList.size());
		for(WebElement e:settingsGoogleRightfooterList)
		{
			String text = e.getText();
			System.out.println(text);
			e.click();
		}

	}

	public void exampleXPathForReference() {
		// div[@class='KxwPGc AghGtd']/a
		// Google left side footer links:
		// for Example reference:
		// div[@class='navFooterLinkCol navAccessibility']/ul/li/ -->Amazon footer path
		// table[@class='navFooterMoreOnAmazon']//td/a -->Amazon footer xPath

	}

}
