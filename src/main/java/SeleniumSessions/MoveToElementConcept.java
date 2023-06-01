package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

		By contentParentMenu = By.xpath("//a[@class='menulink']");
		By coursesChildMenu = By.xpath("//ul[@class='submenu']//a[text()='Courses']");
		By coursesChildMenuLinkTest = By.linkText("COURSES");
		
		//handleTwoLevelMenu(contentParentMenu, coursesChildMenu);
		//handleTwoLevelMenu(contentParentMenu,"COURSES");
		handleTwoLevelMenu(contentParentMenu,"SINGLE VIDEOS");
		//handleTwoLevelMenu(contentParentMenu,"COURSES");

		
//movetoElement method is selenium is used to hover over an element in the Website

	}
	
	public static void handleTwoLevelMenu(By parentMenu,By childMenu) throws InterruptedException
	{
		WebElement contactMenu = driver.findElement(parentMenu);
		Actions act = new Actions(driver);
		act.moveToElement(contactMenu).build().perform();
		Thread.sleep(3000);
		driver.findElement(childMenu).click();
		System.out.println("PROGRAM OVER--");
	}
	
	public static void handleTwoLevelMenu(By parentMenu,String childMenuLinkText) throws InterruptedException
	{
		System.out.println("Inside the method");
		WebElement contactMenu = driver.findElement(parentMenu);
		Actions act = new Actions(driver);
		act.moveToElement(contactMenu).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText(childMenuLinkText)).click();
		System.out.println("PROGRAM OVER--");
	}

}
