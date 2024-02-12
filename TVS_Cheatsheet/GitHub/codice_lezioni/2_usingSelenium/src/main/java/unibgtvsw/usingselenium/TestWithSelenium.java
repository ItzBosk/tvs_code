package unibgtvsw.usingselenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class TestWithSelenium {
	@Test
	public void login() throws InterruptedException {
		// declaration and instantiation of objects/variables
		/*
		 * System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver();
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\garganti\\programmi\\chromedriver_win32\\chromedriver.exe");
		// CHROME
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("Submit"));
		username.sendKeys("abc@gmail.com");
		password.sendKeys("your_password");
		login.click();
		String expectedUrl = "http://demo.guru99.com/test/newtours/login_sucess.php";
		Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
		driver.close();

	}

}