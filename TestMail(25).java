package Tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.DataTest;
import Pages.LoginPage;
import Pages.MailBoxPage;
import Pages.SendPage;

public class TestMail {
	private static final long TIMEOUT_FOR_IMPLICITLY = 10;
	private static final long TIMEOUT_FOR_LOAD = 10;
	private WebDriver driver;
	private LoginPage loginPage;
	private MailBoxPage mailBoxPage;
	private SendPage sendPage;
	private static DataTest dataTest;
	
	@BeforeClass
	public static void setUpTestData() throws Exception {
		dataTest = new DataTest("1");
	}
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(TIMEOUT_FOR_IMPLICITLY, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TIMEOUT_FOR_LOAD, TimeUnit.SECONDS);
		loginPage = new LoginPage(driver);
		mailBoxPage = new MailBoxPage(driver);
		sendPage = new SendPage(driver);
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testMailru() {
		driver.get("https://mail.ru/");
		loginPage.enterData(dataTest.getLogin(), dataTest.getPassword());
		loginPage.clickEnterButton();
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("��������"));
		assertTrue(loginPage.isLogoutLinkDisplayed(driver));
		mailBoxPage.clickSelectLetter();
		
		mailBoxPage.clickSpamButton();
		
		mailBoxPage.waitSpamPackage(driver);
		mailBoxPage.clickSpamPackage();
		mailBoxPage.waitIncomingPackage(driver);
		mailBoxPage.clickSelectLetterInSpam();
		mailBoxPage.clickNoSpamButton();
		mailBoxPage.waitIncomingPackage(driver);
		mailBoxPage.clickIncomingPackage();
		
		sendPage.clickNewLetter();
		sendPage.waitNewLetterPage(driver);
		sendPage.enterEmail(dataTest.getRecepient(),dataTest.getMessagesubject());
		sendPage.clickSend();
		sendPage.waitConfirm(driver);
		sendPage.clickConfirm();
		
		mailBoxPage.waitIncomingPackage(driver);
		mailBoxPage.clickIncomingPackage();
		mailBoxPage.selectLetterts();
		mailBoxPage.waitIncomingPackage(driver);
		mailBoxPage.noSelect();

	
	}
		
	}

