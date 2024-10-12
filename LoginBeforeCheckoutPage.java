package org.example;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginBeforeCheckoutPage {
    private SHAFT.GUI.WebDriver driver;

    public LoginBeforeCheckoutPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    private By HomePage = By.xpath("//a[@style=\"color: orange;\"]");
    private By SignupPageButton = By.xpath("//a[@href=\"/login\"]//i[@class=\"fa fa-lock\"]");
    private By LoginField = By.xpath("//div[@class=\"login-form\"]");
    private By EmailTextField = By.xpath("//input[@data-qa=\"login-email\"]");
    private By PasswordTextField = By.xpath("//input[@data-qa=\"login-password\"]");
    private By LoginButton = By.xpath("//button[@data-qa=\"login-button\"]");
    private By LoggedIn = By.xpath("//ul[@class=\"nav navbar-nav\"]");
    private By ProductButton = By.xpath("//a[@href=\"/products\"]//i[@class=\"material-icons card_travel\"]");
    private By AddProductToCartButton = By.xpath("//div[@class='features_items']//div[contains(@class, 'single-products')][1]//div[@class='productinfo text-center']//a[contains(@class, 'add-to-cart') and @data-product-id='1' and contains(text(), 'Add to cart')]");
    private By ContinueSoppingButton = By.xpath("//button[@data-dismiss=\"modal\"]");
    private By CartButton = By.xpath("//a[@href=\"/view_cart\"]//i");
    private By VerifyCartPage = By.xpath("//li[@class=\"active\"]");
    private By ProceedToCheckoutButton = By.xpath("//a[@class=\"btn btn-default check_out\"]");
    private By AddressDetails = By.xpath("//h2[@class='heading' and text()='Address Details']");
    private By ReviewYourOrder = By.xpath("//h2[@class='heading' and text()='Review Your Order']");
    private By CommentTextArea = By.xpath("//textarea[@class=\"form-control\"]");
    private By PlaceOrderButton = By.xpath("//a[@href=\"/payment\"]");
    private By NameOnCard = By.xpath("//input[@class=\"form-control\"]");
    private By CardNumber = By.xpath("//input[@data-qa=\"card-number\"]");
    private By CVCNumber = By.xpath("//input[@data-qa=\"cvc\"]");
    private By ExpMonth = By.xpath("//input[@data-qa=\"expiry-month\"]");
    private By ExpYear = By.xpath("//input[@data-qa=\"expiry-year\"]");
    private By PayButton = By.xpath("//button[@data-qa=\"pay-button\"]");
    private By AlertMessage = By.xpath("//p[@style=\"font-size: 20px; font-family: garamond;\"]");
    private By DeleteAccButton = By.xpath("//a[@href=\"/delete_account\"]//i");
    private By DeletedAcc = By.xpath("//h2[@data-qa=\"account-deleted\"]//b");
    private By ContinButton = By.xpath("//a[@data-qa=\"continue-button\"]");


    public LoginBeforeCheckoutPage navigateToURL(String URL) {
        driver.browser().navigateToURL(URL);
        return this;
    }

    public LoginBeforeCheckoutPage clickOnSignupButton() {
        driver.element().click(SignupPageButton);
        return this;

    }

    public LoginBeforeCheckoutPage fillEmailTextField(String email) {
        driver.element().type(EmailTextField, email);
        return this;
    }

    public LoginBeforeCheckoutPage fillPasswordTextField(String password) {
        driver.element().type(PasswordTextField, password);
        return this;
    }

    public LoginBeforeCheckoutPage clickOnLoginButton() {
        driver.element().click(LoginButton);
        return this;
    }

    public LoginBeforeCheckoutPage clickOnProductButton() {
        driver.element().click(ProductButton);
        return this;
    }

    public LoginBeforeCheckoutPage clickOnAddProductToCartButton() {
        driver.element().click(AddProductToCartButton);
        return this;
    }

    public LoginBeforeCheckoutPage clickOnContinueSoppingButton() {
        driver.element().click(ContinueSoppingButton);
        return this;
    }

    public LoginBeforeCheckoutPage clickOnCartButton() {
        driver.element().click(CartButton);
        return this;
    }

    public LoginBeforeCheckoutPage clickOnProceedToCheckoutButton() {
        driver.element().click(ProceedToCheckoutButton);
        return this;
    }

    public LoginBeforeCheckoutPage fillCommentTextArea(String comment) {
        driver.element().type(CommentTextArea, comment);
        return this;
    }

    public LoginBeforeCheckoutPage clickOnPlaceOrderButton() {
        driver.element().click(PlaceOrderButton);
        return this;
    }

    public LoginBeforeCheckoutPage fillNameOnCard(String cardname) {
        driver.element().type(NameOnCard, cardname);
        return this;
    }

    public LoginBeforeCheckoutPage fillCardNumber(String cardnumber) {
        driver.element().type(CardNumber, cardnumber);
        return this;
    }

    public LoginBeforeCheckoutPage fillCVCNumber(String cvcno) {
        driver.element().type(CVCNumber, cvcno);
        return this;
    }

    public LoginBeforeCheckoutPage fillExpMonth(String month) {
        driver.element().type(ExpMonth, month);
        return this;
    }

    public LoginBeforeCheckoutPage fillExpYear(String year) {
        driver.element().type(ExpYear, year);
        return this;
    }

    public LoginBeforeCheckoutPage clickOnPayButton() {
        driver.element().click(PayButton);
        return this;
    }

    public LoginBeforeCheckoutPage clickOnDeleteAccButton() {
        driver.element().click(DeleteAccButton);
        return this;
    }

    public LoginBeforeCheckoutPage clickOnContinButton() {
        driver.element().click(ContinButton);
        return this;
    }



    @Step("Validate that the user is on Home Page")
    public LoginBeforeCheckoutPage  validateHomePage() {
        driver.element().verifyThat(HomePage).text().contains("Home");
        return this;
    }

    @Step("Validate that 'Login to your account' is visible")
    public LoginBeforeCheckoutPage validateLoginField() {
        driver.element().verifyThat(LoginField).text().contains("Login to your account");
        return this;
    }

    @Step("Validate that the user has logged in")
    public LoginBeforeCheckoutPage validateLoggedIn() {
        driver.element().verifyThat(LoggedIn).text().contains("Logged in as Samy");
        return this;
    }
    @Step("Validate that the user is on cart Page")
    public LoginBeforeCheckoutPage validateVerifyCartPage() {
        driver.element().verifyThat(VerifyCartPage).text().contains("Shopping Cart");
        return this;
    }

    @Step("Validate that Address Details is appear")
    public LoginBeforeCheckoutPage validateAddressDetails() {
        driver.element().verifyThat(AddressDetails).text().contains("Address Details");
        return this;
    }

    @Step("Validate that Review Your Order is appear")
    public LoginBeforeCheckoutPage validateReviewYourOrder() {
        driver.element().verifyThat(ReviewYourOrder).text().contains("Review Your Order");
        return this;
    }

    @Step("Validate that order is placed successfully")
    public LoginBeforeCheckoutPage validateAlertMessage() {
        driver.element().verifyThat(AlertMessage).text().contains("Congratulations! Your order has been confirmed!");
        return this;
    }


    @Step("Validate that the user deleted account")
    public LoginBeforeCheckoutPage validateDeletedAcc() {
        driver.element().verifyThat(DeletedAcc).text().contains("ACCOUNT DELETED!");
        return this;
    }


}