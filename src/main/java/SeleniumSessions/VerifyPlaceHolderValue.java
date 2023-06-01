package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPlaceHolderValue {
	static WebDriver driver;
	//1.Verify all the place holder value in Registration section

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName 		= By.id("input-firstname");
		By lastName 		=By.id("input-lastname");
		By eMail 			=By.id("input-email"); 
		By telephone 		= By.id("input-telephone");
		By password 		=  By.id("input-password");
		By confirmPassword 	= By.id("input-confirm");
		ElementUtil elUtil = new ElementUtil(driver);
		String firstNamePlaceholderValue = elUtil.doGetAttributValue(firstName,"placeholder");
		String lastNamePlaceholderValue = elUtil.doGetAttributValue(lastName, "placeholder");
		String emailPlaceholderValue =elUtil.doGetAttributValue(eMail, "placeholder");
		String telephonePlaceholderValue = elUtil.doGetAttributValue(telephone, "placeholder");
		String passwordPlaceholderValue =elUtil.doGetAttributValue(password, "placeholder");
		String confirmpasswordPlaceholderValue = elUtil.doGetAttributValue(confirmPassword, "placeholder");
		
		if(firstNamePlaceholderValue.equals("First Name"))
		{
			System.out.println("PASS--correct placeholder value for FIRSTNAME");
		}
		else
		{
			System.out.println("FAIL--Incorrect placeholder value for FIRSTNAME");
		}
		
		if(lastNamePlaceholderValue.equals("Last Name"))
		{
			System.out.println("PASS--correct placeholder value for Last Name");
		}
		else
		{
			System.out.println("FAIL--Incorrect placeholder value for Last Name");
		}
		
		if(emailPlaceholderValue.equals("E-Mail"))
		{
			System.out.println("PASS--correct placeholder value for E-Mail");
		}
		else
		{
			System.out.println("FAIL--Incorrect placeholder value for E-Mail");
		}
		
		if(telephonePlaceholderValue.equals("Telephone"))
		{
			System.out.println("PASS--correct placeholder value for Telephone");
		}
		else
		{
			System.out.println("FAIL--Incorrect placeholder value for Telephone");
		}
		
		
		if(passwordPlaceholderValue.equals("Password"))
		{
			System.out.println("PASS--correct placeholder value for Password");
		}
		else
		{
			System.out.println("FAIL--Incorrect placeholder value for Password");
		}
		
		if(firstNamePlaceholderValue.equals("First Name"))
		{
			System.out.println("PASS--correct placeholder value for FIRSTNAME");
		}
		else
		{
			System.out.println("FAIL--Incorrect placeholder value for FIRSTNAME");
		}
		
		if(confirmpasswordPlaceholderValue.equals("Password Confirm"))
		{
			System.out.println("PASS--correct placeholder value for Password Confirm");
		}
		else
		{
			System.out.println("FAIL--Incorrect placeholder value for Password Confirm");
		}

	}

}
