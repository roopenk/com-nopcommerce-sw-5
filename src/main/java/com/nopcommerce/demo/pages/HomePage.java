package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    // Declaring Locators
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'header-menu']/ul/li")
    WebElement headerMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[text()='Computers ']")
    WebElement computerTab;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Desktops ']")
    WebElement desktopOption;
    @CacheLookup
    @FindBy(xpath = "//div[@class='topic-block-title']/h2")
    WebElement welcomeToOurStoreText;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[text()='Electronics ']")
    WebElement electronicsTab;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/ul[@class='sublist first-level']/li/a[text()='Cell phones ']")
    WebElement cellPhonesTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']")
    WebElement pageTitle;

    // Defining Methods
    public String getTitleOfPage() {
        return getTextFromElement(pageTitle);
    }

    public void selectMenu(String menu) {
        List<WebElement> menuList = driver.findElements((By) headerMenu);
        try {
            //loop through list with for loop
            for (WebElement menuOption : menuList) {
                System.out.println(menuOption.getText());
                //if option matches with the parameter then click
                if (menuOption.getText().equals(menu)) {
                    menuOption.click();
                }
            }
            //catch exceptions
        } catch (StaleElementReferenceException e) {
            menuList = driver.findElements((By) headerMenu);
        }
        CustomListeners.test.log(Status.PASS, "Storing And Iterating Elements From Header Menu " + headerMenu);
    }

    public void hoverOnComputer() {
        mouseHoverToElement(computerTab);
        Reporter.log("Mouse Hovering On Computer Tab " + computerTab.toString());
        CustomListeners.test.log(Status.PASS, "Performing Mouse Hover On Computer Tab " + computerTab);
    }

    public void hoverOnElectronics() {
        mouseHoverToElement(electronicsTab);
        Reporter.log("Mouse Hovering On Electronics Option " + electronicsTab.toString());
        CustomListeners.test.log(Status.PASS, "Performing Mouse Hover On Electronics Tab " + electronicsTab);
    }

    public void clickOnCellPhones() {
        clickOnElement(cellPhonesTab);
        Reporter.log("Clicking On Cell Phones Tab " + cellPhonesTab.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Cell Phones Tab " + cellPhonesTab);
    }

    public void clickOnDesktop() {
        mouseHoverToElementAndClick(desktopOption);
        Reporter.log("Mouse Hovering And Clicking On Desktop Option " + desktopOption.toString());
        CustomListeners.test.log(Status.PASS, "Performing Mouse Hover And CLick On Desktop Option " + desktopOption);
    }

    public String getWelcomeToOurStoreText() {
        CustomListeners.test.log(Status.PASS, "Getting Welcome Text " + welcomeToOurStoreText);
        Reporter.log("Getting Welcome Text " + welcomeToOurStoreText.toString());
        return getTextFromElement(welcomeToOurStoreText);
    }

}
