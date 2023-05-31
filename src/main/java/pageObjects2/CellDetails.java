package pageObjects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CellDetails {

	WebDriver driver;

	public CellDetails(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement cellQuantity() {
		WebElement quantity = driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
		return quantity;
	}

	public WebElement addToCart() {
		WebElement atcart = driver.findElement(By.xpath("//button[@id='add-to-cart-button-20']"));
		return atcart;
	}

	public WebElement shoppingCart() {
		WebElement shpcart = driver.findElement(By.xpath("//li[@id='topcartlink']"));
		return shpcart;
	}

}
