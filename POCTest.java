package math.operation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POCTest {

	WebDriver driver = null;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/sabyasachi/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/JACPOC");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		WebElement First = driver.findElement(By.name("first"));
		First.sendKeys("5");
		WebElement Second = driver.findElement(By.name("second"));
		Second.sendKeys("11");
		WebElement Submit = driver.findElement(By.id("submitbtn"));
		Thread.sleep(3000);
		Submit.click();
		
	}

}
