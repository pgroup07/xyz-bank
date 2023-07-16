package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By clickOnCustomer = By.xpath("//select[@id='userSelect']");
    By login = By.xpath("//button[contains(text(),'Login')]");
    By logout = By.xpath("//button[contains(text(),'Logout')]");
    By yourName = By.xpath("//label[contains(text(),'Your Name :')]");

    public void clickOnDropDownList() {
        selectByContainsTextFromDropDown(clickOnCustomer, "Harry Potter");
    }

    public void clickOnLoginButton() {
        clickOnElement(login);

    }

    public void clickOnLogOutButton() {
        clickOnElement(logout);
    }

    public String verifyYourNameMessageIsDisplayed() {
        return getTextFromElement(yourName);
    }
}
