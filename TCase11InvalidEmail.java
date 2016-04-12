import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;


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
		
		CommonMethods.driver.findElement(By.id(CommonMethods.ID_EMAIL_TEXT_AREA_REG)).sendKeys("dlksl1235");
		
		CommonMethods.clickCheckboxAndPushRegister();
		
		boolean enabled = CommonMethods.verifyNickLabelIsEnabled();
		assertTrue(enabled);	
	}
}
