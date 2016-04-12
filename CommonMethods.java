import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


// This class contains xpath locators and ids for web elements and
// some routine methods that used often

public class CommonMethods {
	
	public static final String WEB_SITE_URL = "http://rozmova.in.ua/";
	public static final String LOCATOR_RUSSIAN_LANGUAGE = "//*[@class='language-select']//*[@href='/ru/?return=Lw==']";
	public static final String ID_REGISTER_LINK = "login_link";
	
	public static final String ID_AUTHORIZE_TEXT = "ui-dialog-title-auth_dialog";
	public static final String LOCATOR_ALREADY_REGISTERED = "//*[@class='part-left']//*[@class='s-title']";
	
	public static final String LOCATOR_NICK_LABEL = "//*[@class='part-left']//*[@for='login_nickname']";
	public static final String LOCATOR_PASSWORD_LABEL = "//*[@class='part-left']//*[@for='login_password']";
	public static final String LOCATOR_FORGOT_PWD_LINK = "//*[@class='part-left']//*[@href='/core/auth/forgot']";
	
	public static final String ID_NICKNAME_TEXT_AREA = "login_nickname";
	public static final String ID_PASSWORD_TEXT_AREA = "login_password";
	public static final String LOCATOR_ENTER_BUTTON = "//*[contains(@class,'enter-submit')]";
	
	//--------------------------- Constants for more test cases
	
	public static final String ID_EMAIL_TEXT_AREA_REG = "register_username";
	public static final String ID_NAME_TEXT_AREA_REG = "register_name";
	public static final String ID_SURNAME_TEXT_AREA_REG = "register_surname";
	public static final String ID_NICKNAME_TEXT_AREA_REG = "register_nickname";
	public static final String ID_PASSWD_TEXT_AREA_REG = "register_password";
	public static final String ID_PASSWD_AGAIN_TEXT_AREA_REG = "register_password_confirm";
	//-----
	public static final String ID_DAY_OF_BIRTH_REG = "register_b_day";
	public static final String ID_MONTH_OF_BIRTH_REG = "register_b_month";
	public static final String ID_YEAR_OF_BIRTH_REG = "register_b_year";
	//-----
	public static final String ID_AGREED_CHECKBOX_REG = "register_agreed";
	public static final String LOCATOR_BUTTON_REG = "//*[@role='button'][@onclick='register()']";
	
	//--------------------------- Constants for input
	
	public static final String IN_EMAIL_TEXT_AREA_REG = "dljfldjfldkss53@gmail.com";
	public static final String IN_NAME_TEXT_AREA_REG = "Harry";
	public static final String IN_SURNAME_TEXT_AREA_REG = "Bitkinson";
	public static final String IN_NICKNAME_TEXT_AREA_REG = "Ladlkfdjlfk6546";
	public static final String IN_PASSWD_TEXT_AREA_REG = "kjhkuh65";
	public static final String IN_PASSWD_AGAIN_TEXT_AREA_REG = "lrdss6846";
	//-----
	public static final String IN_DAY_OF_BIRTH_REG = "08";
	public static final String IN_MONTH_OF_BIRTH_REG = "декабря";
	public static final String IN_YEAR_OF_BIRTH_REG = "1987";
	
	//--------------------------------------------
	
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
