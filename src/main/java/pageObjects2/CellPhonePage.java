package pageObjects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CellPhonePage {

	WebDriver driver;

	public CellPhonePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickLumia() {
		WebElement lumia = driver.findElement(By.linkText("Nokia Lumia 1020"));
		return lumia;
	}

}
