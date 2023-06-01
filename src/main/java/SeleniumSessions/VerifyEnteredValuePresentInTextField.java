package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEnteredValuePresentInTextField {
//B) Verify if all the values entered in the text field in registration field?? 
//	Verify if values entered in the text fields are getting entered successfully:
	private static WebDriver driver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//Formula in Selenium ==> First find the element + then Perform actions on it that you need to
		WebElement emailId = driver.findElement(By.id("input-email"));
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		WebElement telephone = driver.findElement(By.id("input-telephone"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement passwordConfirm = driver.findElement(By.id("input-confirm"));
		
		String entEmailid = "Test@gmail.com";
		String entFirstName = "Harman";
		String entLastName = "kaur";
		String entTelephone = "9999945678";
		String entPassword = "1Harman@4321";
		String entPasswordConfirm = "1Harman@4321";
		
		

		emailId.sendKeys(entEmailid);
		firstName.sendKeys(entFirstName);
		lastName.sendKeys(entLastName);
		telephone.sendKeys(entTelephone);
		password.sendKeys(entPassword);
		passwordConfirm.sendKeys(entPasswordConfirm);
		
		String enteredEmailValue = 		emailId.getAttribute("value");
		emailId.getAttribute("value"); 
		
		if(entEmailid.equals(enteredEmailValue))
		{
			System.out.println("PASS-Email id is entered successfully and is present in the text field");
		}
		else
		{
			System.out.println("Email id is not entered successfully in the text field");
		}
		
		if(entFirstName.equals(firstName.getAttribute("value")))
		{
			System.out.println("PASS-Firstname which is typed in textfields is successfully present in the text fields");
		}
		else
		{
			System.out.println("FAIL--Entered first Name is not present");
		}
		
		if(entLastName.equals(lastName.getAttribute("value")))
		{
			System.out.println("PASS-lastName which is typed in textfields is successfully present in the text fields");
		}
		else
		{
			System.out.println("FAIL--Entered lastName is not present");
		}
		
		if(entTelephone.equals(telephone.getAttribute("value")))
		{
			System.out.println("PASS Telephone which is typed in textfields is successfully present in the text fields");
		}
		else
		{
			System.out.println("FAIL--Entered Telephone is not present");
		}
		
		if(entPassword.equals(password.getAttribute("value")))
		{
			System.out.println("PASS-Password which is typed in textfields is successfully present in the text fields");
		}
		else
		{
			System.out.println("FAIL--Entered Password is not present");
		}
		
		if(entPasswordConfirm.equals(passwordConfirm.getAttribute("value")))
		{
			System.out.println("PASS-Password confirm which is typed in textfields is successfully present in the text fields");
		}
		else
		{
			System.out.println("FAIL--Entered Password confirmation value is not present");
		}

	}

}
