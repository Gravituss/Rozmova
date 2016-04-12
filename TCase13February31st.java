import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


// This test case checks if the web site operates properly our trying to submit form
// with birthday February, 31st

// EXPECTED RESULT: After pushing register button web page is the same
// Pass/fail: pass

public class TCase13February31st {

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
		CommonMethods.fillingRegFormWithTemplateData();
		
		CommonMethods.selectTextInComboboxWithID("31", CommonMethods.ID_DAY_OF_BIRTH_REG);
		CommonMethods.selectTextInComboboxWithID("февраля", CommonMethods.ID_MONTH_OF_BIRTH_REG);
		
		CommonMethods.clickCheckboxAndPushRegister();
		boolean enabled = CommonMethods.verifyNickLabelIsEnabled();
		assertTrue(enabled);		
	}

}
