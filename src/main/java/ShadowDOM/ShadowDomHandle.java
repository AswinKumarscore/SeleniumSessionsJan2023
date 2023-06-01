package ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(3000);
		//this xpath is not working why?//input[@type='text']
		
		//Browser 
				//Page
						//shadow DOM (Open)
								//elements
		
		//Browser 
				//Page
					//frame --- elements 
						//shadow DOM (Open)
								//Elements
		
		String username_JsPath ="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\")";
		String pizza_JsPath ="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
				 
		//Entering Username value:
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   WebElement userName = (WebElement)js.executeScript(username_JsPath);
	   userName.sendKeys("Naveen...");
	   
	   //Entering pizzaName:
	   
	   JavascriptExecutor js1 = (JavascriptExecutor)driver;
	   WebElement pizzaName =(WebElement)js1.executeScript(pizza_JsPath);
	   pizzaName.sendKeys("Dominos..pizza...");
	   //https://selectorshub.com/shadow-dom-in-iframe/
	   
		
		
		
		
		

	}

}
