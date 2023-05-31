package Demo.ShopCart;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects2.Billing;
import pageObjects2.CellDetails;
import pageObjects2.CellPhonePage;
import pageObjects2.ConfirmOrder;
import pageObjects2.GuestCheckOut;
import pageObjects2.OrderSuccessful;
import pageObjects2.PayInfo;
import pageObjects2.PaymentMethod;
import pageObjects2.PlaceOrderPage;
import pageObjects2.Shipping;
import pageObjects2.ShoppingCartPage;

public class PlaceOrderTest extends Base {

	WebDriver driver;
	PlaceOrderPage pod;
	CellPhonePage cellPhone;
	CellDetails cellDetails;
	ShoppingCartPage scp;
	GuestCheckOut gchk;
	Billing blng;
	Shipping shpng;
	PaymentMethod pymnt;
	PayInfo payInfo;
	ConfirmOrder cnfrm;
	OrderSuccessful ordrS;

	@Test
	public void placeOrder() throws IOException, InterruptedException {

		pod = new PlaceOrderPage(driver);
		pod.hoverOverElectronicsOption();
		pod.clickCellPhone().click();

		cellPhone = new CellPhonePage(driver);
		cellPhone.clickLumia().click();

		cellDetails = new CellDetails(driver);
		cellDetails.cellQuantity().clear();
		cellDetails.cellQuantity().sendKeys("2");
		cellDetails.addToCart().click();
		Thread.sleep(5000);
		cellDetails.shoppingCart().click();

		scp = new ShoppingCartPage(driver);
		scp.privacyPolicy().click();
		scp.checkOutBtn().click();

		gchk = new GuestCheckOut(driver);
		gchk.clickAsGuest().click();

		Billing blng = new Billing(driver);
		blng.firstName().sendKeys("Sadman");
		blng.lastName().sendKeys("Sakib");
		blng.email().sendKeys("ridom555@gmail.com");
		blng.country().sendKeys("Bangladesh");
		Thread.sleep(2000);
		blng.state();
		blng.city().sendKeys("Dhaka");
		blng.address().sendKeys("Uttara");
		blng.postal().sendKeys("51");
		blng.PhoneNumber().sendKeys("01521331458");
		blng.continueBtn().click();

		shpng = new Shipping(driver);
		shpng.shippingDay().click();
		shpng.continue2().click();

		pymnt = new PaymentMethod(driver);
		pymnt.credit().click();
		pymnt.continue3().click();

		payInfo = new PayInfo(driver);
		payInfo.cCard();
		payInfo.holderName().sendKeys("Sadman");
		payInfo.cardNumber().sendKeys("5457623898234113");
		payInfo.monthE();
		payInfo.year();
		payInfo.cardCode().sendKeys("2456");
		payInfo.continueBtn2().click();

		cnfrm = new ConfirmOrder(driver);
		cnfrm.confirmBtn().click();

		ordrS = new OrderSuccessful(driver);
		String orderPlaceMessage = ordrS.getOrderPlaceMessage();
		Assert.assertEquals(orderPlaceMessage, "Your order has been successfully processed!");
	}

	@BeforeMethod
	public void openBrowser() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@AfterMethod
	public void closure() {
		driver.quit();
	}

}
