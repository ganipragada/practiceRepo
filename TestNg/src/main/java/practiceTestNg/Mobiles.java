package practiceTestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mobiles {
	@AfterMethod
	public void iphone() {
		System.out.println("i phone 99999 @AfterMethod");

	}
@Test
	public void nokia() {
		System.out.println("nokia 49999 @Test");

	}
@Test
	public void realme() {
		System.out.println("real me 39999 @Test");
	}

@Test
public void redme() {
		System.out.println("redme 29999 @Test");

	}
@Test
	public void vivo() {
		System.out.println("vivo 79999 @Test");

	}
@Test
	public void oppo() {
		System.out.println("oppo 29999 @Test");

	}
@Test
	public void onePlus() {
		System.out.println("onePlus 89999 @Test");

	}
@BeforeMethod
	public void jio() {
		System.out.println("jio 2999 @BeforeMethod");

	}
@Test
	public void blackBerry() {
		System.out.println("blackBerry 59888 @Test");

	}

}
