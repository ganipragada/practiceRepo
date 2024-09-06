package practiceTestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VehicalLoan {
	@BeforeMethod
	public void carLoan() {
		System.out.println("carLoan");
	}
	@Test
	public void busLoan() {
		System.out.println("busLoan");
	}
	@AfterMethod
	public void tractorLoan() {
		System.out.println("tractorLoan");
	}
	@Test
	public void bikeLoan() {
		System.out.println("bikeLoan");
	}
}
