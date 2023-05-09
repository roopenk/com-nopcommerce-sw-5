package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-2 update-cart-button']")
    WebElement updateButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']/strong")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@name='termsofservice']")
    WebElement termsOfService;
    @CacheLookup
    @FindBy(xpath = "//button[@name='checkout']")
    WebElement checkout;

    // Defining Methods
    public String getShoppingCartMessage() {
        Reporter.log("Getting Shopping Cart Text " + shoppingCartMessage.toString());
        CustomListeners.test.log(Status.PASS, "Getting Shopping Cart Text " + shoppingCartMessage);
        return getTextFromElement(shoppingCartMessage);
    }

    public void clearQuantity() {
        driver.findElement((By) quantity).clear();
        Reporter.log("Clearing The Quantity Field " + quantity.toString());
        CustomListeners.test.log(Status.PASS, "Clearing The Quantity Field " + quantity);
    }

    public void sendQuantity(String quantityNum) {
        sendTextToElement(quantity, quantityNum);
        Reporter.log("Sending Quantity " + quantityNum + " To Quantity Field " + quantity.toString());
        CustomListeners.test.log(Status.PASS, "Sending Quantity To Quantity Field " + quantity);
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateButton);
        Reporter.log("Clicking On Update Cart Button " + updateButton.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Update Cart Button " + updateButton);
    }

    public String getTotalPriceShoppingCart() {
        CustomListeners.test.log(Status.PASS, "Getting Total Price Text " + totalPrice);
        Reporter.log("Getting Total Price Text " + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermsOfService() {
        clickOnElement(termsOfService);
        Reporter.log("Clicking On Terms Of Service Check Box " + termsOfService.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Terms Of Service Check Box " + termsOfService);
    }

    public void clickOnCheckout() {
        clickOnElement(checkout);
        Reporter.log("Clicking On Checkout Button " + checkout.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Checkout Button " + checkout);
    }

    public String getQuantity() {
        Reporter.log("Getting Quantity Value " + quantity.toString());
        CustomListeners.test.log(Status.PASS, "Getting Quantity Value " + quantity);
        return driver.findElement((By) quantity).getAttribute("value");
    }
}
