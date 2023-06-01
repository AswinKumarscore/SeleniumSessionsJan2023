package JavaScriptExecutors;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title=js.executeScript("return  document.title").toString();
		System.out.println("The title present is AMAZON is "+title);
		
		String innerText = js.executeScript("return document.documentElement.innerText").toString();
		
		System.out.println("The inner text value of Amazon is ");
		System.out.println(innerText);
		
		
//		driver.get("https://naveenautomationlabs.com/");
//		String naveenTitle = js.executeScript("return  document.title").toString();
//		System.out.println("The naveen automation labs title is "+naveenTitle);
		
		//album.alexflueras.ro/#a1

	}

}
