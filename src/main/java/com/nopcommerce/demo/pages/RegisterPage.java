package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "DateOfBirthDay")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthOfBirth;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearOfBirth;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationSuccess;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    // Defining Methods
    public String getRegisterText() {
        CustomListeners.test.log(Status.PASS, "Getting Register Text " + registerText);
        Reporter.log("Getting Register Text " + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void enterFirstName(String inputFirstName) {
        sendTextToElement(firstName, inputFirstName);
        Reporter.log("Sending First Name " + inputFirstName + " To First Name Field " + firstName.toString());
        CustomListeners.test.log(Status.PASS, "Sending First Name " + firstName);
    }

    public void enterLastName(String inputLastName) {
        sendTextToElement(lastName, inputLastName);
        Reporter.log("Sending Last Name " + inputLastName + " To Last Name Field " + lastName.toString());
        CustomListeners.test.log(Status.PASS, "Sending Last Name " + lastName);
    }

    public void enterDateOfBirthDay(String inputDay) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, inputDay);
        Reporter.log("Selecting Day Of Birth " + inputDay + " From Drop Down " + dateOfBirthDay.toString());
        CustomListeners.test.log(Status.PASS, "Selecting Day Of Birth From Drop Down " + dateOfBirthDay);
    }

    public void enterMonthOfBirth(String inputMonth) {
        selectByVisibleTextFromDropDown(monthOfBirth, inputMonth);
        Reporter.log("Selecting Month Of Birth " + inputMonth + " From Drop Down " + monthOfBirth.toString());
        CustomListeners.test.log(Status.PASS, "Selecting Month Of Birth From Drop Down " + monthOfBirth);
    }

    public void enterYearOfBirth(String inputYear) {
        selectByVisibleTextFromDropDown(yearOfBirth, inputYear);
        Reporter.log("Selecting Birth Year " + inputYear + " From Drop Down " + yearOfBirth.toString());
        CustomListeners.test.log(Status.PASS, "Selecting Year Of Birth From Drop Down " + yearOfBirth);
    }

    public void enterEmail(String inputEmail) {
        sendTextToElement(email, inputEmail + getRandomString(20) + "@gmail.com");
        Reporter.log("Sending Email " + inputEmail + " To Email Field " + email.toString());
        CustomListeners.test.log(Status.PASS, "Sending Email To Email Field " + email);
    }

    public void enterPassword(String inputPassword) {
        sendTextToElement(password, inputPassword);
        Reporter.log("Sending Password " + inputPassword + " To Password Field " + password.toString());
        CustomListeners.test.log(Status.PASS, "Sending Password To Password Filed " + password);
    }

    public void enterConfirmPassword(String inputConfirmPassword) {
        sendTextToElement(confirmPassword, inputConfirmPassword);
        Reporter.log("Sending Confirmation Password " + inputConfirmPassword + " To Confirm Password Field " + confirmPassword.toString());
        CustomListeners.test.log(Status.PASS, "Sending Confirmation Password To Confirm Password Field " + confirmPassword);
    }

    public void clickRegisterButton() {
        clickOnElement(registerButton);
        Reporter.log("Clicking On Register Button " + registerButton.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Register Button " + registerButton);
    }

    public String registrationCompleteMessage() {
        CustomListeners.test.log(Status.PASS, "Getting Registration Success Text " + registrationSuccess);
        Reporter.log("Getting registration Success Text " + registrationSuccess.toString());
        return getTextFromElement(registrationSuccess);
    }

    public void clickContinueButton() {
        clickOnElement(continueButton);
        Reporter.log("Clicking On Continue Button " + continueButton.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Continue Button " + continueButton);
    }
}
