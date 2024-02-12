package unibgtvsw.usingselenium;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWithSeleniumManagerFF {

	@Test
	public void openPage() throws InterruptedException {
		// setup firefox con webdrivermanager
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
		Thread.sleep(1000); // Let the user actually see something!
        driver.get("http://www.unibg.it/");
		Thread.sleep(1000); // Let the user actually see something!
		WebElement rubrica = driver.findElement(By.linkText("Rubrica"));
		rubrica.click();
		Thread.sleep(1000); // Let the user actually see something!
		WebElement nome = driver.findElement(By.name("nome_esteso_1"));
		nome.sendKeys("Gargantini");
		nome.submit();
		driver.quit();
	}

}