import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


// This test case checks if the web site operates properly our trying to submit form
// without nickname

// EXPECTED RESULT: After pushing "Voyti" button web page is the same
// Pass/fail: pass

public class TCase10EmptyNicknameSubmit {
	
	public static final String PASSWORD = "Geo75891";

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
		
		WebElement pwdTextArea = CommonMethods.driver.findElement(By.id(CommonMethods.ID_PASSWORD_TEXT_AREA));
		WebElement enterButton = CommonMethods.driver.findElement(By.xpath(CommonMethods.LOCATOR_ENTER_BUTTON));
		
		// We enter our password and click Enter button
		pwdTextArea.sendKeys(PASSWORD);
		enterButton.click();
		
		// If nickLabel is enabled then we are still at the same web page and the web site didn't allow
		// entering without nickname
		boolean enabled = CommonMethods.verifyNickLabelIsEnabled();
		assertTrue(enabled);		
	}
}
