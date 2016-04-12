import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


// This test case checks if text "Авторизоваться на ROZMOVA.in.ua" is enabled on the web page
// after clicking on "Зарегистрироваться" link

// EXPECTED RESULT: text "Авторизоваться на ROZMOVA.in.ua" is enabled
// Pass/fail: pass

public class TCase01Authorize {
	
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
		
		WebElement authorize = CommonMethods.driver.findElement(By.id(CommonMethods.ID_AUTHORIZE_TEXT));
		boolean enabled = authorize.isEnabled();
		assertTrue(enabled);
	}
}
