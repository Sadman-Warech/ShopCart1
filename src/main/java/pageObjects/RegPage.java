package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegPage {

	WebDriver driver;

	public RegPage(WebDriver driver) {
		this.driver = driver;
	}

	private By registrationLink = By.xpath("//a[contains(text(),'Register')]");
	private By gender = By.xpath("//input[@id='gender-male']");
	private By firstName = By.xpath("//input[@id='FirstName']");
	private By lastName = By.xpath("//input[@id='LastName']");
	private By monthDropdown = By.name("DateOfBirthMonth");
	private By dayDropdown = By.name("DateOfBirthDay");
	private By yearDropdown = By.name("DateOfBirthYear");
	private By email = By.xpath("//input[@id='Email']");
	private By companyName = By.xpath("//input[@id='Company']");
	private By newsLetter = By.xpath("//input[@id='Newsletter']");
	private By password = By.xpath("//input[@id='Password']");
	private By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
	private By regButton = By.xpath("//button[@id='register-button']");
	private By regMsg = By.xpath("//div[contains(text(),'Your registration completed')]");

	public WebElement registrationLink() {
		return driver.findElement(registrationLink);
	}

	public WebElement gender() {
		return driver.findElement(gender);
	}

	public WebElement firstName() {
		return driver.findElement(firstName);
	}

	public WebElement lastName() {
		return driver.findElement(lastName);
	}

	public WebElement monthDropdown() {

		return driver.findElement(monthDropdown);
	}

	public WebElement dayDropdown() {

		return driver.findElement(dayDropdown);
	}

	public WebElement yearDropdown() {

		return driver.findElement(yearDropdown);
	}

	public WebElement email() {

		return driver.findElement(email);
	}

	public WebElement companyName() {

		return driver.findElement(companyName);
	}

	public WebElement newsLetter() {

		return driver.findElement(newsLetter);
	}

	public WebElement password() {

		return driver.findElement(password);
	}

	public WebElement confirmPassword() {

		return driver.findElement(confirmPassword);
	}

	public WebElement regButton() {

		return driver.findElement(regButton);
	}

	public WebElement regMsg() {

		return driver.findElement(regMsg);
	}
}
