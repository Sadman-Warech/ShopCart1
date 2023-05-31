package pageObjects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shipping {

	WebDriver driver;

	public Shipping(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement shippingDay() {
		WebElement shpD = driver.findElement(By.cssSelector(
				"div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page div.page-body.checkout-data ol.opc li.tab-section.allow.active:nth-child(3) div.step.a-item form:nth-child(1) div.buttons:nth-child(2) > button.button-1.shipping-method-next-step-button"));
		return shpD;
	}

	public WebElement continue2() {
		WebElement ctn2 = driver.findElement(By.xpath("//span[@id='shipping-method-please-wait']"));
		return ctn2;
	}
}
