import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonMethods {
	
	public static final String WEB_SITE_URL = "http://rozmova.in.ua/";
	public static final String LOCATOR_RUSSIAN_LANGUAGE = "//*[@class='language-select']//*[@href='/ru/?return=Lw==']";
	public static final String ID_REGISTER_LINK = "login_link";
	
	static WebDriver driver = new FirefoxDriver();
	
	// Waiting for the link "По-русски" to appear and clicking on it
	public static void inRussian(){

		WebDriverWait wait = new WebDriverWait(CommonMethods.driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(LOCATOR_RUSSIAN_LANGUAGE)));
		CommonMethods.driver.findElement(By.xpath(LOCATOR_RUSSIAN_LANGUAGE)).click();
	}
	
	// Waiting for the link "Зарегистрироваться" to appear and clicking on it
	public static void clickRegister(){
		
		WebDriverWait wait2 = new WebDriverWait(CommonMethods.driver, 10);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(
				By.id(ID_REGISTER_LINK)));
		CommonMethods.driver.findElement(By.id(ID_REGISTER_LINK)).click();
	}
	
	public static void openPageSelectRussianAndClickRegister(){
		
		CommonMethods.driver.get(CommonMethods.WEB_SITE_URL);
		CommonMethods.inRussian();
		CommonMethods.clickRegister();
	}
}
