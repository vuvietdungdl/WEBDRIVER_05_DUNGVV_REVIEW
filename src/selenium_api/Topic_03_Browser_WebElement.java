package selenium_api;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_03_Browser_WebElement {
    WebDriver driver;
    
	@BeforeClass
	public void beforeClass() {
		
		// Chay bang Chrome
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Chay bang Frifox
//		driver = new FirefoxDriver();		
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		
		//Chay bang IE
//		System.setProperty("webdriver.ie.driver", ".\\driver\\IEDriverServer.exe");
//		driver = new InternetExplorerDriver();		
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		
	}

	// @Test
	public void TC_01() throws InterruptedException {
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
