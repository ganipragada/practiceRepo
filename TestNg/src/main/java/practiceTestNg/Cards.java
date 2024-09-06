package practiceTestNg;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cards {
	@Test(groups= {"Regression"})
	public void creditCard()
	{
		System.out.println("credit card @Test");
	}
	@Test(groups= {"Smoke"})
	public void goldenCard()
	{
		System.out.println("goldencard @Test");
	}
	@BeforeTest(groups= {"Regression"})
	public void debitCard() {
		System.out.println("debt card @BeforeTest");
	}
	@AfterClass(groups= {"Smoke"})
	public void passBook() {
		System.out.println("pass book @AfterClass");
	}
	@BeforeClass
	public void greenCard() {
		System.out.println("green card @BeforeClass");
	}
}
