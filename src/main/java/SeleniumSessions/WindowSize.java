package SeleniumSessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Dimension dim = new Dimension(5000,5000);
		driver.manage().window().setSize(dim);
		Thread.sleep(5000);
		Dimension dim1 = new Dimension(1000,1000);
		driver.manage().window().setSize(dim1);
		Thread.sleep(5000);
		driver.get("https://www.amazon.com");
		Thread.sleep(7000);
		driver.manage().window().fullscreen();

	}

}
