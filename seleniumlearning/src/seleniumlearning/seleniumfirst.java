package seleniumlearning;

import org.testng.annotations.Test;

public class seleniumfirst {

	@Test(priority = 2)
	public void apple() {
		System.out.println("apple");
	}

	@Test(priority = 3)
	public void mobil() {
		System.out.println("i-phone");
	}

	@Test(priority = 1)
	public void animal() {
		System.out.println("fox	");
	}

}
