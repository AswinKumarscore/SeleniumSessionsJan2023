package SeleniumSessions;

public class Verify {
	public static boolean equalValuesTitle(String actResult,String expResult)
	{
		if(actResult.equals(expResult))
		{
			return true;
		}
		return false;
	}
	
	public static boolean containValuesTitle(String actResult,String expResult)
	{
		if(actResult.contains(expResult))
		{
			return true;
		}
		return false;
	}
	
	public static boolean containsURL(String actResult,String expResult)
	{
		if(actResult.contains(expResult))
		{
		return true;
	}
		return false;
	}
}
