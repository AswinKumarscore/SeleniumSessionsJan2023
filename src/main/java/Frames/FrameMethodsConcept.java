package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameMethodsConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(4000);

		List<WebElement> framesList = driver.findElements(By.tagName("frame"));

		System.out.println("The Total frames available in Page is " + framesList.size());

//Option 1://		driver.switchTo().frame(2);
		By frameElement = By.xpath("//frame[@src='top.html']");
		// option 2:
		driver.switchTo().frame("main");
		// Option 3://driver.switchTo().frame(driver.findElement(frameElement));

		By titleHeader = By.xpath("//h2[text()='Title bar ']");
		By titleHeader1 = By.tagName("h2");

		System.out.println(driver.findElement(titleHeader).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(titleHeader1).getText());

	}

}
