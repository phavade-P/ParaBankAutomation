package com.test;

import com.constants.Constant;
import com.pages.LoginPage;
import com.pages.TransferFundsPage;
import com.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TransferFundTest extends PrePost {
    @BeforeTest
    public void beforeTest(){
        LoginPage loginPage = new LoginPage(browser.getDriver());
        String[] userDetails = users.get("user1_credentials").split(";");
        loginPage.loginParaBank(userDetails[0],userDetails[1]);
    }

   @Test
   public void TC001_validateAllLabels(){
       TransferFundsPage transferFundsPage = new TransferFundsPage(browser.getDriver());
       TestData = FileReading.readUserProperties(Constant.transferFunds+Constant.slash+"TC001_validateAllLabels");
       transferFundsPage.clickTransferFundLink();
       transferFundsPage.validateTitlePage(TestData.get("title"));
       transferFundsPage.valiadteTextAmount(TestData.get("amount"));
       transferFundsPage.validateDdnFromAccount(TestData.get("from_account_lbl"));
       transferFundsPage.validateDdnToAccount(TestData.get("to_account_lbl"));
   }

   @Test
    public void TC002_ValidateSuccessfulTransfer() throws InterruptedException {
       TransferFundsPage transferFundsPage = new TransferFundsPage(browser.getDriver());
       TestData = FileReading.readUserProperties(Constant.transferFunds+Constant.slash+"TC002_ValidateSuccessfulTransfer");
       transferFundsPage.clickTransferFundLink();
       transferFundsPage.enterAmount(TestData.get("valid_amount"));
       Thread.sleep(5000);
       transferFundsPage.clickTranferButton();
       Thread.sleep(5000);
       transferFundsPage.validateTranferComplete(TestData.get("CompleteAmountlbl"));

   }

   @Test
   public void TC003_enterInvalidAmount(){
       TransferFundsPage transferFundsPage = new TransferFundsPage(browser.getDriver());
       TestData = FileReading.readUserProperties(Constant.transferFunds+Constant.slash+"TC003_enterInvalidAmount");
       transferFundsPage.clickTransferFundLink();
       transferFundsPage.enterAmount(TestData.get("invalid_Amount"));
       transferFundsPage.clickTranferButton();
       transferFundsPage.checkInvalidaAmountTransfer(TestData.get("errorInvalidAmount"));
   }
    @Test
    public void TC004_AmountfieldBlank(){
        TransferFundsPage transferFundsPage = new TransferFundsPage(browser.getDriver());
        TestData = FileReading.readUserProperties(Constant.transferFunds+Constant.slash+"TC004_AmountfieldBlank");
        transferFundsPage.clickTransferFundLink();
        transferFundsPage.enterAmount(TestData.get("amount"));
        transferFundsPage.clickTranferButton();
        transferFundsPage.checkInvalidaAmountTransfer(TestData.get("erroeEmptyAmountLbl"));
    }


}
