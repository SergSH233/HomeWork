package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.booking.com/index.html?aid=376376;label=bdot-8C_cDuuLQIDn43czEz0muAS267724389585:pl:ta:p1:p22,248,000:ac:ap1t1:neg:fi:tiaud-294889294933:kwd-297847917062:lp9076124:li:dec:dm;ws=&gclid=EAIaIQobChMI3IrWnY7e4AIVmqiaCh0p2QXMEAAYASAAEgJ0nPD_BwE");
	WebElement city = driver.findElement(By.xpath(".//input[@id=\"ss\"]"));
	WebElement guestconsol = driver.findElement(By.xpath(".//span[@class=\"xp__guests__count\"]"));
	WebElement serchButton = driver.findElement(By.xpath(".//button[@class=\"sb-searchbox__button  \"]"));
	
	city.clear();
	city.sendKeys("Москва");
	serchButton.click();
	
	}

}
