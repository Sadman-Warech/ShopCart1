package pageObjects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentMethod {
	WebDriver driver;

	public PaymentMethod(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement credit() {
		WebElement crdt = driver.findElement(By.xpath("//input[@id='paymentmethod_1']"));
		return crdt;
	}

	public WebElement continue3() {
		WebElement ctn3 = driver.findElement(By.cssSelector(
				"div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page div.page-body.checkout-data ol.opc li.tab-section.allow.active:nth-child(4) div.step.a-item div.buttons:nth-child(2) > button.button-1.payment-method-next-step-button"));
		return ctn3;
	}
}
