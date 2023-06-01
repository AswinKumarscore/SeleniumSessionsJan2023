package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooter {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List <WebElement> footerList = driver.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']//td/a"));
		System.out.println(footerList.size()); //size must be 31--since we have 31 footer links
		
		for(WebElement e:footerList)
		{
			String text = e.getText();
			System.out.println(text);
			System.out.println();
		}

		//table[@class='navFooterMoreOnAmazon']//td/a
		//What is Meant by?Direct child and Indirect child? in XPath

		// By footer = By.className("navFooterDescText");
		// driver.findElement(footer).click();
//navFooterMoreOnAmazon
		// navFooterDescText
		// navFooterDescItem --fetched 35 footer links
	}

}
