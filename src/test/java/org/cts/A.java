package org.cts;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
static WebDriver driver;
@BeforeClass
	public static void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Prudhvi\\Junit\\driver\\chromedriver.exe");
	driver  = new ChromeDriver();
}
	@AfterClass
	public static void quitBroweser() {
		driver.quit();
	}
	@Test
	public void tc1() {
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("b.sravani123");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("srav");
		WebElement button = driver.findElement(By.id("loginbutton"));
		button.click();
	}
	@Test
	public void tc2() {
		driver.get("http://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("123456");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("qwert");
		WebElement button = driver.findElement(By.id("loginbutton"));
		button.click();
	}
		@After
		public void endTime() {
			Date d = new Date();
			System.out.println(d);
		}
		@Before
		public void startTime() {
			Date d = new Date();
			System.out.println(d);
		}
			
		
	}

