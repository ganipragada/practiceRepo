package practiceTestNg;

import org.testng.Assert;
import org.testng.ITestListener;


public class Listener implements ITestListener {
	public void m1() {
		Assert.assertTrue(false);
	}
}