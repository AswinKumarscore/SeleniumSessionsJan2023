package JavaScriptAlert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AuthenticationPopUpHandle {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		String username = "admin";
		String pwd = "admin";
		driver.get("https://" + username + ":" + pwd + "@the-internet.herokuapp.com/basic_auth");
		// driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		System.out.println("Program over");
	}
}
