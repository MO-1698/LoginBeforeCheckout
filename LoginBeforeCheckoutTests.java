import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.example.LoginBeforeCheckoutPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginBeforeCheckoutTests {
    private SHAFT.GUI.WebDriver driver;


    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Validate user login before checkout")
    private void validateLoginBeforeCheckout() {
        new LoginBeforeCheckoutPage(driver).navigateToURL("https://automationexercise.com/")
                .validateHomePage().clickOnSignupButton().validateLoginField().fillEmailTextField("Sam@yahoo.com")
                .fillPasswordTextField("Sam123456789").clickOnLoginButton().validateLoggedIn().clickOnProductButton().clickOnAddProductToCartButton().clickOnContinueSoppingButton().clickOnCartButton()
                .validateVerifyCartPage().clickOnProceedToCheckoutButton().validateAddressDetails().validateReviewYourOrder()
                .fillCommentTextArea("This is just a test").clickOnPlaceOrderButton().fillNameOnCard("Sam")
                .fillCardNumber("123456789").fillCVCNumber("311").fillExpMonth("10").fillExpYear("2026")
                .clickOnPayButton().validateAlertMessage().clickOnDeleteAccButton().validateDeletedAcc().clickOnContinButton();
    }
}
