package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By depositButton = By.xpath("//button[normalize-space()='Deposit']");
    By DepositedAmounts=By.xpath("//input[@placeholder='amount']");

    /**
     * This method use for click On Deposit Button
     */
    public void clickOnDeposit() {
        clickOnElement(depositButton);
    }
    /**
     *
     */
    public void amountToBeDeposited(String option){
        sendTextToElement(DepositedAmounts,option);
    }
    By depositSuccessFullMsg = By.xpath("//span[contains(text(),'Deposit Successful')]");
    //By depositButton = By.xpath("//button[@type='submit']");
    By enterDeposit = By.xpath("//input[@placeholder='amount']");
    By deposit =By.xpath("//button[normalize-space()='Deposit']");


    public void clickOnDepositButton()
    {
        clickOnElement(deposit);
    }

    public void enterDeposit()
    {
        sendTextToElement(enterDeposit,"100");
    }


    public void setEnterDepositButton()
    {
        clickOnElement(depositButton);
    }

    public String getDepositSuccessfullyMessage()
    {
        return getTextFromElement(depositSuccessFullMsg);
    }
}
