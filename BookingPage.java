package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingPage {
	
	
	@FindBy(xpath = ".//input[@id=\"ss\"]")
	private WebElement search;
	
	@FindBy(xpath = ".//span[@class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"]")
	private WebElement data;
	
	@FindBy(xpath = ".//table[@class=\"bui-calendar__dates\"]//tr[4]/td[3]")
	private WebElement сheckIn;
	
	@FindBy(xpath = ".//table[@class=\"bui-calendar__dates\"]//tr[5]/td[3]")
	private WebElement сheckOut;
	
	@FindBy(xpath = ".//button[@class=\"sb-searchbox__button  \"]")
	private WebElement searchButton;
	
	@FindBy(xpath = ".//button[@data-sb-id=\"main\"]")
	private WebElement find;
	
	@FindBy(xpath = ".//a[@data-id=\"pri-5\"]")
	private WebElement expencive;
	
	@FindBy(xpath = ".//li[@class=\" sort_category   sort_price \"]")
	private WebElement chipForExpencive;
	
	@FindBy(xpath = ".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"][1]//a[@class=\"hotel_name_link url\"]")
	private WebElement firstInList;
	
	@FindBy(xpath = ".//div[@class=\"hprt-reservation-cta\"]")
	private WebElement reservation;
	
	@FindBy(xpath = ".//input[@id=\"bp_travel_purpose_business\"]")
	private WebElement workYes;
	
	@FindBy(xpath = ".//input[@id=\"firstname\"]")
	private WebElement iname;
	
	@FindBy(xpath = ".//input[@id=\"lastname\"]")
	private WebElement isurname;
	
	@FindBy(xpath = ".//input[@id=\"email\"]")
	private WebElement iemail;

	@FindBy(xpath = ".//input[@id=\"email_confirm\"]")
	private WebElement emailcheck;
	
	@FindBy(xpath = ".//input[@id=\"notstayer_false\"]")
	private WebElement i;
	
	@FindBy(xpath = ".//button[@class=\"modal-mask-closeBtn\"]")
	private WebElement closeWindow;
	
	@FindBy(xpath = "//button[@name='book']")
	private WebElement reservedButton;
	
	@FindBy(xpath = ".//input[@id=\"address1\"]")
	private WebElement myAddress;
	
	@FindBy(xpath = ".//input[@id=\"city\"]")
	private WebElement myCity;
	
	@FindBy(xpath = ".//input[@id=\"zip\"]")
	private WebElement myIndex;
	
	@FindBy(xpath = ".//input[@id=\"phone\"]")
	private WebElement myPhone;
	
	@FindBy(xpath = ".//input[@id=\"cc_number\"]")
	private WebElement cardNumber;
	
	@FindBy(xpath = ".//input[@id=\"cc_cvc\"]")
	private WebElement cvcNumber;
	
	@FindBy(xpath = "//div[@id='bookwrapper_cell']/div[4]/div[2]/button[2]/ins/span")
	private WebElement enterReserved;
	
	@FindBy(id = "cc_type")
	private WebElement cardType;
	
	@FindBy(id = "cc_month")
	private WebElement cardMouth;
	
	@FindBy(id = "ccYear")
	private WebElement cardYear;
	
	@FindBy(id = "group_adults")
	private WebElement pipless;
	
	@FindBy(id = "no_rooms")
	private WebElement rooms;
	
	@FindBy(id = "checkin_eta_hour")
	private WebElement time;
	
	@FindBy(className = "hprt-nos-select")
	private WebElement selectRoom;
	
	
	public  BookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	private void enterText (WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	public void enterData(String country) {
		enterText(search, country);
		data.click();
		сheckIn.click();
		сheckOut.click();
		searchButton.click();
	}
	public void waitList(WebDriver driver) {
		WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("group_adults")));
	}
	public void selectSettings() {
		Select man = new Select(pipless);
		Select room = new Select (rooms);
		man.selectByIndex(3);
		room.selectByIndex(1);
		find.click();
		
	}
	public void clickExpencive() {
		expencive.click();
	}
	public void waitChipButton(WebDriver driver) {
		WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//li[@class=\" sort_category   sort_price \"]")));
	}
	public void clickChipForExpencive() {
		chipForExpencive.click();
	}
	public void waitFirstInList(WebDriver driver) {
		WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"][1]//a[@class=\"hotel_name_link url\"]")));
	}
	public void clickFirstInList() {
		firstInList.click();
	}
	public void selectRoom() {
		Select nroom = new Select(selectRoom);
		nroom.selectByIndex(1);
		reservation.click();
		
	}
	public void waitResorvList(WebDriver driver) {
		WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//button[@class=\"modal-mask-closeBtn\"]")));
	}
	public void closeWindow() {
		closeWindow.click();
	}
	public void enterDataReserved(String name, String surname, String email, String checkEmail) {
		enterText(iname, name);
		enterText(isurname, surname);
		enterText(iemail, email);
		enterText(emailcheck, checkEmail);
		i.click();
		workYes.click();
		Select iNow = new Select(time);
		iNow.selectByIndex(2);
		reservedButton.click();
	}
	public void enterMyData (String address, String city, String index, String phone, String numberCard, String cvc) {
		enterText(myAddress, address);
		enterText(myCity, city);
		enterText(myIndex, index);
		enterText(myPhone, phone);
		enterText(cardNumber, numberCard);
		enterText(cvcNumber, cvc);
		Select typeCard = new Select(cardType);
		Select cardMouts = new Select(cardMouth);
		Select cardYears = new Select(cardYear);
		typeCard.selectByIndex(2);
		cardMouts.selectByIndex(5);
		cardYears.selectByIndex(3);	
	}	
	public void enterReserved() {
		enterReserved.click();
	}
	
	
}
