package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass3 {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

	}

	@Test
	public void cherry() {
		System.out.println("cherry");
	}

	@Test
	public void mobile() {
		System.out.println("samsung");
	}

	@Test
	public void animal() {
		System.out.println("dog");
	}

	@AfterMethod
	public void setdown() {
		driver.close();
	}

}
