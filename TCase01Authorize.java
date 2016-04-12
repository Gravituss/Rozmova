import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



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
		
		WebElement authorize = CommonMethods.driver.findElement(By.id("ui-dialog-title-auth_dialog"));
		boolean enabled = authorize.isEnabled();
		assert(enabled);
	}
}
