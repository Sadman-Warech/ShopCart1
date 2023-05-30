package Demo.ShopCart;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pageObjects.RegPage;

public class RegistrationTest extends Base {

	WebDriver driver;
	ExtentReports extentreport;

	@Test
	public void reg() throws IOException {

		ExtentTest eTest = extentreport.createTest("Test One");
		eTest.info("Chrome Browser launched");
		eTest.info("nopCommerce got lauched");

		RegPage regPage = new RegPage(driver);
		regPage.registrationLink().click();
		regPage.gender().click();
		regPage.firstName().sendKeys("Sadman");
		regPage.lastName().sendKeys("Sakib");
		regPage.monthDropdown().sendKeys("May");
		regPage.dayDropdown().sendKeys("28");
		regPage.yearDropdown().sendKeys("1995");
		regPage.email().sendKeys("ridom7588@gmail.com");
		regPage.companyName().sendKeys("Tech Hepta");
		regPage.newsLetter().click();
		regPage.password().sendKeys("12345678Ss");
		regPage.confirmPassword().sendKeys("12345678Ss");
		regPage.regButton().click();
		Assert.assertTrue(regPage.regMsg().isDisplayed());

	}

	@BeforeMethod
	public void configuration() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

		String extentReportPath = System.getProperty("user.dir") + "\\reports\\extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("nopCommerce Registration Test");
		reporter.config().setDocumentTitle("Test Results");

		extentreport = new ExtentReports();
		extentreport.attachReporter(reporter);
		extentreport.setSystemInfo("Operating System", "Windows 10");
		extentreport.setSystemInfo("Tested By", "Ridom");
	}

	@AfterMethod
	public void closure() {
		driver.close();
		extentreport.flush();
	}

}
