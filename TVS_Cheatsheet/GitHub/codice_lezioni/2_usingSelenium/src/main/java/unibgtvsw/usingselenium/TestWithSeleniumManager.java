package unibgtvsw.usingselenium;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class TestWithSeleniumManager {
	@Test
	public void openPage() throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
		Thread.sleep(5000); // Let the user actually see something!
        driver.get("http://www.google.com/");
		Thread.sleep(5000); // Let the user actually see something!
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();
		Thread.sleep(5000); // Let the user actually see something!
		driver.quit();
	}

}