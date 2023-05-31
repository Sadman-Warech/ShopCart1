package pageObjects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PayInfo {

	WebDriver driver;

	public PayInfo(WebDriver driver) {

		this.driver = driver;

	}

	public void cCard() {
		WebElement crd = driver.findElement(By.xpath("//select[@id='CreditCardType']"));
		Select select = new Select(crd);
		select.selectByIndex(0);
	}

	public WebElement holderName() {
		WebElement holdN = driver.findElement(By.xpath("//input[@id='CardholderName']"));
		return holdN;
	}

	public WebElement cardNumber() {
		WebElement crN = driver.findElement(By.xpath("//input[@id='CardNumber']"));
		return crN;
	}

	public void monthE() {
		WebElement mE = driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
		Select select = new Select(mE);
		select.selectByIndex(5);
	}

	public void year() {
		WebElement yr = driver.findElement(By.xpath("//select[@id='ExpireYear']"));
		Select select = new Select(yr);
		select.selectByIndex(3);
	}

	public WebElement cardCode() {
		WebElement code = driver.findElement(By.xpath("//input[@id='CardCode']"));
		return code;
	}

	public WebElement continueBtn2() {
		WebElement ctn = driver.findElement(By.cssSelector(
				"div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page div.page-body.checkout-data ol.opc li.tab-section.allow.active:nth-child(5) div.step.a-item div.buttons:nth-child(2) > button.button-1.payment-info-next-step-button"));
		return ctn;
	}

}
