package Core;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class BookingTest {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.booking.com/index.ru.html?label=gen173nr-1BCAEoggI46AdIM1gEaCWIAQGYASG4ARfIARXYAQHoAQGIAgGoAgO4ApuQ6-MF;sid=db9698e205596ac0146dd15cde06e760;keep_landing=1&sb_price_type=total&");
		WebElement search = driver.findElement(By.xpath(".//input[@id=\"ss\"]"));
		WebElement data = driver.findElement(By.xpath(".//span[@class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"]"));
		WebElement ñheckIn = driver.findElement(By.xpath(".//table[@class=\"bui-calendar__dates\"]//tr[3]/td[2]"));
		WebElement ñheckOut = driver.findElement(By.xpath(".//table[@class=\"bui-calendar__dates\"]//tr[3]/td[6]"));
		WebElement searchButton = driver.findElement(By.xpath(".//button[@class=\"sb-searchbox__button  \"]"));
		search.clear();
		search.sendKeys("Ïàðèæ");
		data.click();
		ñheckIn.click();
		ñheckOut.click();
		searchButton.click();
		
		WebElement chip = driver.findElement(By.xpath(".//a[@data-id=\"pri-1\"]"));
		chip.click();
		WebElement ninePluse = driver.findElement(By.xpath(".//a[@data-id=\"review_score-70\"]"));
		ninePluse.click();
		Thread.sleep(3000);
		
		WebElement firstInList = driver.findElement(By.xpath(".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"][1]//a[@class=\"hotel_name_link url\"]"));
		firstInList.click();
		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
		driver.switchTo().window(winHandle);
		}
		WebElement coust = driver.findElement(By.xpath(".//div[@class=\"hprt-price-price \"]"));
		assertTrue(coust.isDisplayed());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
