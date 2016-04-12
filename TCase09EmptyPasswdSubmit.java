import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TCase09EmptyPasswdSubmit {
	
	public static final String NICK_NAME = "Galileo6548996";

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
		
		WebElement nickLabel = CommonMethods.driver.findElement(By.xpath("//*[@class='part-left']//*[@for='login_nickname']"));
		WebElement nnTextArea = CommonMethods.driver.findElement(By.id("login_nickname"));
		WebElement enterButton = CommonMethods.driver.findElement(By.xpath("//*[contains(@class,'enter-submit')]"));
		
		// We enter a nickname and click Enter button
		nnTextArea.sendKeys(NICK_NAME);
		enterButton.click();
		
		// If nickLabel is enabled then we are still at the same web page and the web site didn't allow
		// entering without password
		boolean enabled = nickLabel.isEnabled();
		assertTrue(enabled);		
	}
}
