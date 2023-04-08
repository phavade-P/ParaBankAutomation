package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ATMServicesPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath="//ul[@class='services' and contains(.,'ATM Services')]/li[1]")
   public  WebElement lnkATMServices;

    @FindBy(xpath="//ul[@class='services' and contains(.,'ATM Services')]/li[2]")
    public  WebElement lnkWithDrawFunds;

    @FindBy(xpath="//ul[@class='services' and contains(.,'ATM Services')]/li[3]")
    public  WebElement lnkTransferFunds;

    @FindBy(xpath="//ul[@class='services' and contains(.,'ATM Services')]/li[4]")
    public  WebElement lnkCheckBalance;

    @FindBy(xpath="//ul[@class='services' and contains(.,'ATM Services')]/li[5]")
    public  WebElement lnkMakeDeposite;



    public ATMServicesPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait= new WebDriverWait(driver,60);
    }

    public void clickATMServicesLink(){
      wait.until(ExpectedConditions.elementToBeClickable(lnkATMServices));
    }
    public void clickWithDrawFunds(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkWithDrawFunds));
    }

    public void clickTransferFunds(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkTransferFunds));
    }

    public void clickCheckBalance(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkCheckBalance));
    }

    public void clickMakeDeposites(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkMakeDeposite));
    }






}
