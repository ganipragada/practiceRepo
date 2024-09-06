package practiceTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BooksAndPens {
	@Test(groups = { "Regression", "Smoke" })
	@Parameters({ "URL" })
	public void book1(String urlName) {
		System.out.println("book1");
		System.out.println(urlName);
	}

	@Test
	public void book2() {
		System.out.println("book2");
	}

	@Test
	public void book3() {
		System.out.println("book3");
	}

	@Test(groups = { "Smoke" })
	public void book4() {
		System.out.println("book4");
	}

	@Test
	public void book5() {
		System.out.println("book5");
	}

	@Test
	public void book6() {
		System.out.println("book6");
	}

	@Test(groups = { "Regression", "Smoke" })
	public void pen1() {
		System.out.println("pen 1");
	}

	@Test
	public void pen2() {
		System.out.println("pen 2");
	}

	@Test(groups = { "Regression" },dataProvider="getData")
	public void pen3(String uname, String password) {
		System.out.println("pen 3");
		System.out.println(uname);
		System.out.println(password);
	}

	@Test
	public void pen4() {
		System.out.println("pen 4");
	}

	@Test(dependsOnMethods = { "book6" })
	public void pen5() {
		System.out.println("pen 5");
	}

	@Test
	public void pen6() {
		System.out.println("pen 6");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "gani";
		data[0][1] = "1995";
		data[1][0] = "suresh";
		data[1][1] = "1997";
		data[2][0] = "raja";
		data[2][1] = "1999";
		return data;
	}

}
