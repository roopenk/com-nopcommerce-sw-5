package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BooksPage extends Utility {

    // Locator Declaration
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Books')]")
    WebElement books;

    // Method Declaration
    public String getBooksText() {
        Reporter.log("Getting Books Text " + books.toString());
        CustomListeners.test.log(Status.PASS, "Getting Books Text " + books);
        return getTextFromElement(books);
    }
}
