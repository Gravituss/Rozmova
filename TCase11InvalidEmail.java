import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;


// This test case checks if the web site operates properly our trying to submit form
// with invalid email

// EXPECTED RESULT: After pushing register button web page is the same
// Pass/fail: pass

public class TCase11InvalidEmail {

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
		CommonMethods.driver.findElement(By.id(CommonMethods.ID_NICKNAME_TEXT_AREA_REG)).clear();
		CommonMethods.driver.findElement(By.id(CommonMethods.ID_NICKNAME_TEXT_AREA_REG)).sendKeys(CommonMethods.generateRandomNickname());
		
		CommonMethods.driver.findElement(By.id(CommonMethods.ID_EMAIL_TEXT_AREA_REG)).sendKeys("dlksl1235");
		
		CommonMethods.clickCheckboxAndPushRegister();
		
		boolean enabled = CommonMethods.verifyNickLabelIsEnabled();
		assertTrue(enabled);	
	}
}
