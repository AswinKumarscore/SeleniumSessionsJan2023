package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox1")).isDisplayed();
		boolean flag = driver.findElement(By.id("twotabsearchtextbox1")).isDisplayed();
		System.out.println(flag);
		
		By search = By.id("twotabsearchtextbox");
		ElementUtil elUtil = new ElementUtil(driver);
		if(elUtil.checkElementIsDisplayed(search))
		{
			elUtil.doSendKeys(search,"Dumbells");
		}
		else {
			System.out.println("search element is notpresent");
		}

	}

}
