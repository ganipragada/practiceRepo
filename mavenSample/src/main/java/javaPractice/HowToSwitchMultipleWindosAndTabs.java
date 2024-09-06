package javaPractice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HowToSwitchMultipleWindosAndTabs {
	/**
	 * this method will fach the first course name and give that name into course
	 * name text feelds
	 * 
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// open new child tab
		driver.switchTo().newWindow(WindowType.TAB);// if we want new tab give ".Window"
		// give the specific names to each tab
		Set<String> handel = driver.getWindowHandles();
		Iterator<String> it = handel.iterator();
		String parent = it.next();
		String child = it.next();
		// swich to naw tab (child tab)
		driver.switchTo().window(child);
		// open the another website fach the cource name
		driver.navigate().to("https://rahulshettyacademy.com");
		String courceName = driver.findElement(By.xpath("(//div[@class='container-fluid'])[3]/div[2]/div[1]"))
				.getText();
		// switch to parent window and fill cource name text field
		driver.switchTo().window(parent);
		WebElement element = driver.findElement(By.cssSelector("[name='name']"));
		element.sendKeys(courceName);
		// tack the particular screen shot
		File file = element.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("C:\\Users\\91798\\OneDrive\\Desktop\\Screenshot\\cource.png"));
		//tack the cource text box dimentions
		double hight = element.getRect().getDimension().getHeight();
		double width = element.getRect().getDimension().getWidth();
		System.out.println(hight);
		System.out.println(width);
	}

}
