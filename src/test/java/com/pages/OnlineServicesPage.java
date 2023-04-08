package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class OnlineServicesPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath="//ul[@class='servicestwo' and contains(.,'Online Services')]/li[1]")
    WebElement lnkOnlineServices;

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

    public void clicklinkOnlineServices(){
        Reporter.log("OnliNe Services Link will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(lnkOnlineServices)).click();
        Reporter.log("OnliNe Services Link  clicked");
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
