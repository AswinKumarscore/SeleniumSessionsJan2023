package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreshworksFooter2 {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		List<WebElement> freshworksFooterList=driver.findElements(By.xpath("//nav[@class='sc-662dedcb-0 fMAcTI']//ul/li"));
		for(WebElement e:freshworksFooterList)
		{
			String text = e.getText();
			System.out.println(text);
			if(text.contains("Investors"))
			{
				System.out.println("Investor link is present--Clicking investor");
				//e.click();
				break;
			}
			System.out.println();
		}
		//1st Xpath-->//nav[@class='sc-662dedcb-0 fMAcTI']//ul/li       

	}

}
//div[@class='sc-662dedcb-0 fMAcTI']
//System.out.println(e.getAttribute("href"));