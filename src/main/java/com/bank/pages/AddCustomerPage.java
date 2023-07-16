package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
//By AddCustomerTab= By.xpath("");

    //  By firstNameDropDown=By.xpath("//select[@id='userSelect']");
    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By PostCode = By.xpath("//input[@placeholder='Post Code']");

    By addCustomer= By.xpath("//button[@type='submit']");

    /**
     *  This method use for enter First Name
     * @param option
     */
    public void enterFirstName(String option) {
        sendTextToElement(firstName, option);
    }

    /**
     * This method use for enter Last Name
     * @param option
     */
    public void enterLastName(String option) {
        sendTextToElement(lastName, option);
    }

    /**
     * This method use for enter Post code
     * @param option
     */
    public void enterPostCode(String option) {
        sendTextToElement(PostCode, option);
    }

    /**
     * This method use for click Add Customer
     */
    public void clickAddCustomer() {
        clickOnElement(addCustomer);
    }

}
