import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;


// This test case checks if the web site operates properly our trying to submit form
// with birthday February, 31st

// EXPECTED RESULT: After pushing register button web page is the same
// Pass/fail: fail
// Comment: sometimes it fails, but not always.

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
		CommonMethods.driver.findElement(By.id(CommonMethods.ID_EMAIL_TEXT_AREA_REG)).clear();
		CommonMethods.driver.findElement(By.id(CommonMethods.ID_EMAIL_TEXT_AREA_REG)).sendKeys(CommonMethods.generateRandomEmail());		
		CommonMethods.driver.findElement(By.id(CommonMethods.ID_NICKNAME_TEXT_AREA_REG)).clear();
		CommonMethods.driver.findElement(By.id(CommonMethods.ID_NICKNAME_TEXT_AREA_REG)).sendKeys(CommonMethods.generateRandomNickname());
		
		CommonMethods.selectTextInComboboxWithID("31", CommonMethods.ID_DAY_OF_BIRTH_REG);
		CommonMethods.selectTextInComboboxWithID("февраля", CommonMethods.ID_MONTH_OF_BIRTH_REG);
		
		try{Thread.sleep(3000);}catch(Exception e){System.out.println(e);}
		CommonMethods.clickCheckboxAndPushRegister();
		boolean enabled = CommonMethods.verifyNickLabelIsEnabled();
		assertTrue(enabled);		
	}

}
