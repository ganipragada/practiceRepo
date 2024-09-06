package practiceTestNg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Prac {
	@BeforeMethod
	public void m1()
	{
		System.out.println("m1");
	}
	@Test
	public void m2()
	{
		System.out.println("m2");
	}
	@Test
	public void m3()
	{
		System.out.println("m3");
	}
}
