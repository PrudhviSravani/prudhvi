package org.cts;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	static WebDriver driver;
	@BeforeClass
public static void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Prudhvi\\Junit\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	@AfterClass
	public static void quitBrowser() {
	driver.quit();
	}
	@Test
	public void tc1() {
	driver.get("https://www.facebook.com/");
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("b.sravani094@gmail.com");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("qwer");
	WebElement button = driver.findElement(By.id("loginbutton"));
	button.click();
	Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110"));
	}
	@Test
	public void tc2() {
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("b.sravani@gmail.com");
		Assert.assertEquals("b.sravani@gmail.com",user.getAttribute("value"));
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("raju");
		WebElement button = driver.findElement(By.id("loginbutton"));
		button.click();
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110"));

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
	
	

	