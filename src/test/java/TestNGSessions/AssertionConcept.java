package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {
	@Test
	public void searchTest()
	{
		String name ="Amazon";
		//Assert.assertEquals(ActualValue,ExpectedValue);
		Assert.assertEquals(name,"amazon");
	}

}
