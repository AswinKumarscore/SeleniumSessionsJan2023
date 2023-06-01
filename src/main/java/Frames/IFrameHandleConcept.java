package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//ISSUES FACED:NOT ABLE TO UPLOAD THE FILE
//As on April 19,2023 22:25 IST File upload is working successfuly
// you have to use "/" and "/" instead of '\' and '\'
public class IFrameHandleConcept {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		// img[@title='vehicle-registration-forms-and-templates']

		// img -- iframe -- elements
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		// Proposed title:
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("VEHICLE REGISTRATION");
		// location:
		driver.findElement(By.name("RESULT_TextField-3")).sendKeys("London,UK");
		// Description:
		driver.findElement(By.name("RESULT_TextArea-5"))
				.sendKeys("Respected Manager,I have planned to buy a new vehicle on June 2023,Hence intimating"
						+ "you in Advance about the Vehicle Registration , Kindly do the needful");
		// Proposed date:
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("2023-04-04");
		// CONTACT INFORMATION:
		
		// First Name:
		driver.findElement(By.name("RESULT_TextField-8")).sendKeys("Charles");
		// Last Name:
		driver.findElement(By.name("RESULT_TextField-9")).sendKeys("Mc Doull");
		// Street Address:
		driver.findElement(By.name("RESULT_TextField-10")).sendKeys("810,Studio B,Manchester , UK");
		// City
		driver.findElement(By.name("RESULT_TextField-12")).sendKeys("Manchester , UK");
		// State
		// Zipcode
		driver.findElement(By.name("RESULT_TextField-14")).sendKeys("56718900");
		// Phone Number
		driver.findElement(By.name("RESULT_TextField-15")).sendKeys("8888823456");
		// Email Address:
		driver.findElement(By.name("RESULT_TextField-16")).sendKeys("letsdrivewagen@wagon.uk.com");
		// Attach any supporting documentation.
//Examples: Advertising, licenses, permits, recommendations
		System.out.println("Trying to upload the file");
		driver.findElement(By.name("RESULT_FileUpload-6"))
				.sendKeys("C:/Users/ASWIN/Desktop/April17,2023/FileUploadScreenshot.png");
		System.out.println("Program is over");

		//Selecting State Dropdown
		//driver.findElement(null).click();
		By xpathSelectState = By.xpath("//select[@name='RESULT_RadioButton-13']");
		Select state = new Select(driver.findElement(xpathSelectState));
		state.selectByVisibleText("Hawaii");
		
		// C:\Users\ASWIN\Desktop\April17,2023

	}
}
