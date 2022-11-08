package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass2 {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

	}

	@Test
	public void mango() {
		System.out.println("mango");
	}

	@Test
	public void mobil() {
		System.out.println("mokiy");
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
