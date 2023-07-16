package com.bank.testbase.testsuite;

import com.bank.pages.*;
import com.bank.testbase.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    HomePage homePage = new HomePage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomersPage customersPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLogin();

        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.enterFirstName("Harry");
        addCustomerPage.enterLastName("Java");
        addCustomerPage.enterPostCode("326598");
        addCustomerPage.clickAddCustomer();
        switchToAlert();
        getTextFromAlert();
        acceptAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnOpenAccount();
        openAccountPage.selectCustomerName("Harry Java");
        openAccountPage.selectCurrency("Pound");
        openAccountPage.clickOnProcess();
        switchToAlert();
        getTextFromAlert();
        acceptAlert();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnCustomerLogin();
        customersPage.selectYourName("Harry Java");
        customersPage.clickLogin();
        String expectedText = "Logout";
        String actualText = customersPage.verifyLogOut();
        Assert.assertEquals(actualText, expectedText);
        customersPage.clickLogOut();
        String expectedText1 = "Harry Java";
        String actualText1 = customersPage.verifyWelcomeText();
        Assert.assertEquals(actualText1, expectedText1);
    }


    @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLoginButton();
        Thread.sleep(1000);
        customerLoginPage.clickOnDropDownList();
        customerLoginPage.clickOnLoginButton();
        Thread.sleep(1000);
        customersPage.clickOnDepositButton();
        Thread.sleep(1000);
        customersPage.enterDeposit();
        Thread.sleep(1000);
        customersPage.setEnterDepositButton();
        Assert.assertEquals(customersPage.getDepositSuccessfullyMessage(), "Deposit Successful");

    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLoginButton();
        Thread.sleep(1000);
        customerLoginPage.clickOnDropDownList();
        customerLoginPage.clickOnLoginButton();
        Thread.sleep(1000);
        customersPage.clickOnDepositButton();
        Thread.sleep(1000);
        customersPage.enterDeposit();
        Thread.sleep(1000);
        customersPage.setEnterDepositButton();
        Thread.sleep(1000);
        customersPage.clickOnWithdrawButton();
        Thread.sleep(1000);
        customersPage.enterWithdraw();
        Thread.sleep(1000);
        customersPage.setWithdrawFinal();
        Assert.assertEquals(customersPage.withdrawMessageSuccessFully(), "Transaction successful");
    }
}