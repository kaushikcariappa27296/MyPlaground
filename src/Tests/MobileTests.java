package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MobileTests {
	@Test(dataProvider = "testUserData")
//	@Parameters({ "URL", "username" })
	void addMobileTests(String d, String e) {
		System.out.println(d + e);
	}

	@Test(groups = { "smoke" })
	void apkinstallation() {

	}

	@DataProvider
	public Object[][] testUserData() {
		Object[][] a = new Object[1][2];
		a[0][0] = "amma";
		a[0][1] = "lover";
//		System.out.println(a);
		return a;

	}
}
