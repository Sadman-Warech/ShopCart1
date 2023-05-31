package pageObjects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSuccessful {

	WebDriver driver;

	public OrderSuccessful(WebDriver driver) {

		this.driver = driver;

	}

	public String getOrderPlaceMessage() {
		return driver.findElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"))
				.getText();
	}

}
