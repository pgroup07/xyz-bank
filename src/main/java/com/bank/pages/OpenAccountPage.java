package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    //  By openAccount= By.xpath("");
  By customerName= By.xpath("//select[@id='userSelect']");
    By currency= By.xpath("//select[@id='currency']");

    By processButton= By.xpath("//button[normalize-space()='Process']");

    /**
     *  This method use for select Customer Name
     * @param option
     */
    public void selectCustomerName(String option){
        selectByVisibleTextFromDropDown(customerName,option);
    }

    /**
     * This method use for select Currency
     * @param option
     */
    public void selectCurrency(String option){
        selectByVisibleTextFromDropDown(currency,option);
    }

    /**
     *  This method use for Process
     */
    public void clickOnProcess() {
        clickOnElement(processButton);
    }
}
