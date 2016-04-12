import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TCase01Authorize {
	
	static WebDriver driver = new FirefoxDriver();
	public static final String WEB_SITE_URL = "http://rozmova.in.ua/";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
	
		driver.get(WEB_SITE_URL);
		CommonMethods.selectRussianAndClickRegister();
		
		WebElement authorize = TCase01Authorize.driver.findElement(By.id("ui-dialog-title-auth_dialog"));
		boolean enabled = authorize.isEnabled();
		assert(enabled);
	}
}
