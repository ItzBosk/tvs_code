package unibgtvsw.usingselenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class TestWithSeleniumChromeDriverPATH {
	@Test
	public void openPage() throws InterruptedException {
		// declaration and instantiation of objects/variables
		/*
		 * System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver();
		 */
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\angel\\programmi\\chromedriver_win32\\chromedriver.exe");
		// CHROME
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com/");
		Thread.sleep(5000); // Let the user actually see something!
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Angelo Gargantini");
		searchBox.submit();
		Thread.sleep(5000); // Let the user actually see something!
		driver.quit();
	}

}