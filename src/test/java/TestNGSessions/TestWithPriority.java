package TestNGSessions;

import org.testng.annotations.Test;

public class TestWithPriority {
	
	@Test(priority = 1)
	public void searchTest()
	{
		System.out.println("Test--Search");
	}
	@Test(priority = 5)
	public void aTest()
	{
		System.out.println("Test--aTest");
	}
	
	@Test(priority = 2)
	public void addToCartTest()
	{
		System.out.println("Test--Add to Cart");
	}
	
	@Test(priority = 5)
	public void qTest()
	{
		System.out.println("Test--qTest");
	}
	
	@Test(priority = 4)
	public void paymentTest()
	{
		System.out.println("Test--Payment");
	}
	

}
