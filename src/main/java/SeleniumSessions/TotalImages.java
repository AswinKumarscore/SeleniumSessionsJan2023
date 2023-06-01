package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a selnium program to fetch all the images of a a particular page
public class TotalImages {
	 static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> imageList = driver.findElements(By.tagName("img"));
		int totalimages = imageList.size();
		System.out.println("Total images present in WebPage home is "+totalimages);
		System.out.println("BEFORE for loop is complete");
		
		//imageList.get(i).getAttribute("data-a-hires");
		for(int i=0;i<totalimages;i++)
		{
           String dataahires = imageList.get(i).getAttribute("data-a-hires");
           System.out.println(i+" "+dataahires);
			
		}
		System.out.println("for loop is complete");

	}

}
