package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    //  By openAccount= By.xpath("");
    By yourName= By.xpath("//select[@id='userSelect']");
    By loginButton= By.xpath("//button[normalize-space()='Login']");
    By logOutVerify= By.xpath("//button[normalize-space()='Logout']");
    By LogOutButton= By.xpath("//button[normalize-space()='Logout']");
    By welcomeText= By.xpath("//span[@class='fontBig ng-binding']");



    By depositSuccessFullMsg = By.xpath("//span[contains(text(),'Deposit Successful')]");

    By depositButton = By.xpath("//button[@type='submit']");
    By enterDeposit = By.xpath("//input[@placeholder='amount']");
    By deposit =By.xpath("//button[normalize-space()='Deposit']");
    By withdraw = By.xpath("//button[normalize-space()='Withdrawl']");
    By enterWithdraw = By.xpath("//input[@placeholder='amount']");
    By withdraw1 = By.xpath("//button[normalize-space()='Withdrawl']");
    By withdrawFinal = By.xpath("//button[normalize-space()='Withdraw']");

    By withdrawMessageSuccessFull = By.xpath("//span[contains(text(),'Transaction successful')]");

    /**
     * This method use for select Name
     * @param option
     */
    public void selectYourName(String option){
        selectByVisibleTextFromDropDown(yourName,option);
    }

    /**
     *  This method use for click on Login Button
     */
    public void clickLogin(){
        clickOnElement(loginButton);
    }

    /**
     * This method use for verify Logout text
     * @return
     */
    public String verifyLogOut(){
        return getTextFromElement(logOutVerify);
    }

    /**
     * This method use for click on Logout Button
     */
    public void clickLogOut(){
        clickOnElement(LogOutButton);
    }

    /**
     * This method use for verify Name text
     * @return
     */
    public String verifyWelcomeText (){
        return getTextFromElement(welcomeText);
    }






    public void clickOnDepositButton()
    {
        clickOnElement(deposit);
    }
    public void clickOnWithdrawButton()
    {
        clickOnElement(withdraw);
    }
    public void setWithdrawFinal()
    {
        clickOnElement(withdrawFinal);
    }
    public String withdrawMessageSuccessFully()
    {
        return getTextFromElement(withdrawMessageSuccessFull);
    }

    public void enterDeposit()
    {
        sendTextToElement(enterDeposit,"100");
    }
    public void enterWithdraw()
    {
        sendTextToElement(enterWithdraw,"50");
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
