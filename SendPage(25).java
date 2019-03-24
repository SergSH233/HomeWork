package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendPage {

	@FindBy(xpath = ".//div[@class=\"b-toolbar__item b-toolbar__item_with-foldings\"]")
	private WebElement newLetter;

	@FindBy(xpath = ".//textarea[@class=\"js-input compose__labels__input\"]")
	private WebElement enterEmails;

	@FindBy(xpath = ".//div[@class=\"compose-head__field\"]//input[@class=\"b-input\"]")
	private WebElement enterMessageSubject;

	@FindBy(xpath = ".//div[@data-shortcut-title=\"Ctrl+Enter\"]")
	private WebElement send;

	@FindBy(xpath = ".//tr[@id=\"toolkit-155212816001152middleRow_sht\"] //td[@class=\"mceIframeContainer mceFirst mceLast\"]//iframe[@id=\"toolkit-155212816001152composeEditor_ifr\"]")
	private WebElement textLetter;

	@FindBy(xpath = "//*[@id=\"MailRuConfirm\"]/div/div[2]/form/div[2]/button[1]/span")
	private WebElement confirm;

	public SendPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String email, String subject) {
		enterText(enterEmails, email);
		enterText(enterMessageSubject, subject);
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	private void enterSize(WebElement massage, String text) {
		massage.clear();
		massage.sendKeys(text);
	}

	public void clickNewLetter() {
		newLetter.click();
	}

	public void clickSend() {
		send.click();
	}

	public void clickConfirm() {
		confirm.click();
	}

	public void textEnter(String text) {
		enterSize(textLetter, text);
	}

	public void waitNewLetterPage(WebDriver driver) {
		WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.titleContains("����� ������"));
	}

	public void waitConfirm(WebDriver driver) {
		WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("is-compose-empty_in")));
	}

}
