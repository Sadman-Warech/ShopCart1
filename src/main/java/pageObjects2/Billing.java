package pageObjects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Billing {

	WebDriver driver;

	public Billing(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement firstName() {
		WebElement frstN = driver.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']"));
		return frstN;
	}

	public WebElement lastName() {
		WebElement lstN = driver.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']"));
		return lstN;
	}

	public WebElement email() {
		WebElement mail = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Email']"));
		return mail;
	}

	public WebElement country() {
		WebElement cntry = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
		return cntry;
	}

	public void state() {
		WebElement st = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
		Select select = new Select(st);
		select.selectByIndex(5);
	}

	public WebElement city() {
		WebElement ct = driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']"));
		return ct;
	}

	public WebElement address() {
		WebElement adrs = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']"));
		return adrs;
	}

	public WebElement postal() {
		WebElement code = driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"));
		return code;
	}

	public WebElement PhoneNumber() {
		WebElement phn = driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"));
		return phn;
	}

	public WebElement continueBtn() {
		WebElement ctn = driver.findElement(By.name("save"));
		return ctn;
	}

}
