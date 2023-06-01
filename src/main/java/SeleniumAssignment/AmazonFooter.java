package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooter {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> amazonfooterList = driver.findElements(By.xpath("//div[@class='navFooterLinkCol navAccessibility']/ul/li/a"));
		System.out.println(amazonfooterList.size());

		for (WebElement e : amazonfooterList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("Your Account"))
			{
				System.out.println("Your Account link is Present");
				e.getAttribute("href");
				System.out.println("Href value of YOUR ACCOUNT Link is "+e.getAttribute("href"));
			}
			if(text.contains("Help"))
			{
				System.out.println("Help page is present-->Lets navigate to the Help  section");
				e.click();
				
			}
			System.out.println();
			//Thread.sleep(5000);
			//e.click();
			//break;

		}

		// table[@class='navFooterMoreOnAmazon']//td/a
		//// div[@class='navFooterVerticalRow
		//// navAccessibility']/div[@class='navFooterLinkCol navAccessibility']
		//// div[@class='navFooterLinkCol navAccessibility']/ul/li/a --->THis is correct XPath I guess
		

	}

}
