package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopPage extends Utility {
    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;
    @CacheLookup
    @FindBy(xpath = "//div[@data-productid='1']//button[text()='Add to cart']")
    WebElement addToCartButton;

    // Defining Methods
    public void sortByZtoA() {
        selectByVisibleTextFromDropDown(sortBy, "Name: Z to A");
        Reporter.log("Selecting Sort By Option Z To A From Drop Down " + sortBy.toString());
        CustomListeners.test.log(Status.PASS, "Selecting Sort By Option Z To A From Drop Down " + sortBy);
    }

    public void sortByAtoZ() {
        selectByVisibleTextFromDropDown(sortBy, "Name: A to Z");
        Reporter.log("Selecting Sort By Option A To Z From Drop Down " + sortBy.toString());
        CustomListeners.test.log(Status.PASS, "Selecting Sort By Option A To Z From Drop Down " + sortBy);
    }

    public void addToCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addToCartButton);
        Reporter.log("Clicking On Add To Cart " + addToCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Add To Cart Button " + addToCartButton);
    }
}
