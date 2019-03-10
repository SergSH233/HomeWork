package PWTCurse.Task21;


import java.util.Set;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.BookingPage;
import junit.framework.Assert;

public class TestBooking {
	private WebDriver driver;
	private BookingPage bookingPage;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		bookingPage = new BookingPage(driver);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.booking.com/index.ru.html?label=gen173nr-1BCAEoggI46AdIM1gEaCWIAQGYASG4ARfIARXYAQHoAQGIAgGoAgO4ApuQ6-MF;sid=db9698e205596ac0146dd15cde06e760;keep_landing=1&sb_price_type=total&");
		bookingPage.enterData("Париж");
		bookingPage.waitList(driver);
		bookingPage.selectSettings();
		bookingPage.clickExpencive();
		bookingPage.waitChipButton(driver);
		bookingPage.clickChipForExpencive();
		bookingPage.waitFirstInList(driver);
		Thread.sleep(2000);
		bookingPage.clickFirstInList();
		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
		driver.switchTo().window(winHandle);
		}
		bookingPage.selectRoom();
		bookingPage.waitResorvList(driver);
		bookingPage.closeWindow();
		bookingPage.enterDataReserved("Vasiliy", "Kurochkin", "pwtcursepam@mail.ru", "pwtcursepam@mail.ru");
		bookingPage.waitResorvList(driver);
		bookingPage.closeWindow();
		bookingPage.enterMyData("Asanalieva", "Minsk", "220022", "375447247892", "4242 4242 4242 4242", "323");
		bookingPage.enterReserved();
		
		
	}

}
