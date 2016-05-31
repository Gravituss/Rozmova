import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


// This test case checks if "Zabyli parol?" link works

// EXPECTED RESULT: "Zabyli parol?" link works
// Pass/fail: pass

public class TCase05ForgotPasswdLink {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		CommonMethods.driver.quit();
	}

	@Test
	public void test() {
		
		CommonMethods.openPageSelectRussianAndClickRegister();
		
		WebElement forgotPasswdLink = CommonMethods.driver.findElement(By.xpath(CommonMethods.LOCATOR_FORGOT_PWD_LINK));
		forgotPasswdLink.click();
		
		// We check if forgotPasswdLink works by clicking on it and checking if target page contains 
		// path /core/auth/forgot
		boolean linkWorks;
		if (CommonMethods.driver.getCurrentUrl().contains("/core/auth/forgot")){
			linkWorks = true;
		} else linkWorks = false;
		
		assertTrue(linkWorks);			
	}
}
