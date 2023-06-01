package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	static WebDriver driver;
	
	public void PrintAswin()
	{
		System.out.println("Aswin is printed");
	}
	
	public static void StaticPrintAswin()
	{
		System.out.println("Will this print inside static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//driver = new ChromeDriver(); //this code launches the browser(Chrome)
		String text ="Aswin";
		System.out.println(text.contains("Aswin"));

	}
	

}

//div[@class='wM6W7d']/span
