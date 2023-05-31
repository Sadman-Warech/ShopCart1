package pageObjects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuestCheckOut {

	WebDriver driver;

	public GuestCheckOut(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickAsGuest() {
		WebElement clkGuest = driver.findElement(By.xpath("//button[contains(text(),'Checkout as Guest')]"));
		return clkGuest;
	}
}
