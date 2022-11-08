package seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firstscript {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

	}

	@Test
	public void demo() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@AfterMethod
	public void setdown() {
		driver.close();
	}

}
