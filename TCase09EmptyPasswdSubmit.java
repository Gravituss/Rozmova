import static org.junit.Assert.*;


// This test case checks if the web site operates properly our trying to submit form
// without password

// EXPECTED RESULT: After pushing "Войти" button web page is the same
// Pass/fail: pass

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TCase09EmptyPasswdSubmit {
	
	public static final String NICK_NAME = "Galileo6548996";

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
		
		WebElement nnTextArea = CommonMethods.driver.findElement(By.id(CommonMethods.ID_NICKNAME_TEXT_AREA));
		WebElement enterButton = CommonMethods.driver.findElement(By.xpath(CommonMethods.LOCATOR_ENTER_BUTTON));
		
		// We enter a nickname and click Enter button
		nnTextArea.sendKeys(NICK_NAME);
		enterButton.click();
		
		// If nickLabel is enabled then we are still at the same web page and the web site didn't allow
		// entering without password
		boolean enabled = CommonMethods.verifyNickLabelIsEnabled();
		assertTrue(enabled);		
	}
}
