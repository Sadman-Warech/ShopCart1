package pageObjects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {

	WebDriver driver;

	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement privacyPolicy() {
		WebElement pPolicy = driver.findElement(By.xpath("//input[@id='termsofservice']"));
		return pPolicy;
	}

	public WebElement checkOutBtn() {
		WebElement chkbtn = driver.findElement(By.xpath("//button[@id='checkout']"));
		return chkbtn;
	}

}
