import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


// This test case checks if "Parol" text is enabled on the web page 
// after clicking on "Zaregistrirovatsya" link

// EXPECTED RESULT: "Parol" text is enabled
// Pass/fail: pass

public class TCase04Password {

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
		
		WebElement passLabel = CommonMethods.driver.findElement(By.xpath(CommonMethods.LOCATOR_PASSWORD_LABEL));
		boolean enabled = passLabel.isEnabled();
		assertTrue(enabled);			
	}
}
