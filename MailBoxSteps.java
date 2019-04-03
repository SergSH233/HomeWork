package MailBoxStep;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import DataBase.DataBaseforMail;
import Pages.LoginPage;
import Pages.MailBoxPage;
import Screenshot.Screenshot;
import WebDriver.WebDriverSingleton;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MailBoxSteps {
	private Pages.LoginPage loginPage;
	private Pages.MailBoxPage mailboxPage;
	private WebDriver driver;
	private DataBaseforMail userData;

	public MailBoxSteps() {
		driver = WebDriverSingleton.getWebDriverInstance();
		loginPage = new LoginPage(driver);
		mailboxPage = new MailBoxPage(driver);
		userData = new DataBaseforMail();
	}

	@Given("^I am on main application page$")
	public void loadMainPages() throws SQLException {
		driver.get(userData.getURL());
		loginPage.enterLoginAndPass(userData.getLogin(), userData.getPassword());
		loginPage.clickEnterButton();

	}

	@When("^I mark the letter$")
	public void markTheLetter() throws InterruptedException {
		Thread.sleep(3500);
		mailboxPage.clickSelectLetter();
	}

	@When("^I mark the spam letter$")
	public void markTheSpamLetter() throws InterruptedException {
		Thread.sleep(3500);
		mailboxPage.clickSpamPackage();
		mailboxPage.clickSelectLetter();
		mailboxPage.clickNoSpamButton();
	}

	@When("^I navigate to incoming folder$")
	public void navigateToIncomingFolder() {
		mailboxPage.goToIncomingFolder();
		try {
			Screenshot.makeScreenshot(driver);
		} catch (IOException e) {
		}
	}

	@When("^I mark latters by flag$")
	public void markLettersByFlag() {
		mailboxPage.selectLetterts();
		try {
			Screenshot.makeScreenshot(driver);
		} catch (IOException e) {
		}
	}

	@When("^I remove all flags from letters$")
	public void unmarkFlagFromLetters() {
		mailboxPage.noSelect();
		try {
			Screenshot.makeScreenshot(driver);
		} catch (IOException e) {
		}
	}

	@When("^I sent mail to the group of users$")
	public void sentMailToGroupOfUsers() throws SQLException {
		mailboxPage.sentLetter(userData.getRecipient(), userData.getRecipient(), userData.getMessSubject());
	}

	@And("^I send a letter to spam$")
	public void sendLetter() throws InterruptedException {
		mailboxPage.clickSpamButton();
		mailboxPage.moveToSpam(driver);
	}

	@And("^I click to inbox$")
	public void clickToInbox() throws InterruptedException {
		mailboxPage.clickIncomingPackage();
	}

	@Then("^I see a letter in spam$")
	public void iSeeLetterinSpam() throws InterruptedException {
		mailboxPage.clickSpamPackage();
		mailboxPage.waitSpamPackage(driver);

		Assert.assertTrue(mailboxPage.iSeeLetter(driver));
	}

	@Then("^I see a letter in inbox$")
	public void iSeeLetterininbox() throws InterruptedException {
		Thread.sleep(3500);
		Assert.assertTrue(mailboxPage.iSeeLetter(driver));
	}

	@Then("^I see latters are unmarked$")
	public void checkUnmarkedLatters() {
		assertFalse(mailboxPage.getMarkTheFlag().size() > 0);
		try {
			Screenshot.makeScreenshot(driver);
		} catch (IOException e) {}
		}

	@Then("^I see Latters are marked$")//!!!!!
	public void checkMarkedLatters() {
		assertTrue(mailboxPage.lattersAreMarked(driver));
		try {
			Screenshot.makeScreenshot(driver);
		} catch (IOException e) {}
		}

	@Then("^I see \"([^\"]*)\" notification$")
	public void messageSentNotification(String massage) {
		assertEquals(mailboxPage.getMessageSentTitle(), massage);
		try {
			Screenshot.makeScreenshot(driver);
		} catch (IOException e) {
		}
	}

	@After
	public void afterClass() {
		WebDriverSingleton.driverQuit();
	}

}
