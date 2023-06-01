package JavaScriptAlert;
//Program working successfully as on May1,2023
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/ASWIN/Desktop/SeleniumNotes/FileUploadSelenium.png");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("SUCCESS");
		//C:\Users\ASWIN\Desktop\SeleniumNotes\FileUploadSelenium.png
		//C:\Users\ASWIN\Desktop\SeleniumNotes\FileUploadSelenium.png

	}

}


