package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countrySelect;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateSelect;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//div[@id='billing-buttons-container']/button[@class='button-1 new-address-next-step-button']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']")
    WebElement nextDayRadioButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueFromShipping;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCardPaymentMethod;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement paymentMethodDropDown;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expiryMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expiryYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cVV;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueAfterBilling;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[@class='value']")
    WebElement paymentMethod;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']/span[@class='value']")
    WebElement shippingMethod;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement totalAmount;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='section order-completed']/div[@class='title']/strong")
    WebElement orderSuccessMessage;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirmMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@id='billing-buttons-container']/button[4]")
    WebElement continueAfterRegistrationBilling;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continueAfterOrderPlaced;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueAfterPaymentMethod;
    @FindBy(xpath = "//input[@id='shippingoption_2']")
    WebElement radioSecondDayAir;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;

    // Defining Methods
    public void sendFirstName(String inputFirstName) {
        sendTextToElement(firstName, inputFirstName);
        Reporter.log("Sending First Name " + inputFirstName + " To First Name Field " + firstName.toString());
        CustomListeners.test.log(Status.PASS, "Sending First Name Text " + firstName);
    }

    public void sendLastName(String inputLastName) {
        sendTextToElement(lastName, inputLastName);
        Reporter.log("Sending Last Name " + inputLastName + " To Last Name Field " + lastName.toString());
        CustomListeners.test.log(Status.PASS, "Sending Last Name Text " + lastName);
    }

    public void sendEmail(String inputEmail) {
        sendTextToElement(email, inputEmail + getRandomString(20) + "@gmail.com");
        Reporter.log("Sending Email " + inputEmail + "To Email Field" + email.toString());
        CustomListeners.test.log(Status.PASS, "Sending Email Text " + email);
    }

    public void selectCountryName(String inputCountry) {
        selectByVisibleTextFromDropDown(countrySelect, inputCountry);
        Reporter.log("Selecting Country Text " + inputCountry + " From Drop Down " + countrySelect.toString());
        CustomListeners.test.log(Status.PASS, "Selecting Country Text From Drop Down " + countrySelect);
    }

    public void selectStateName(String inputStateName) {
        selectByVisibleTextFromDropDown(stateSelect, inputStateName);
        Reporter.log("Selecting State Text " + inputStateName + " From Drop Down " + stateSelect.toString());
        CustomListeners.test.log(Status.PASS, "Sending First Name Text " + firstName);
    }

    public void sendCityName(String inputCityName) {
        sendTextToElement(city, inputCityName);
        Reporter.log("Entering City Text " + inputCityName + " To City Field " + city.toString());
        CustomListeners.test.log(Status.PASS, "Sending City Text " + city);
    }

    public void sendAddressName(String inputAddressName) {
        sendTextToElement(address, inputAddressName);
        Reporter.log("Entering Address Text " + inputAddressName + " To Address Field " + address.toString());
        CustomListeners.test.log(Status.PASS, "Sending Address Text " + address);
    }

    public void sendPostCode(String inputPostCode) {
        sendTextToElement(postCode, inputPostCode);
        Reporter.log("Entering Post Code " + inputPostCode + " To Post Code Field " + postCode.toString());
        CustomListeners.test.log(Status.PASS, "Sending Postcode Text " + postCode);
    }

    public void sendPhoneNumber(String inputPhoneNumber) {
        sendTextToElement(phoneNumber, inputPhoneNumber);
        Reporter.log("Entering Phone Number " + inputPhoneNumber + " To Phone Number Field " + phoneNumber.toString());
        CustomListeners.test.log(Status.PASS, "Sending Phone Number " + phoneNumber);
    }

    public void clickContinue() {
        clickOnElement(continueButton);
        Reporter.log("Clicking On Continue Button " + continueButton.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Continue Button " + continueButton);
    }

    public void chooseShipping() {
        clickOnElement(nextDayRadioButton);
        Reporter.log("Clicking On Next Day Radio Button " + nextDayRadioButton.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Next Day Radio Button " + nextDayRadioButton);
    }

    public void clickContinueFromShipping() {
        clickOnElement(continueFromShipping);
        Reporter.log("Clicking On Continue Button " + continueFromShipping.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Continue After Shipping Selection " + continueFromShipping);
    }

    public void selectPaymentTypeRadioButton() {
        clickOnElement(creditCardPaymentMethod);
        Reporter.log("Clicking On Payment Type Radio Button " + creditCardPaymentMethod.toString());
        CustomListeners.test.log(Status.PASS, "Selecting Payment Type Radio Button " + creditCardPaymentMethod);
    }

    public void selectCardType(String paymentMethodOption) {
        selectByVisibleTextFromDropDown(paymentMethodDropDown, paymentMethodOption);
        Reporter.log("Selecting Payment Method " + paymentMethodOption + " From Drop Down " + paymentMethodDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Selecting Card Type From Drop Down " + paymentMethodOption);
    }

    public void sendCardholderName(String inputCardHolderName) {
        sendTextToElement(cardHolderName, inputCardHolderName);
        Reporter.log("Sending Card Holder Name " + inputCardHolderName + " To Card Holder Name Field " + cardHolderName.toString());
        CustomListeners.test.log(Status.PASS, "Sending Card Holder Name " + inputCardHolderName);
    }

    public void sendCardNumber(String inputCardNumber) {
        sendTextToElement(cardNumber, inputCardNumber);
        Reporter.log("Sending Card Number " + inputCardNumber + " To Card Number Field " + cardNumber.toString());
        CustomListeners.test.log(Status.PASS, "Sending Card Number " + inputCardNumber);
    }

    public void selectExpiryMonth(String inputExpiryMonth) {
        selectByVisibleTextFromDropDown(expiryMonth, inputExpiryMonth);
        Reporter.log("Selecting Expiry Month " + inputExpiryMonth + " From Drop Down " + expiryMonth.toString());
        CustomListeners.test.log(Status.PASS, "Selecting Expiry Month From Drop Down " + expiryMonth);
    }

    public void selectExpiryYear(String inputExpiryYear) {
        selectByVisibleTextFromDropDown(expiryYear, inputExpiryYear);
        Reporter.log("Selecting Expiry Year " + inputExpiryYear + " From Drop Down " + expiryYear.toString());
        CustomListeners.test.log(Status.PASS, "Selecting Expiry Year From Drop Down " + inputExpiryYear);
    }

    public void sendCVVCode(String inputCVV) {
        sendTextToElement(cVV, inputCVV);
        Reporter.log("Sending CVV " + inputCVV + " To CVV Field " + cVV.toString());
        CustomListeners.test.log(Status.PASS, "Sending CVV " + cVV);
    }

    public void clickContinueAfterBilling() {
        clickOnElement(continueAfterBilling);
        Reporter.log("Clicking On Continue Button " + continueAfterBilling.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Continue After Billing Information " + continueAfterBilling);
    }

    public void clickContinueAfterPaymentMethod() {
        clickOnElement(continueAfterPaymentMethod);
        Reporter.log("Clicking On Continue Button " + continueAfterPaymentMethod.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Continue After Payment Method " + continueAfterPaymentMethod);
    }

    public String getTextPaymentMethod() {
        CustomListeners.test.log(Status.PASS, "Getting Text From Payment Method " + paymentMethod);
        Reporter.log("Getting Payment Method Text " + paymentMethod.toString());
        return getTextFromElement(paymentMethod);
    }

    public String getTextShippingMethod() {
        CustomListeners.test.log(Status.PASS, "Getting Text From Shipping Method " + shippingMethod);
        Reporter.log("Getting Text From Shipping Method " + shippingMethod.toString());
        return getTextFromElement(shippingMethod);
    }

    public String getTextExpectedTotalAmount() {
        CustomListeners.test.log(Status.PASS, "Getting Text From Total Amount " + totalAmount);
        Reporter.log("Getting Text From Total Amount " + totalAmount.toString());
        return getTextFromElement(totalAmount);
    }

    public void clickConfirm() {
        clickOnElement(confirmMessage);
        Reporter.log("Clicking On Confirm Button " + confirmMessage.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Confirm Button " + confirmMessage);
    }

    public String getTextThankYou() throws InterruptedException {
        Thread.sleep(1000);
        CustomListeners.test.log(Status.PASS, "Getting Thank You Text " + thankYouText);
        Reporter.log("Getting Thank You Text " + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    public String getTextOrderSuccessfullyPlaced() {
        CustomListeners.test.log(Status.PASS, "Getting Order Text " + orderSuccessMessage);
        Reporter.log("Getting Order Text " + orderSuccessMessage.toString());
        return getTextFromElement(orderSuccessMessage);
    }

    public void clickContinueAfterOrderPlaced() {
        clickOnElement(continueAfterOrderPlaced);
        Reporter.log("Clicking On Continue After Order Placement " + continueAfterOrderPlaced.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Continue After Order Placement " + continueAfterOrderPlaced);
    }

    public void clickContinueAfterRegistrationBilling() {
        clickOnElement(continueAfterRegistrationBilling);
        Reporter.log("Clicking On Continue After Registration " + continueAfterRegistrationBilling.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Continue After Registration " + continueAfterRegistrationBilling);
    }

    public void clickRadioShipping() {
        clickOnElement(radioSecondDayAir);
        Reporter.log("Clicking On Second Day Air Radio Button " + radioSecondDayAir.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Second Day Air Radio Button " + radioSecondDayAir);
    }

    public void clickLogoutLink() {
        clickOnElement(logoutLink);
        Reporter.log("Clicking On Logout Link " + logoutLink.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Logout Link " + logoutLink);
    }

    public String getCurrentURL() {
        CustomListeners.test.log(Status.PASS, "Getting Current URL ");
        Reporter.log("Getting Current URL ".toString());
        return driver.getCurrentUrl();
    }

}
