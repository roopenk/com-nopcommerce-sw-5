package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SignInPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
    WebElement checkoutAsGuest;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerButton;

    // Defining Methods
    public String getWelcomeText() {
        Reporter.log("Getting Welcome Text " + welcomeText.toString());
        CustomListeners.test.log(Status.PASS, "Getting Welcome Text " + welcomeText);
        return getTextFromElement(welcomeText);
    }

    public void clickCheckoutAsGuest() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(checkoutAsGuest);
        Reporter.log("Clicking On Checkout As Guest " + checkoutAsGuest.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Checkout As Guest Button " + checkoutAsGuest);
    }

    public void clickOnRegister() {
        clickOnElement(registerButton);
        Reporter.log("Clicking On Register Button " + registerButton.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Register Button " + registerButton);
    }
}
