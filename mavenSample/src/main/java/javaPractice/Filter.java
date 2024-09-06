package javaPractice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Filter {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("[id='search-field']")).sendKeys("Tomato");
		List<WebElement> elements =  driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> filterList =elements.stream().filter(s->s.getText().contains("Tomato")).collect(Collectors.toList());
		Assert.assertEquals(elements, filterList);
	}

}
