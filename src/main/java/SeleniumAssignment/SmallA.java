package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmallA {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("");
		driver.get("https://www.flipkart.com/vu-gloled-108-cm-43-inch-ultra-hd-4k-led-smart-google-tv-dj-subwoofer-84w/p/itm65f2925757d94?pid=TVSGJKC9TUSZ2DHS&lid=LSTTVSGJKC9TUSZ2DHSYRCHBF&marketplace=FLIPKART&q=vu+tv&store=ckf%2Fczl&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=066500e5-6248-419a-8947-5a896ab1f830.TVSGJKC9TUSZ2DHS.SEARCH&ppt=hp&ppn=homepage&ssid=4t8mdzfe0w0000001681134649285&qH=8875e028bf3a2561");
		driver.get("");
		By pricepath = By.xpath("//div[@class='_30jeq3 _16Jk6d']");
		System.out.println(driver.findElement(pricepath).getText());
		
		
		By pricepath2 = By.xpath("//div[@class='_25b18c']//div[@class='_30jeq3 _16Jk6d']");
		System.out.println(driver.findElement(pricepath2).getText());
		

	}

}
