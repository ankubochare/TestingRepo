package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass1 {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

	}

	@Test
	public void apple() {
		System.out.println("apple");
	}

	@Test
	public void mobil() {
		System.out.println("i-phone");
	}

	@Test
	public void animal() {
		System.out.println("fox	");
	}

	@AfterMethod
	public void setdown() {
		driver.close();
	}

}
