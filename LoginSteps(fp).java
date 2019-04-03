package LoginStep;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import Pages.LoginPage;
import Pages.WeatherPage;
import WebDriver.WebDriverSingleton;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps {
	 private static final String MAIN_URL = "http://mail.ru";
	    private static final String LOGIN = "pwtcursepam@mail.ru";
	    private static final String PASSWORD = "Apachi3110Map";
	    private Pages.LoginPage loginPage;
	    private Pages.WeatherPage weatherPage;
	    private WebDriver driver;
	   
	    
	    
	    public LoginSteps()
	    {
	        driver  = WebDriverSingleton.getWebDriverInstance();
	        loginPage = new LoginPage(driver);
	        weatherPage = new WeatherPage(driver);
	        
	       
	    }
	    @Given("^I am on main application page$")
	    public void loadMainPage()
	    {
	        driver.get(MAIN_URL);
	    }

	    @When("^I login as correct user$")
	    public void loginAsCorrectUser()
	    {
	        loginPage.enterLoginAndPass(LOGIN, PASSWORD);
	        loginPage.clickEnterButton();
	    }
	    @When ("^I click on the weather$")
	    public void clickOnWeather(){
	    	loginPage.clickWeather();
	    }
	    @And ("^I enter the \"([^\"]*)\"$")
	    public void enterTheCity(String city) {
	    	weatherPage.enterCity(city);
	    }
	    @And ("^I click on the weather for 14 days$")
	    public void weatherFor14Days() {
	    	weatherPage.clickOnWeatherFor14Days();
	    }
	    @Then("^I see weather$")
	    public void seeWather14Days() {
	    	Assert.assertTrue(weatherPage.seeWeatherFor14Days());
	    }
	    @Then("I see logout link")
	    public void seeLogoutLink()
	    {
	        Assert.assertTrue(loginPage.logoutLinkPresents());
	    }
	    @When("^I login as user with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void loginAsUserWithCredentials(String name, String password)
	    {
	        loginPage.enterLoginAndPass(name, password);
	        loginPage.clickEnterButton();
	    }
	    @Then ("^I see error message$")
	    public void seeErrorMessage() {
	    	Assert.assertTrue(loginPage.logoutLinkErrorPresents());
	    	
	    }
	   
	    
	    @After
	    public void afterClass()
	    {
	        WebDriverSingleton.driverQuit();
	    }

}

