package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By AddCustomerTab= By.xpath("//button[normalize-space()='Add Customer']");
    By openAccount= By.xpath("//button[normalize-space()='Open Account']");

    /**
     * This method use for Click Add Customer
     */
    public void clickOnAddCustomer() {
        clickOnElement(AddCustomerTab);
    }

    /**
     * This method use for Click Open Account
     */

    public void clickOnOpenAccount() {
        clickOnElement(openAccount);
    }

}
