import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


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
		
		WebElement nnTextArea = CommonMethods.driver.findElement(By.id("login_nickname"));
		boolean enabled = nnTextArea.isEnabled();
		assertTrue(enabled);	
	}
}
