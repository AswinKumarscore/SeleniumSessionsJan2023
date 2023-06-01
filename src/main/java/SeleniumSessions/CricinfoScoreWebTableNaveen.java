package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricinfoScoreWebTableNaveen {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/delhi-capitals-vs-mumbai-indians-16th-match-1359490/full-scorecard");
	
		Thread.sleep(7000);	
	
		//((//a//span[text()='Kuldeep Yadav'])[1]/ancestor::tr/following-sibling::tr//span)[1]
		
		String wkTkrName1 = getWicketTakerName("Yash Dhull");
		System.out.println(wkTkrName1);
		
		String wkTkrName2 = getWicketTakerName("Axar Patel"); //Axar patel alone it is not working
		System.out.println(wkTkrName2);
		
		String wkTkrName3 = getWicketTakerName("Prithvi Shaw");
		System.out.println(wkTkrName3);
		
		System.out.println("Program over");
		 
//		System.out.println(getPlayerScoreCardsList("Manish Pandey"));
		//Perfect xpath for the above use case:(//a//span[text()='David Warner']/ancestor::tr/following-sibling::tr//span)[1]
		
	
	}
	
	public static String getWicketTakerName(String playerName) {
		System.out.println("Player name "+playerName);
//		return driver
//			.findElement(
//						By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td//span"))
//								.getText();
		return driver.findElement(By.xpath("((//a//span[text()='"+playerName+"'])[1]/ancestor::tr/following-sibling::tr//span)[1]")).getText();
		
	}
	
	public static List<String> getPlayerScoreCardsList(String playerName) {
		List<WebElement> scoreList = 
		driver
			.findElements
				(By.xpath("//span[text()='"+playerName+"']/ancestor::td//following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> scoreValList = new ArrayList<String>();
		for(WebElement e : scoreList) {
			String text = e.getText();
			scoreValList.add(text);
		}
		return scoreValList;
	}
	
	
	
	

}