package BrowserHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent page
		Thread.sleep(3000);
		String parentWindowId = driver.getWindowHandle();
		System.out.println("The Parent window ID is " + parentWindowId);

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		//driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();

		Set<String> windowHandlesID = driver.getWindowHandles();

		Iterator<String> it = windowHandlesID.iterator();
		while (it.hasNext()) {

			String windowId = it.next();
			driver.switchTo().window(windowId);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(3000);
			if (!windowId.equals(parentWindowId)) {
				//driver.close();
				driver.quit();
			}

		}
		System.out.println("The Program over");

	}
//Quit vs Close:
	//Quit means entire session in the browser stops
	//Close means just one session in particular window gets stopped
}
