package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;


public class HomePage extends Utility {


    By BankManager = By.xpath("//button[normalize-space()='Bank Manager Login']");

    By AddCustomerTab = By.xpath("//button[normalize-space()='Customer Login']");

    /**
     * This method use for Click on Manager Login
     */
    public void clickOnBankManagerLogin() {
        clickOnElement(BankManager);
    }

    /**
     * This method use for Click on Customer Login
     */
    public void clickOnCustomerLogin() {
        clickOnElement(AddCustomerTab);
    }
    By customerLogin = By.xpath("//button[text()='Customer Login']");
    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void clickOnCustomerLoginButton()
    {
        clickOnElement(customerLogin);
    }
    public void clickOnBankManagerLoginButton()
    {
        clickOnElement(bankManagerLogin);
    }

}
