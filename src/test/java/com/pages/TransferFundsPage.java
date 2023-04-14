package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class TransferFundsPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//div[@id='leftPanel']//li[3 and contains(.,'Transfer Funds')]")
    public WebElement lnkTransferFund;

    @FindBy(xpath = "//h1[@class='title' and contains(.,'Transfer Funds')]")
    public WebElement titleTrnaferFund;

    @FindBy(xpath = "//form[@ng-submit='submit()']//b")
    public WebElement lblAmount;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/form/div[1]/text()[1]")
    public WebElement lblfromAccount;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/form/div[1]/text()[2]")
    public WebElement lbltoAccount;

    @FindBy(xpath = "//input [@type='submit']")
    public WebElement btnSubmit;

    @FindBy(xpath = "//input [@id='amount']")
    public WebElement txtAmount;

    @FindBy(xpath = "//select [@id='fromAccountId']")
    public WebElement ddnFromAccount;

    @FindBy(xpath = "//select [@id='toAccountId']")
    public WebElement ddnToAccount;

    @FindBy(xpath = "//p[@id='amount.errors' and contains(.,'The amount cannot be empty')]")
    public WebElement errorAmount;

    @FindBy(xpath = "//h1[@class='title' and contains(.,'Transfer Complete!')]")
    public WebElement lblTransferComplete;

    @FindBy(xpath="//p[@id='amount.errors' and contains(.,'Please enter a valid amount.')]")
    public WebElement errorValidAmount;


    public TransferFundsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 90);
    }

    public void clickTransferFundLink() {
        Reporter.log("The Link will br clicked: ", true);
        wait.until(ExpectedConditions.elementToBeClickable(lnkTransferFund)).click();
        Reporter.log("The Link is clicked: ", true);
    }

    public void validateTitlePage(String txtTransferFund) {
        Assert.assertEquals(titleTrnaferFund.getText(), txtTransferFund);
        Reporter.log("Page is :" + titleTrnaferFund.getText(), true);
    }

    public void valiadteTextAmount(String txtamount) {
        Assert.assertEquals(lblAmount.getText(), txtamount);
        Reporter.log("the text is:" + lblAmount.getText(), true);
    }

    public void validateDdnFromAccount(String textddnfromac) {

        if (ddnFromAccount.isEnabled() && ddnFromAccount.isDisplayed()) {
            Reporter.log("ddnFromAccount is verofied", true);
        }
    }

    public void selectDdnFromAccount(String txtDdnFromAc) {
        Reporter.log("drop down From Account is getting", true);
        Select s = new Select(ddnFromAccount);
        s.selectByVisibleText(txtDdnFromAc);
    }

    public void validateDdnToAccount(String textddnToac) {

        if (ddnToAccount.isEnabled() && ddnToAccount.isDisplayed()) {
            Reporter.log("ddntoAccount is verified", true);
        }

    }

    public void selectDdnToAccount(String txttoAc) {
        Reporter.log("drop down to Account is getting", true);
        Select s = new Select(ddnToAccount);
        s.selectByVisibleText(txttoAc);
    }

    public void enterAmount(String txtamount){
        Reporter.log("The amount box will be clicked",true);
        wait.until(ExpectedConditions.elementToBeClickable(txtAmount)).sendKeys(txtamount);
        Reporter.log("the amount is entered",true);
    }

    public void validateErrorWithountamount(String txtError){
        Assert.assertEquals(errorAmount.getText(),txtError);
        Reporter.log("Without putting amount if tranfer button is clicked then it should give error like: "+ errorAmount.getText(),true);
    }
    public void clickTranferButton(){
        Reporter.log("Transfer button will be clicked",true);
        wait.until(ExpectedConditions.elementToBeClickable(btnSubmit)).click();
        Reporter.log("Transfer button is clicked",true);

    }

    public void validateTranferComplete(String txtTransferComplete){
        Reporter.log("the Transfer complete page is opening",true);
        Assert.assertEquals(lblTransferComplete.getText(),txtTransferComplete);
        Reporter.log("Trasnfer is completed "+ lblTransferComplete.getText(),true);
    }

    public void validateErrorValidAmount(String amount){
        Reporter.log("Entering amount in amount field",true);
        Assert.assertEquals(errorValidAmount.getText(),amount);
        Reporter.log("The error msg is" + errorValidAmount.getText(),true);
    }

    public void checkInvalidaAmountTransfer(String amount) {
        Reporter.log("sending amount with alphanumeric", true);
        wait.until(ExpectedConditions.elementToBeClickable(txtAmount)).sendKeys(amount);
        wait.until(ExpectedConditions.elementToBeClickable(btnSubmit)).click();
        WebElement element = wait.until(ExpectedConditions.visibilityOf(errorValidAmount));
        if (element.isDisplayed()) {
            Reporter.log("test success ", true);
        } else {
            Reporter.log("Test failed ", true);
        }

    }
}