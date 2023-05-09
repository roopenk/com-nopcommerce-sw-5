package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BooksPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class) // Initializing Listeners class
public class TopMenuTest extends BaseTest {
    HomePage homePage;
    BooksPage booksPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        booksPage = new BooksPage();
    }

    @Test(groups = {"Sanity", "Regression"})
    public void verifyPageNavigation() {
        homePage.selectMenu("Books");
        Assert.assertEquals(homePage.getTitleOfPage(), "Books", "Page Navigated Successfully");
    }
}

