package Core;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page.LoginPage;
import Page.MailBoxPage;
import Page.SendPage;

public class TestMail {
	private WebDriver driver;
	private LoginPage loginPage;
	private MailBoxPage mailBoxPage;
	private SendPage sendPage;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
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
		loginPage.enterData("pwtcursepam@mail.ru", "Apachi3110Map");
		loginPage.clickEnterButton();
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("¬ход€щие"));
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
		sendPage.enterEmail("serg_sh_@mail.ru   sergsh3006@gmail.com", "Test");
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
