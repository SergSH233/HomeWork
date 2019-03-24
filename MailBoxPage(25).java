package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailBoxPage {
	
	WebDriver driver;

	@FindBy(xpath = ".//div[@data-id=\"1:bf937094fe295231:0\"]//div[@class=\"b-checkbox__box\"]")
	private WebElement selectLetter;

	@FindBy(xpath = ".//div[@data-id=\"1:1b8db2d4d10ad2ae:0\"]//div[@class=\"b-checkbox__box\"]")
	private WebElement selectLetter2;

	@FindBy(xpath = ".//div[@data-id=\"1:735ca3d36773f411:0\"]//div[@class=\"b-checkbox__box\"]")
	private WebElement selectLetter3;

	@FindBy(xpath = ".//div[@data-shortcut=\"ctrl+a|command+a\"]")
	private WebElement selectNoLetter;

	@FindBy(xpath = ".//div[@class=\"js-item-checkbox b-datalist__item__cbx\"]//div[@data-id=\"0:15520519330000000961:950\"]")
	private WebElement selectLetterInSpam;
	@FindBy(xpath = "//*[@id=\"b-toolbar__right\"]/div[2]/div/div[2]/div[3]/div/span")
	private WebElement spamButton;

	@FindBy(xpath = "//*[@id=\"b-toolbar__right\"]/div[3]/div/div[2]/div[3]/div/span")
	private WebElement noSpamButton;

	@FindBy(xpath = ".//div[@data-id=\"500000\"]")
	private WebElement sent;

	@FindBy(xpath = ".//div[@data-id=\"950\"]")
	private WebElement spam;

	@FindBy(xpath = ".//a[@class=\"b-nav__link\"]//i[@class=\"ico ico_folder ico ico_folder_inbox\"]")
	private WebElement incoming;

	@FindBy(xpath = "//a[@id='PH_logoutLink']")
	private WebElement logoutLink;
	

	public MailBoxPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSelectLetter() {
		selectLetter.click();
	}

	public void clickSelectLetterInSpam() {
		selectLetterInSpam.click();
	}

	public void clickSpamButton() {
		spamButton.click();
	}

	public void clickNoSpamButton() {
		noSpamButton.click();
	}

	public void clickSpamPackage() {
		spam.click();

	}

	public void clickIncomingPackage() {
		incoming.click();

	}

	public void selectLetterts() {
		selectLetter.click();
		selectLetter2.click();
		selectLetter3.click();
	}

	public void noSelect() {
		selectNoLetter.click();
	}
	

	public void waitSpamPackage(WebDriver driver) {
		WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@id=\"b-nav_folders\"]/div/div[5]/a/span[2]")));
	}

	public void waitIncomingPackage(WebDriver driver) {
		WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath(".//a[@class=\"b-nav__link\"]//i[@class=\"ico ico_folder ico ico_folder_inbox\"]")));
	}
	
}
