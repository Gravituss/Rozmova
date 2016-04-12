import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TCase07PasswdTextArea {

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
		boolean enabled = pwdTextArea.isEnabled();
		assertTrue(enabled);			
	}
}
