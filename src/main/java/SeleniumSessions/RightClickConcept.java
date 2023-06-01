package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Working successfully as on April 15,2023
public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		//To right click on a webelement,In selenium we have to use
		//contextclick()
		Thread.sleep(5000);
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action = new Actions(driver);
		//action.contextClick().build().perform();
		action.contextClick(rightClickButton).build().perform();
		System.out.println("The Program is over");
		Thread.sleep(3000);
		
		List<WebElement> rightClickEleList = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li//span"));
		
		//ul[@class='context-menu-list context-menu-root']/li//span
		System.out.println("The Size of the Right Click Element list is "+rightClickEleList.size());
		for(WebElement e:rightClickEleList)
		{
			String text = e.getText();
			System.out.println(text);
			if(text.contains("Paste"))
			{
				System.out.println("I am clicking Paste");
				e.click();
				break;
			}
		}
		//ul[@class='context-menu-list context-menu-root']/li//span
		
		

	}

}
