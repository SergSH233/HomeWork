package Core;


import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookingTest3 {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.booking.com/index.ru.html?label=gen173nr-1BCAEoggI46AdIM1gEaCWIAQGYASG4ARfIARXYAQHoAQGIAgGoAgO4ApuQ6-MF;sid=db9698e205596ac0146dd15cde06e760;keep_landing=1&sb_price_type=total&");
		WebElement search = driver.findElement(By.xpath(".//input[@id=\"ss\"]"));
		WebElement data = driver.findElement(By.xpath(".//span[@class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"]"));
		WebElement �heckIn = driver.findElement(By.xpath(".//table[@class=\"bui-calendar__dates\"]//tr[3]/td[2]"));
		WebElement �heckOut = driver.findElement(By.xpath(".//table[@class=\"bui-calendar__dates\"]//tr[4]/td[2]"));
		WebElement searchButton = driver.findElement(By.xpath(".//button[@class=\"sb-searchbox__button  \"]"));
		search.clear();
		search.sendKeys("�����");
		data.click();
		�heckIn.click();
		�heckOut.click();
		searchButton.click();
		WebElement pipless = driver.findElement(By.id("group_adults"));
		Select piples1 = new Select(pipless);
		piples1.selectByIndex(3);
		WebElement rooms = driver.findElement(By.id("no_rooms"));
		Select room = new Select(rooms);
		room.selectByIndex(1);
		WebElement find = driver.findElement(By.xpath(".//button[@data-sb-id=\"main\"]"));
		find.click();
		Thread.sleep(1000);
		WebElement expencive = driver.findElement(By.xpath(".//a[@data-id=\"pri-5\"]"));
		expencive.click();
		Thread.sleep(1000);
		WebElement chipForExpencive = driver.findElement(By.xpath(".//li[@class=\" sort_category   sort_price \"]"));
		chipForExpencive.click();
		Thread.sleep(2500);
		WebElement firstInList = driver.findElement(By.xpath(".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"][1]//a[@class=\"hotel_name_link url\"]"));
		firstInList.click();
		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
		driver.switchTo().window(winHandle);
		}
		WebElement selectRoom = driver.findElement(By.className("hprt-nos-select"));
		Select selectRoom1 = new Select(selectRoom);
		selectRoom1.selectByIndex(1);
		Thread.sleep(1000);
		WebElement reservation = driver.findElement(By.xpath(".//div[@class=\"hprt-reservation-cta\"]"));
		reservation.click();
		WebElement workYes = driver.findElement(By.xpath(".//input[@id=\"bp_travel_purpose_business\"]"));
		workYes.click();
		WebElement surname = driver.findElement(By.xpath(".//input[@id=\"lastname\"]"));
		surname.clear();
		surname.sendKeys("Kurochkin");
		WebElement email = driver.findElement(By.xpath(".//input[@id=\"email\"]"));
		email.clear();
		email.sendKeys("d.k.h.t.e.y@mail.ru");
		WebElement emailcheck = driver.findElement(By.xpath(".//input[@id=\"email_confirm\"]"));
		emailcheck.clear();
		emailcheck.sendKeys("d.k.h.t.e.y@mail.ru");
		WebElement i = driver.findElement(By.xpath(".//input[@id=\"notstayer_false\"]"));
		i.click();
		WebElement time = driver.findElement(By.id("checkin_eta_hour"));
		Select time1 = new Select(time);
		time1.selectByIndex(2);
		
		WebElement enterCheck = driver.findElement(By.xpath("//*[@id=\"b_tt_holder_2\"]"));
		enterCheck.click();
		
	}
	
}
