package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonesPage extends Utility {
    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement cellPhonesText;
    @CacheLookup
    @FindBy(xpath = "//a[@class='viewmode-icon list']")
    WebElement listTab;
    @CacheLookup
    @FindBy(linkText = "Nokia Lumia 1020")
    WebElement productNokiaLumiaLink;

    // Defining Methods
    public String getCellPhonesText() {
        Reporter.log("Getting Cell Phones Text " + cellPhonesText.toString());
        CustomListeners.test.log(Status.PASS, "Getting Text From Cell Phones " + cellPhonesText);
        return getTextFromElement(cellPhonesText);
    }

    public void clickListTab() {
        clickOnElement(listTab);
        Reporter.log("Clicking On List Tab " + listTab.toString());
        CustomListeners.test.log(Status.PASS, "Clicking on List Tab " + listTab);
    }

    public void clickOnNokiaLumia() {
        clickOnElement(productNokiaLumiaLink);
        Reporter.log("Clicking On Nokia Lumia Link " + productNokiaLumiaLink.toString());
        CustomListeners.test.log(Status.PASS, "Clicking on Nokia Lumia Phone Link " + productNokiaLumiaLink);
    }
}
