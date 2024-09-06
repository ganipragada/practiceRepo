package practiceTestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PersonalLoan {
	@BeforeSuite
	public void gani() {
		System.out.println("Gani loan @BeforeSuite");
	}
	
	@Test
	public void suresh() {
		System.out.println("Suresh loan");
	}
	
	@Test
	public void raja() {
		System.out.println("Raja loan");
	}
	
	@Test
	public void nikil() {
		System.out.println("he dont have a loan");
	}
	
	@AfterSuite
	public void praveen() {
		System.out.println("Praveen Loan @AfterSuite");
	}
	
	@Test
	public void ravi() {
		System.out.println(" Ravi Loan");
	}

}
