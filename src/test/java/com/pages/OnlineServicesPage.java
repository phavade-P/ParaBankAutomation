package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class OnlineServicesPage {


    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath="//ul[@class='servicestwo' and contains(.,'Online Services')]/li[1]")
    WebElement lblOnlineServices;

    @FindBy(xpath="//ul[@class='servicestwo' and contains(.,'Online Services')]/li[2]")
    WebElement lnkBillPay;

    @FindBy(xpath="//ul[@class='servicestwo' and contains(.,'Online Services')]/li[3]")
    WebElement lnkAccountHistory;

    @FindBy(xpath="//ul[@class='servicestwo' and contains(.,'Online Services')]/li[4]")
    WebElement lnkTransferFunds;

    public OnlineServicesPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,60);
    }
    //all labels


    public void validateTextOnlineServices(String textOnlineServices){
        Reporter.log("OnliNe Services  will be clicked",true);
        wait.until(ExpectedConditions.visibilityOf(lblOnlineServices));
        Assert.assertEquals(lblOnlineServices.getText(),textOnlineServices);
        Reporter.log("The text Of label is:"+ lblOnlineServices.getText(),true);
    }

    public void validateTextBillPay(String textBillPay){
        Reporter.log("Bill Pay  will be clicked",true);
        wait.until(ExpectedConditions.visibilityOf(lblOnlineServices));
        Assert.assertEquals(lnkBillPay.getText(),textBillPay);
        Reporter.log("The text Of label is:"+ lnkBillPay.getText(),true);
    }

    public void validateTextAccountHistory(String textAccountHistory){
        Reporter.log("Account History  will be clicked",true);
        wait.until(ExpectedConditions.visibilityOf(lblOnlineServices));
        Assert.assertEquals(lnkAccountHistory.getText(),textAccountHistory);
        Reporter.log("The text Of label is:"+ lnkAccountHistory.getText(),true);
    }

    public void validateTransferFund(String textTransferFunds){
        Reporter.log("Bill Pay  will be clicked",true);
        wait.until(ExpectedConditions.visibilityOf(lnkTransferFunds));
        Assert.assertEquals(lnkTransferFunds.getText(),textTransferFunds);
        Reporter.log("The text Of label is:"+ lnkTransferFunds.getText(),true);
    }





    public void clicklinkBillPay()
    {
        Reporter.log("Bill Pay Link will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(lnkBillPay)).click();
        Reporter.log("Bill Pay Link  clicked");
    }

    public void clicklnkAccountHistory(){
        Reporter.log("Account History Link will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(lnkAccountHistory)).click();
        Reporter.log("OnliNe Services Link is clicked");
    }

    public void clicklinkTransferFunds()
    {
        Reporter.log("Transfer Funds Link will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(lnkTransferFunds)).click();
        Reporter.log("Transfer Funds Link is clicked");
    }
}
