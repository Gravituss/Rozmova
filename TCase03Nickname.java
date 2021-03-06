import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


// This test case checks if "Nik" text is enabled on the web page 
// after clicking on "Zaregistrirovatsya" link

// EXPECTED RESULT: "Nik" text is enabled
// Pass/fail: pass

public class TCase03Nickname {

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
		
		WebElement nickLabel = CommonMethods.driver.findElement(By.xpath(CommonMethods.LOCATOR_NICK_LABEL));
		boolean enabled = nickLabel.isEnabled();
		assertTrue(enabled);		
	}
}
