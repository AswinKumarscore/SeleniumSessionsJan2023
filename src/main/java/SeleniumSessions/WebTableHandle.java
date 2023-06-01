package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		//(//td[text()='John Smith']/preceding-sibling::td)[1]/input[@type='checkbox']
		//driver.findElement(By.xpath("//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
				//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']
//		selectUser("John.Smith");
//		Thread.sleep(3000);
//		selectUser("Jordan.Mathews");
		
		//a[text()='Joe.Root']/parent::td/following-sibling::td
		getUserInfo("Joe.Root");
		
		getUserInfo("John.Smith");
	}
	
	public static void selectUser(String userName)
	{
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
	public static void selectUser1(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	public static void getUserInfo(String userName) {
		//a[text()='Joe.Root']/parent::td/following-sibling::td
		List<WebElement> userList=driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		for(WebElement e:userList)
		{
			String text = e.getText();
			System.out.println(text);
		}
		
	}

	
}
