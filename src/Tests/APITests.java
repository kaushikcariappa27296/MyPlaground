package Tests;

import org.testng.annotations.Test;

public class APITests {
	@Test(groups = { "smoke" }, dependsOnMethods = { "Userdata" })
	public void DataTest() {

	}

	@Test(enabled = true)
	public void Userdata() {
		System.out.println("hjghjamma");
	}
}
