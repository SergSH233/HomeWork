package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WeatherPage {
	private WebDriver driver;
	
	@FindBy(xpath = ".//input[@type=\"text\"]")
    private WebElement enterCity;
	
	@FindBy(xpath =".//button[@type=\"submit\"]")
	private WebElement findClick;
	
	@FindBy(xpath = ".//a[text()=\"14 дней\"]")
	private WebElement weatherFor14Days;
	
	@FindBy(xpath = ".//span[@bem-id=\"150\"]")
	private WebElement seeWeatherFor14Days;
	
	 public WeatherPage(WebDriver driver)
	    {
	        PageFactory.initElements(driver, this);
	        this.driver = driver;
	    }
	 public void enterCity(String city) {
		 enterCity.clear();
		 enterCity.sendKeys(city);
		 findClick.click();
	 }
	 public void clickOnWeatherFor14Days() {
		 new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(weatherFor14Days));
		 weatherFor14Days.click();
	 }
	 public boolean seeWeatherFor14Days() {
		 new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(seeWeatherFor14Days));
		 return seeWeatherFor14Days.isEnabled();
	 }
	 
}
