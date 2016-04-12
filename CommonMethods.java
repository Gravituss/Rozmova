import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


// This class contains xpath locators and ids for web elements and
// some routine methods that used often

public class CommonMethods {
	
	//--------------------------- Constants for input
	
	public static final String IN_EMAIL_TEXT_AREA_REG = "d45llk556dfldkss53@gmail.com";
	public static final String IN_NAME_TEXT_AREA_REG = "Harry";
	public static final String IN_SURNAME_TEXT_AREA_REG = "Bitkinson";
	public static final String IN_NICKNAME_TEXT_AREA_REG = "Ladlkfdjlfk6546";
	public static final String IN_PASSWD_TEXT_AREA_REG = "kjhkuh65";
	public static final String IN_PASSWD_AGAIN_TEXT_AREA_REG = "lrdss6846";
	//-----
	public static final String IN_DAY_OF_BIRTH_REG = "8";
	public static final String IN_MONTH_OF_BIRTH_REG = "декабря";
	public static final String IN_YEAR_OF_BIRTH_REG = "1987";
	
	//------------------------------ Locators
	
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
	
	//--------------------------- Locators++
	
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
	
	public static void putTextIntoTextAreaWithID(String text, String id){
		
		WebElement targetTextArea = driver.findElement(By.id(id));
		targetTextArea.sendKeys(text);
	}
	
	public static void selectTextInComboboxWithID(String text, String id){
		
		WebElement targetCombobox = driver.findElement(By.id(id));
		Select dropdown = new Select(targetCombobox);
		dropdown.selectByVisibleText(text);
	}
	
	public static void fillingRegFormWithTemplateData(){
		
		putTextIntoTextAreaWithID(IN_EMAIL_TEXT_AREA_REG, ID_EMAIL_TEXT_AREA_REG);
		putTextIntoTextAreaWithID(IN_NAME_TEXT_AREA_REG, ID_NAME_TEXT_AREA_REG);
		putTextIntoTextAreaWithID(IN_SURNAME_TEXT_AREA_REG, ID_SURNAME_TEXT_AREA_REG);
		putTextIntoTextAreaWithID(IN_NICKNAME_TEXT_AREA_REG, ID_NICKNAME_TEXT_AREA_REG);
		putTextIntoTextAreaWithID(IN_PASSWD_TEXT_AREA_REG, ID_PASSWD_TEXT_AREA_REG);
		putTextIntoTextAreaWithID(IN_PASSWD_TEXT_AREA_REG, ID_PASSWD_AGAIN_TEXT_AREA_REG);
		
		selectTextInComboboxWithID(IN_DAY_OF_BIRTH_REG, ID_DAY_OF_BIRTH_REG);
		selectTextInComboboxWithID(IN_MONTH_OF_BIRTH_REG, ID_MONTH_OF_BIRTH_REG);		
		selectTextInComboboxWithID(IN_YEAR_OF_BIRTH_REG, ID_YEAR_OF_BIRTH_REG);		
	}
	
	public static void clickCheckboxAndPushRegister(){
		
		driver.findElement(By.id(ID_AGREED_CHECKBOX_REG)).click();
		driver.findElement(By.xpath(LOCATOR_BUTTON_REG)).click();
	}
	
	public static boolean verifyNickLabelIsEnabled(){
		
		WebElement nickLabel = CommonMethods.driver.findElement(By.xpath(CommonMethods.LOCATOR_NICK_LABEL));
		boolean check = nickLabel.isEnabled();
		return check;
	}
}
