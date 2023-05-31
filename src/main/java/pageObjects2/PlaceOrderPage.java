package pageObjects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PlaceOrderPage {

	WebDriver driver;

	public PlaceOrderPage(WebDriver driver) {

		this.driver = driver;

	}

	public void hoverOverElectronicsOption() {
		Actions actions = new Actions(driver);
		WebElement electronicsMenu = driver.findElement(By.linkText("Electronics"));
		actions.moveToElement(electronicsMenu).perform();
	}

	public WebElement clickCellPhone() {
		WebElement cellphone = driver.findElement(By.linkText("Cell phones"));
		return cellphone;
	}

}
