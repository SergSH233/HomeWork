package Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage extends AbstractPage {
	
	
	private static final int LINK_PRESENSE_TIMEOUT = 40;
	

		private WebDriver driver;

	    @FindBy(xpath = ".//input[@id=\"mailbox:login\"]")
	    private WebElement loginField;

	    @FindBy(xpath = ".//input[@id=\"mailbox:password\"]")
	    private WebElement passwordField;

	    @FindBy(xpath = ".//label[@id=\"mailbox:submit\"]")
	    private WebElement buttonEnter;

	    @FindBy(xpath = "//*[@id='PH_logoutLink']")
	    private WebElement logoutLink;

	    @FindBy(xpath = ".//div[@id=\"mailbox:error\"]")
	    public WebElement logoutLinkError;
	    
	    @FindBy(xpath = "//i[@class='rate__icon rate__icon_usd o-media__img']")
	    public WebElement currencyConverterLink;
	    
	    @FindBy(xpath = "//a[@name=\"clb1283825\"]")
	    private WebElement weather;
	    
	    public LoginPage(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
				}
	    public void enterLoginAndPass(String login, String password)
	    {
	        loginField.clear();
	        loginField.sendKeys(login);
	        passwordField.clear();
	        passwordField.sendKeys(password);

	    }

	    public void clickEnterButton()
	    {
	        buttonEnter.click();
		}

		public boolean logoutLinkPresents() {
			new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOf(logoutLink));
			return logoutLink.isDisplayed();
				
		}

		public boolean logoutLinkErrorPresents() {
			return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(logoutLinkError)).isDisplayed();
		}
		
		public void clickCurrencyConverterLink() {
			currencyConverterLink.click();
		}
		public void clickWeather() {
			weather.click();
		}
}
