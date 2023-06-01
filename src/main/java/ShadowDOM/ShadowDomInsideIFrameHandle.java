package ShadowDOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomInsideIFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(3000);
		
		//Browser 
				//Page
					//frame --- elements 
							//shadow DOM (Open)
										//Elements
		
		String tea_JsPath ="return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		
		String lunchtime_JsPath ="return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		String selectorsConceptTes_JsPath =""; //not possible since shadow root is closed
		driver.switchTo().frame("pact");
		
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		   WebElement loveTea = (WebElement)js.executeScript(tea_JsPath);
		   loveTea.sendKeys("Ginger Tea!");
		   
		   JavascriptExecutor js1 = (JavascriptExecutor)driver;
		   WebElement lunchtimeTextField = (WebElement)js1.executeScript(lunchtime_JsPath);
		   lunchtimeTextField.sendKeys("I need Sambar Rice for Lunch....");

	}

}
