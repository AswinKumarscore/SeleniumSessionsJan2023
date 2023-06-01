package SeleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;// session id:123

	ElementUtil(WebDriver driver)// session id:123
	{
		this.driver = driver;
	}

	public void doSendKeys(By locator, String value) {
//		if(value==null)
//		{
//			System.out.println("Null values are not allowed");
//			throw new MySeleniumException("VALUE CANNOT BE NULL");
//		}
		doClear(locator);
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doClear(By locator) {
		getElement(locator).clear();
	}

	public String doGetElementText(By locator) {
		return getElement(locator).getText();

	}

	public boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public String doGetAttributValue(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public List<String> getElementsTextList(By locator) {
		List<WebElement> elementsLinksList = getElements(locator);
		List<String> elesTextList = new ArrayList<String>();
		for (WebElement e : elementsLinksList) {
			String text = e.getText();
			elesTextList.add(text);

		}
		return elesTextList;
	}

	public List<String> getElementsAttributeValue(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();
		// for loop:
//		for (int i = 0; i < eleList.size(); i++) {
//			eleList.get(i).getAttribute(attrName);
//			System.out.println(eleList.get(i).getAttribute(attrName));
//		}
		// for each loop:
		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			// System.out.println(attrValue);
			eleAttrList.add(attrValue);
		}
		return eleAttrList;

	}

	public void clickElementFromPageSection(By locator, String eleText) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(eleText)) {
				e.click();
				break;
			}
		}
	}
	
	public   boolean IsElementDisplayed(By locator)
	{
		List<WebElement> elelIst = getElements(locator);
		if(elelIst.size()>0)
		{
			System.out.println(locator+ "Element is present on the page");
			return true; 
		}
		else
		{
			return false;
		}
		
	}
	//The method is created becauses...find elements doesnt throw an exception..
	//then why not make the method name as Elements instead of Element which is more readable

	public void search(String searchKey, By searchLocator, String suggName, By suggestions)
			throws InterruptedException {
		// driver.findElement(searchLocator).sendKeys(searchKey);
		doSendKeys(searchLocator, searchKey);
		Thread.sleep(5000);

		// List<WebElement> suggList = driver.findElements(suggestions);
		List<WebElement> suggList = getElements(suggestions);
		System.out.println("Total suggestions: " + suggList.size());

		if (suggList.size() > 0) {

			for (WebElement e : suggList) {
				String text = e.getText();
				if (text.length() > 0) {
					System.out.println(text);

					if (text.contains(suggName)) {
						e.click();
						break;
					}

				} else {
					System.out.println("BLANK VALUES --- no suggestions");
					break;
				}
			}
		} else {
			System.out.println("No Search suggestions found");
		}
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	//**********************Drop down Utils *************************/
	
	public  void doSelectDropDownByIndex(By locator,int index)
	{
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public  void doSelectDropDownByVisibleText(By locator,String text)
	{
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public  void doSelectDropDownByValueAttribute(By locator,String value)
	{
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public  int getDropDownValueCount(By locator)
	{
		return getAllDropDownOptions(locator).size();
	}

	public  List getAllDropDownOptions(By locator)
	{
		Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsValueList = new ArrayList<String>();
		System.out.println("Total values in options tage : "+optionsList.size());
		for(WebElement e:optionsList)
		{
			String text = e.getText();
			//System.out.println(text);	
			optionsValueList.add(text);
		}
		return optionsValueList;
	}
	
	public  boolean doSelectDropDownValue(By locator,String dropDownValue)
	{
		boolean flag = false;
		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();
		System.out.println("Total value in Options list is :"+optionList.size());
		
		for(WebElement e:optionList)
		{
			String text = e.getText();
			if(text.equals(dropDownValue))
			{
				flag = true;
				e.click();
				break;
			}
			
			
		}
		if(flag==false)
		{
			System.out.println(dropDownValue+" is not present in the dropdown "+locator);
		}
		return flag;
	}
	
	public  boolean doSelectValueFromDropDownWithoutSelect(By locator,String value)
	{
		boolean flag = false;
		List<WebElement> optionsList = driver.findElements(locator);
		for(WebElement e:optionsList)
		{
			String text = e.getText();
			if(text.equals(value))
				{
				flag = true;
				e.click();
				break;
				
				}
		}
		if(flag==false)
		{
			System.out.println(value+"is not present in the dropdown "+locator);
		}
		return flag;
		
	}
	
	//************************Actions class Utils **********************************
	
	public void doContextClick(By locator)
	{
		Actions act = new Actions(driver);
		act.contextClick(getElement(locator)).build().perform();
	}
	
	public void doDragAndDrop(By sourceLocator,By targetLocator)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(getElement(sourceLocator),getElement(targetLocator)).build().perform();
		
	}
	public void doMoveToElement(By locator)
	{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).build().perform();
		
		
	}
	
	public  void handleTwoLevelMenu(By parentMenu,By childMenu) throws InterruptedException
	{
		WebElement parentMenuElement = driver.findElement(parentMenu);
		Actions act = new Actions(driver);
		act.moveToElement(parentMenuElement).build().perform();
		Thread.sleep(3000);
		doClick(childMenu);
		
		System.out.println("PROGRAM OVER--");
	}
	
	public  void handleTwoLevelMenu(By parentMenu,String childMenuLinkText) throws InterruptedException
	{
		System.out.println("Inside the method");
		WebElement contactMenu = driver.findElement(parentMenu);
		Actions act = new Actions(driver);
		act.moveToElement(contactMenu).build().perform();
		Thread.sleep(3000);
		doClick(By.linkText(childMenuLinkText));
		
		System.out.println("PROGRAM OVER--");
	}
	
	public  void multiLevelMenuChildMenuHandle(By parentMenuLocator,String level2LinkText,
			String level3LinkText,String level4LinkText) throws InterruptedException
	{
		WebElement level1 = driver.findElement(parentMenuLocator);
		
		Actions act = new Actions(driver);
		act.moveToElement(level1).build().perform();
		Thread.sleep(3000);
		
		WebElement level2 = driver.findElement(By.linkText(level2LinkText));
		act.moveToElement(level2).build().perform();
		Thread.sleep(3000);
		
		WebElement level3 = driver.findElement(By.linkText(level3LinkText));
		
		act.moveToElement(level3).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText(level4LinkText)).click();
		
		System.out.println("program over");

		
	}
	
//	****************************Wait-Util *********************************
	
	public  Alert waitForAlertJsPopUp(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 return wait.until(ExpectedConditions.alertIsPresent());
	}

	public  String alertJSGetText(int timeOut)
	{
		return waitForAlertJsPopUp(timeOut).getText();
	}
	
	public  void alertAccept(int timeOut)
	{
		 waitForAlertJsPopUp(timeOut).accept();
	}
	
	public  void alertDismiss(int timeOut)
	{
		 waitForAlertJsPopUp(timeOut).dismiss();
	}
	
	public  void EnterAlertValue(int timeOut,String value)
	{
		 waitForAlertJsPopUp(timeOut).sendKeys(value);
		 
	}



	


}
