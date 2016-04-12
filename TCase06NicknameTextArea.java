import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


// This test case checks if text area for nickname input is enabled on the web page
// after clicking on "Зарегистрироваться" link

// EXPECTED RESULT: text area for nickname input is enabled
// Pass/fail: pass

public class TCase06NicknameTextArea {

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
		boolean enabled = nnTextArea.isEnabled();
		assertTrue(enabled);	
	}
}
