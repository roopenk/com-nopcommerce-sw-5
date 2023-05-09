package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductsPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement radioHDD400GB;
    @CacheLookup
    @FindBy(xpath = "//label[text()='Vista Premium [+$60.00]']")
    WebElement radioOSVistaPremium;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommanderRadio;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']/span")
    WebElement actualPrice;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1'] ")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='bar-notification success']/p\"")
    WebElement actualProductAddedToShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='bar-notification success']/span")
    WebElement closeButton;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartHover;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumiaText;
    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement nokiaLumiaPrice;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantity;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCartButtonNokia;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]")
    WebElement successfullyAddedMessage;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement successCloseButton;

    // Defining Methods
    public String getBuildYourOwnComputerText() {
        CustomListeners.test.log(Status.PASS, "Getting Build Your Own Computer Text " + buildYourOwnComputerText);
        Reporter.log("Getting Build Your Own Text " + buildYourOwnComputerText);
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessor(String inputProcessor) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(processorDropDown, inputProcessor);
        Reporter.log("Selecting Processor" + inputProcessor + " From Drop Down " + processorDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Selecting Processor From Drop Down " + processorDropDown);
    }

    public void selectRAM(String inputRAM) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(ramDropDown, inputRAM);
        Reporter.log("Selecting RAM Option " + inputRAM + " From Drop Down " + ramDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Selecting RAM Option From Drop Down " + ramDropDown);
    }

    public void clickHDD() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(radioHDD400GB);
        Reporter.log("Clicking On 400GB HDD Radio Button " + radioHDD400GB);
        CustomListeners.test.log(Status.PASS, "Clicking On HDD Radio Button " + radioHDD400GB.toString());
    }

    public void clickOS() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(radioOSVistaPremium);
        Reporter.log("Clicking On Vista Premium OS Option " + radioOSVistaPremium.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On OS Vista Premium Option " + radioOSVistaPremium);
    }

    public void clickTotalCommander() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(totalCommanderRadio);
        Reporter.log("Clicking On Total Commander Check Box " + totalCommanderRadio.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Total Commander Check Box " + totalCommanderRadio);
    }

    public String getTextActualPrice() throws InterruptedException {
        Thread.sleep(1000);
        CustomListeners.test.log(Status.PASS, "Getting Actual Price Text " + actualPrice);
        Reporter.log("Getting Actual Price Text " + actualPrice.toString());
        return getTextFromElement(actualPrice);
    }

    public void clickAddToCartButton() throws InterruptedException {
        Thread.sleep(500);
        mouseHoverToElementAndClick(addToCartButton);
        Reporter.log("Mouse Hovering And Clicking On Add To Cart Button " + addToCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Add To Cart Button " + addToCartButton);
    }

    public String getProductAddedToCartMessage() {
        CustomListeners.test.log(Status.PASS, "Getting Text Product Added To Shopping Cart " + actualProductAddedToShoppingCart);
        Reporter.log("Getting Text Product Added To Shopping Cart " + actualProductAddedToShoppingCart.toString());
        return getTextFromElement(actualProductAddedToShoppingCart);
    }

    public void clickCloseButton() {
        clickOnElement(closeButton);
        Reporter.log("Clicking On Close Button " + closeButton.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Close Button " + closeButton);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(shoppingCartHover);
        Reporter.log("Mouse Hovering On Shopping Cart " + shoppingCartHover.toString());
        CustomListeners.test.log(Status.PASS, "Performing Mouse Hover On Shopping Cart " + shoppingCartHover);
    }

    public void clickOnGoToCart() {
        clickOnElement(goToCartButton);
        Reporter.log("Clicking On Go To Cart Button " + goToCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Go To Cart Button " + goToCartButton);
    }

    public String getNokiaLumiaText() {
        CustomListeners.test.log(Status.PASS, "Getting Nokia Lumia Text " + nokiaLumiaText);
        Reporter.log("Getting Nokia Lumia Text " + nokiaLumiaText.toString());
        return getTextFromElement(nokiaLumiaText);
    }

    public String getNokiaLumiaPrice() {
        CustomListeners.test.log(Status.PASS, "Getting Nokia Lumia Price " + nokiaLumiaPrice);
        Reporter.log("Getting Nokia Lumia Price " + nokiaLumiaPrice.toString());
        return getTextFromElement(nokiaLumiaPrice);
    }

    public void clearQuantity() {
        driver.findElement((By) quantity).clear();
        Reporter.log("Clearing The Quantity " + quantity.toString());
        CustomListeners.test.log(Status.PASS, "Clearing The Quantity " + quantity);
    }

    public void sendQuantity(String inputQuantity) {
        sendTextToElement(quantity, inputQuantity);
        Reporter.log("Sending Quantity " + inputQuantity + " To Quantity Field " + quantity.toString());
        CustomListeners.test.log(Status.PASS, "Sending Quantity Value " + quantity);
    }

    public void clickAddToCartNokia() throws InterruptedException {
        Thread.sleep(500);
        mouseHoverToElementAndClick(addToCartButtonNokia);
        Reporter.log("Mouse Hovering And Clicking On Add To Cart Button " + addToCartButtonNokia.toString());
        CustomListeners.test.log(Status.PASS, "Performing Mouse Hover And Click On Add To Cart Button " + addToCartButtonNokia);
    }

    public String getSuccessfullyAddedMessage() {
        CustomListeners.test.log(Status.PASS, "Getting Successfully Added Text " + successfullyAddedMessage);
        Reporter.log("Getting Successfully Added Text " + successfullyAddedMessage.toString());
        return getTextFromElement(successfullyAddedMessage);
    }

    public void closeSuccessMessage() {
        clickOnElement(successCloseButton);
        Reporter.log("Clicking On Close Button " + successCloseButton.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Close Button " + successCloseButton);
    }
}
