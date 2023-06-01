package TestNGSessions;

//Assert for multiplication.division.
//datatype
//two doubles,2strings,2character,2int,2float
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssignment {
	@Test
	public void FirstMethodTest() {
		System.out.println("Hi Aswin,This is your first Method");
	}

	@Test
	public void integerTest() {
		int a = 5;
		Assert.assertEquals(a, 5);
//		Assert.assertEquals(a,"7");
	}

	@Test
	public void FloatTest() {
		float f = 3.14f;
		Assert.assertEquals(f, 3.14f);
	}

	@Test
	public void additionTest() {
		int a = 5;
		int b = 15;
		int c = 6;
		int sum = a + b + c;
		Assert.assertEquals(sum, 26);

	}

	@Test
	public void subtractionTest() {
		int a = 7;
		int b = 3;
		int c = a + b;
		int sub = a - b - c;
		Assert.assertEquals(sub, -6);
	}

	@Test
	public void divisonTest() {
		int a = 6;
		int b = 5;
		int div = 6 / 5;
		Assert.assertEquals(div, 1);
	}

	@Test
	public void multiplicationTest() {
		int num1 = 50;
		int num2 = 75;
		int multiply = num1 * 1;
		int multiply2 = num1 * num2;
		Assert.assertEquals(multiply2, 3750);
	}
	@Test
	public void assertAddasFalse()
	{
		int a =5;int b=5;
		Assert.assertFalse(a==b);
	}
	
	@Test
	public void assertsubtractValueasFalse()
	{
		int a =5;int b=5;
		int sub=a-b;
		
		Assert.assertFalse(sub>a);
		
	}
	
	

}