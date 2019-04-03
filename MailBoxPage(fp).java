package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MailBoxPage extends AbstractPage{
	
	@FindBy(xpath = ".//div[@data-id=\"1:bf937094fe295231:0\"]//div[@class=\"b-checkbox__box\"]")
	private WebElement selectLetter;

 	@FindBy(xpath = ".//div[@data-id=\"1:1b8db2d4d10ad2ae:0\"]//div[@class=\"b-checkbox__box\"]")
	private WebElement selectLetter2;

 	@FindBy(xpath = ".//div[@data-id=\"1:735ca3d36773f411:0\"]//div[@class=\"b-checkbox__box\"]")
	private WebElement selectLetter3;

 	@FindBy(xpath = ".//div[@data-shortcut=\"ctrl+a|command+a\"]")
	private WebElement selectNoLetter;
 	
 	@FindBy(xpath = "(//a[@data-name='compose'])[1]")
	private WebElement writeLetterButton;

 	@FindBy(xpath = ".//div[@class=\"js-item-checkbox b-datalist__item__cbx\"]//div[@data-id=\"0:15520519330000000961:950\"]")
	private WebElement selectLetterInSpam;
 	
 	@FindBy(xpath = "(.//*[@data-original-name='To'])[1]")
	private WebElement letterRecipient;
 	
 	@FindBy(xpath = ".//*[@name='Subject']")
	private WebElement topicLetter;
	
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

 	@FindBy(xpath = ".//div[@class=\"b-layer__container\"]//button[@data-id=\"approve\"]")
	private WebElement accept;
 	
 	@FindBy(xpath = ".//button[@data-id=\"approve\"]")
 	private WebElement moveToSPAM;
 	
 	@FindBy(xpath = ".//div[@class='message-sent__title']")
	private WebElement messageSentTitle;
 	
 	@FindBy(xpath = "//iframe")
	public WebElement iframeTextMessage;
 	
 	@FindBy(xpath = "(//div[@data-name='send'])[1]")
	public WebElement sendButton;
 	
 	@FindBy(xpath = "(.//div[@data-shortcut=\"ctrl+a|command+a\"])[4]")
 	public WebElement selectAll;

 	
 	@FindBy(xpath = "(.//div[@class=\"js-item-checkbox b-datalist__item__cbx\"])[4]")
 	private WebElement myLetter;


 	public MailBoxPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

 	public void clickSelectLetter() {
		selectLetter.click();
	}

 	public void clickSelectLetterInSpam() {
 		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[@data-id=\"1:bf937094fe295231:0\"]//div[@class=\"b-checkbox__box\"]")));
		selectLetterInSpam.click();
	}
 	public void sentLetter(String receivers, String topic, String text) {
		writeLetterButton.click();
		letterRecipient.sendKeys(receivers);
		topicLetter.sendKeys(topic);
		enterMessage(text);
		sendButton.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(messageSentTitle));
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
		driver.navigate().refresh();

 	}

 	public void selectLetterts() {
		selectLetter.click();
		selectLetter2.click();
		selectLetter3.click();
	}

 	public void noSelect() {
		selectNoLetter.click();
	}
	public void acceptSpam() {
		accept.click();
	}
	public void moveToSpam(WebDriver driver) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//button[@data-id=\"approve\"]")));
		moveToSPAM.click();
		
	}
	public boolean lattersAreMarked(WebDriver driver ){
		return selectAll.isEnabled();
		
	}

 	public void waitSpamPackage(WebDriver driver) {
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@id=\"b-nav_folders\"]/div/div[5]/a/span[2]")));
	}
 	public void goToIncomingFolder() {
		wait.until(ExpectedConditions.visibilityOf(incoming));
		incoming.click();
	}
 	public List<WebElement> getLettersList() {
		return getLettersList();
	}
 	public void enterMessage(String message) {
		driver.switchTo().frame(iframeTextMessage).findElement(By.xpath("//body")).sendKeys(message);
		driver.switchTo().defaultContent();
	}
 	public String getMessageSentTitle() {
		return messageSentTitle.getText();
	}
 	
 	public List<WebElement> getMarkTheFlag() {
		return getMarkTheFlag();
	}
 	public WebElement selectLettersAll(){
 		return selectLetter3;
 	}

 	public void waitIncomingPackage(WebDriver driver) {
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(.//div[@class=\"js-item-checkbox b-datalist__item__cbx\"])[4]"))));
	}
	public void waitSpamEmail(WebDriver driver) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("b-layer__container")));
	}
	public boolean iSeeLetter (WebDriver driver) {
		return myLetter.isDisplayed();
		
	}

}
