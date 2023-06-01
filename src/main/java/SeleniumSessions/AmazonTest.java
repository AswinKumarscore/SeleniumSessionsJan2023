package SeleniumSessions;

import com.google.common.annotations.VisibleForTesting;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil brUtil = new  BrowserUtil();
		brUtil.initDriver("edge");
		brUtil.launchURL("https://www.Amazon.com");
		System.out.println(brUtil.getPageTitle());
		String actTitle = brUtil.getPageTitle();
		Verify.equalValuesTitle(actTitle,"Amazon.com. Spend less. Smile more." );
		System.out.println("OUTPUT is "+Verify.equalValuesTitle(actTitle,"Amazon.com. Spend less. Smile more." ));
		Verify.containValuesTitle(actTitle, "Amazon");
		String actUrl = brUtil.getPageURL();
		Verify.containsURL(actUrl,"www.");
		System.out.println("PAGE URL ?"+Verify.containsURL(actUrl,"www."));
		
//	
		
//		String actUrl = brUtil.getPageURL();
		System.out.println("page url is : "+actUrl);
		
		if(actUrl.contains("amazon.com"))
		{
			System.out.println("PASS--URL");
		}
		else {
			System.out.println("FAIL - URL");
		}
		brUtil.quitBrowser();
	}

}
