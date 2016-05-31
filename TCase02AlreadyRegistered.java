import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


// This test case checks if text "Uzhe zaregistrirovalis?" is enabled on the web page
// after clicking on "Zaregistrirovatsya" link

// EXPECTED RESULT: text "Uzhe zaregistrirovalis?" is enabled
// Pass/fail: pass

public class TCase02AlreadyRegistered {
	
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
		
		WebElement alreadyRegistered = CommonMethods.driver.findElement(By.xpath(CommonMethods.LOCATOR_ALREADY_REGISTERED));
		boolean enabled = alreadyRegistered.isEnabled();
		assertTrue(enabled);
	}
}
