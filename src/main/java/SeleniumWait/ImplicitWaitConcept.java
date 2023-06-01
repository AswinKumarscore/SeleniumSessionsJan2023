package SeleniumWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//watched till 1hour 9minutes:
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");//10
		
		String label = driver.findElement(By.id("nav-logo-sprites")).getAttribute("aria-label");//10
		//driver.findElement(By.id("nav-logo-sprites")).getAttribute("aria-label");
		System.out.println("The attribute value of Amazon is "+label);
		System.out.println("The Program over");
		
		

	}

}
