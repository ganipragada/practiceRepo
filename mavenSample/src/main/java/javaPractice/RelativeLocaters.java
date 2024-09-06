package javaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocaters {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//above
		WebElement nameText = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameText)).getText());
		//bellow
		WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
		//toLeft
		WebElement left = driver.findElement(By.xpath("//label[contains(text(),'Check me out if you Love IceCreams!')]"));
	   driver.findElement(with(By.tagName("input")).toLeftOf(left)).click();
	   //toRight
	   WebElement right =driver.findElement(By.id("inlineRadio1"));
	   System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(right)).getText());
		
		
		
	}

}
