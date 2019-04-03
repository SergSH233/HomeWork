package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebDriver.WebDriverSingleton;

public class AbstractPage {
	protected WebDriver driver;
	protected WebDriverWait wait;
	private static final int LINK_PRESENSE_TIMEOUT = 40;
	public WebDriver webDriverSingletone = WebDriverSingleton.getWebDriverInstance();

	public AbstractPage(WebDriver driver) {
		this.webDriverSingletone = WebDriverSingleton.getWebDriverInstance();
		wait = new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT);
	}


}
