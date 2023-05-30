package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Demo.ShopCart.Base;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegPage;

public class Reg extends Base {

	WebDriver driver;
	RegPage regPage;

	@Given("^User go to the NopCommerce Home page$")
	public void user_go_to_the_nopcommerce_home_page() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@And("^User navigate to the Registration page$")
	public void user_navigate_to_the_registration_page() {

		regPage = new RegPage(driver);
		regPage.registrationLink().click();

	}

	@When("^User select the (.+) as gender$")
	public void user_select_the_as_gender(String type) {

		regPage.gender().click();

	}

	@And("^User set first name and last name$")
	public void user_set_first_name_and_last_name() {

		regPage.firstName().sendKeys("Sadman");
		regPage.lastName().sendKeys("Sakib");

	}

	@And("^User set (.+) as date of birth$")
	public void user_set_as_date_of_birth(String dob) {

		regPage.monthDropdown().sendKeys("May");
		regPage.dayDropdown().sendKeys("28");
		regPage.yearDropdown().sendKeys("1995");

	}

	@And("^User set (.+) as email$")
	public void user_set_as_email(String dynamicemail) {

		regPage.email().sendKeys("ridom577@gmail.com");

	}

	@And("^User set (.+) as company details$")
	public void user_set_as_company_details(String companyname) {

		regPage.companyName().sendKeys("Tech Hepta");

	}

	@And("^User set Newsletter option as (.+)$")
	public void user_set_newsletter_option_as(String status) {

		regPage.newsLetter().click();

	}

	@And("^User set (.+) as password and confirm password again$")
	public void user_set_as_password_and_confirm_password_again(String password) {

		regPage.password().sendKeys("12345678Ss");
		regPage.confirmPassword().sendKeys("12345678Ss");

	}

	@And("^User click on the Register button$")
	public void user_click_on_the_register_button() {

		regPage.regButton().click();

	}

	@Then("^Verify that the new account registration message (.+) is displayed$")
	public void verify_that_the_new_account_registration_message_is_displayed(String msg) {

		Assert.assertTrue(regPage.regMsg().isDisplayed());

	}

	@After
	public void closurebrowser() {
		driver.close();
	}

}
