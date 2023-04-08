package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BillPaymentServicePage {

     private WebDriver driver;
      private WebDriverWait wait;

      @FindBy(xpath="//input[@type='text']")
    public WebElement txtUsername;

    @FindBy(xpath="//input[@type='password']")
    public WebElement txtPassword;

    @FindBy(xpath="//input[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath="//div[@id='leftPanel']/p[contains(.,'Welcome')]")
    WebElement lblWelcome;

    @FindBy(xpath="//li[contains(.,'Bill Pay')]")
    WebElement lnkBillPay;

    @FindBy(xpath="//h1[@class='title'  and contains(.,'Bill Payment Service')]")
    WebElement lblBillPayMentServices;

    @FindBy(xpath="//div[@id='rightPanel']//p[contains(.,'Enter payee info')]")
    public WebElement lblEnterPayeeInfoText;

    @FindBy(xpath="//input[@name='payee.name']")
    public WebElement txtPayeename;

    @FindBy(xpath="//input[@name='payee.address.street']")
    public WebElement txtAddress;

    @FindBy(xpath="//input[@name='payee.address.city']")
    public WebElement txtCity;

    @FindBy(xpath="//input[@name='payee.address.state']")
    public WebElement txtState;

    @FindBy(xpath="//input[@name='payee.address.zipCode']")
    public WebElement txtzipCode;

    @FindBy(xpath="//input[@name='payee.phoneNumber']")
    public WebElement txtPhoneNumber;

    @FindBy(xpath="//input[@name='payee.accountNumber']")
    public WebElement txtAccountNumber;

    @FindBy(xpath="//input[@name='verifyAccount']")
    public WebElement txtVerifyAccount;

    @FindBy(xpath="//input[@name='amount']")
    public WebElement txtAmount;

    @FindBy(xpath="//select[@name='fromAccountId']")
    public WebElement ddnFromAccount;

    @FindBy(xpath="//input[@type='submit' and @value='Send Payment' ]")
    public WebElement btnSendPayment;







    public BillPaymentServicePage(WebDriver driver){
          this.driver=driver;
        PageFactory.initElements(driver,this);
        wait= new WebDriverWait(driver,60);
    }


    public void clickBillPay(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkBillPay)).click();
    }

    public void validateBillPaymentText(String TextBillPaymentServices)

    {
        wait.until(ExpectedConditions.visibilityOf(lblBillPayMentServices));
        Assert.assertEquals(lblBillPayMentServices.getText(),TextBillPaymentServices);
        Reporter.log("The text Is:" + lblBillPayMentServices.getText());

    }

    public void validateTextEnterPayeeInfo(String textPayeeInfo){
        Assert.assertEquals(lblEnterPayeeInfoText.getText(),textPayeeInfo);
        Reporter.log("the text is:"+ lblEnterPayeeInfoText.getText());
    }

    public void enterPayeename(String Payeename){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(txtPayeename));
        element.sendKeys(Payeename);
      /*  Assert.assertEquals(txtPayeename.getText(),Payeename);
        Reporter.log("the name os payee is "+ Payeename);*/
    }
    public void enterAddress(String Address){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(txtAddress));
        element.sendKeys(Address);

    }
    public void enterCity(String City){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(txtCity));
        element.sendKeys(City);

    }
    public void enterState(String State){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(txtState));
        element.sendKeys(State);

    }
    public void enterzipCode(String zipCode){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(txtzipCode));
        element.sendKeys(zipCode);

    }
    public void enterPhoneNumber(String phoneNumber){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(txtPhoneNumber));
        element.sendKeys(phoneNumber);

    }
    public void enterAccountNumber(String accountNumber){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(txtAccountNumber));
        element.sendKeys(accountNumber);

    }
    public void enterVerifyAccount(String verifyAccount){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(txtVerifyAccount));
        element.sendKeys(verifyAccount);

    }
    public void enterAmount(String amount){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(txtAmount));
        element.sendKeys(amount);

    }

    public void selectFromAccount(){
       WebElement element= wait.until(ExpectedConditions.elementToBeClickable(ddnFromAccount));
       element.isSelected();
    }

    public void clickBtnSendPayment(){
        wait.until(ExpectedConditions.visibilityOf(btnSendPayment)).click();
    }


}
