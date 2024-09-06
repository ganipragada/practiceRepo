package org.sample.mavenSample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Conditions of Use")).click();
		driver.manage().window().maximize();
		WebElement element =driver .findElement(By.cssSelector("a.nav-a.nav-a-2.nav-progressive-attribute:nth-child(2)"));
		Actions ac = new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.cssSelector("input[placeholder=\"Search Amazon\"]"))).click()
		.keyDown(Keys.SHIFT).sendKeys("iphone").build().perform();
		Thread.sleep(3000);
		ac.moveToElement(element).contextClick().build().perform();
		//ac.moveToElement(driver.findElement(By.cssSelector("input[placeholder=\"Search Amazon\"]"))).click().contextClick().build().perform();
		
	}
	}
