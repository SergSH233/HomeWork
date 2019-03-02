package Core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Booking_2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/index.ru.html?label=gen173nr-1BCAEoggI46AdIM1gEaCWIAQGYASG4ARfIARXYAQHoAQGIAgGoAgO4Apv73-MF;sid=db9698e205596ac0146dd15cde06e760;keep_landing=1&sb_price_type=total&");
		
		WebElement search = driver.findElement(By.xpath(".//input[@id=\"ss\"]"));
		WebElement select = driver.findElement(By.xpath(".//label[@id=\"xp__guests__toggle\"]"));
		List<WebElement> rooms = driver.findElements(By.xpath(".//span[@class=\"bui-button__text\"]"));
		WebElement piplesPlus = rooms.get(1);
		WebElement piplesMin = rooms.get(0);
		WebElement blueButton = driver.findElement(By.xpath(".//button[@class=\"sb-searchbox__button  \"]"));
		
		

		search.clear();
		search.sendKeys("Москва");
		select.click();
		piplesPlus.click();
		piplesMin.click();
		piplesMin.click();
		piplesMin.click();
		blueButton.click();
		WebElement ninePluse = driver.findElement(By.xpath(".//a[@data-id=\"review_score-90\"]"));
		ninePluse.click();
		WebElement hotels = driver.findElement(By.xpath(".//a[@data-id=\"ht_id-204\"]"));
		hotels.click();
		
		
	
		
	}

}
