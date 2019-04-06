package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import PWTCurse.Task22.BookingPage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingSteps {
	private static final String Booking_URL = "https://booking.com";
	private WebDriver webDriver;
	private BookingPage bookingPage;

 	public BookingSteps() {
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		bookingPage = new BookingPage(webDriver);
	}

 	@Given("^I am on main booking page$")
	public void goToBookingMainPage() {
		webDriver.get(Booking_URL);
	}

 	@When("^I execute searching for hotels in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void executeSearchByCityRoomsAdults(String city, int countRooms, int countAdults) {
		bookingPage.setSearchConditions(city, 3, 7, countRooms, countAdults);
		bookingPage.clickSearchboxSubmitBtn();
	}

 	@Then("^I see a list of hotels that match the conditions$")
	public void hotelListIsPresented() {
		assertFalse(bookingPage.gethotelUrlList().isEmpty());
	}

 	@When("^I execute filtering by rating$")
	public void filterHotelsListByBestRating() {
		bookingPage.filterByReview(0);
	}

 	@When("^I go to the first hotel from the result list$")
	public void goToFirstHotelFromHotelsList() {
		bookingPage.navigateToHotelDetailPageFromListByIndex(0);
	}

 	@Then("^I see the hotel with \"([^\"]*)\"$")
	public void checkHotelRating(double rating) {
		assertTrue(bookingPage.getHotelRating() >= rating);
	}

 	@After
	public void afterClass() {
		webDriver.quit();
	}

}
