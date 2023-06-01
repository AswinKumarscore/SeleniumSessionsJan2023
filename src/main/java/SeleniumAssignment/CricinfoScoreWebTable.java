package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CricinfoScoreWebTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/delhi-capitals-vs-mumbai-indians-16th-match-1359490/full-scorecard");
		Thread.sleep(7000);
		
		getWicketTakername1();
		System.out.println("The program is over");
				
		// TODO Auto-generated method stub
//		(//span[text()='Manish Pandey'])[1]/ancestor::td/following-sibling::td

	}
//	public static String getWicketTakername1(String playerName)
//	{
//		return driver.findElement(By.xpath("(//span[text()='Manish Pandey'])[1]/ancestor::td/following-sibling::td//span")).getText();
//		
//	}
	
	public static void getWicketTakername1()
	{
		System.out.println(driver.findElement(By.xpath("(//span[text()='Manish Pandey'])[1]/ancestor::td/following-sibling::td//span")).getText());
		 String text=driver.findElement(By.xpath("(//span[text()='Manish Pandey'])[1]/ancestor::td/following-sibling::td//span")).getText();
		 
		 System.out.println(driver.findElement(By.xpath("(//span[text()='Manish Pandey'])[1]/ancestor::td/following-sibling::td/span/span")).getText());
		 String text2=driver.findElement(By.xpath("(//span[text()='Manish Pandey'])[1]/ancestor::td/following-sibling::td/span/span")).getText();
//		 (//span[text()='Manish Pandey'])[1]/ancestor::td/following-sibling::td/span/span
		 
		 String text1=driver.findElement(
						By.xpath("//span[text()='Manish Pandey']/ancestor::td/following-sibling::td//span"))
								.getText();
		 System.out.println("text "+text);
		 System.out.println("text1 "+text1);
		 System.out.println("text3 "+text2);
		
	}

}
