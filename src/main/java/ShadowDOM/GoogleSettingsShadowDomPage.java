package ShadowDOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSettingsShadowDomPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/");
		Thread.sleep(3000);
		
		String search_JsPath = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		   WebElement search = (WebElement)js.executeScript(search_JsPath);
		   search.sendKeys("Account");
		   System.out.println("The PRogram is Over");

	}

}
