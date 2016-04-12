import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TCase05ForgotPasswdLink {

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
		
		WebElement forgotPasswdLink = CommonMethods.driver.findElement(By.xpath("//*[@class='part-left']//*[@href='/core/auth/forgot']"));
		forgotPasswdLink.click();
		
		boolean linkWorks;
		if (CommonMethods.driver.getCurrentUrl().contains("/core/auth/forgot")){
			linkWorks = true;
		} else linkWorks = false;
		
		assert(linkWorks);			
	}
}
