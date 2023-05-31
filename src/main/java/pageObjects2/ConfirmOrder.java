package pageObjects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmOrder {

	WebDriver driver;

	public ConfirmOrder(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement confirmBtn() {
		WebElement cnfm = driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
		return cnfm;
	}

}
