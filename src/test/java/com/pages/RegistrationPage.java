package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class RegistrationPage {
    WebDriver driver;
    WebDriverWait wait;


    @FindBy(xpath="//a[contains(.,'Register')]")
    public WebElement linkRegister;

    @FindBy(xpath="//div[@id='rightPanel']/h1[contains(.,'Signing up is easy!')]")
    public WebElement lblRegistrationHeader;

    @FindBy(xpath="//div[@id='rightPanel']/p")
    WebElement lblInfo;
    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement txtFirstName;
    @FindBy(xpath = "//input[@id='customer.LastName']")
    WebElement txtLastName;
    @FindBy(xpath = "//input[@id='customer.address.street']")
    WebElement txtAdress;
    @FindBy(xpath = "//input[@id='customer.address.city']")
    WebElement txtCity;
    @FindBy(xpath = "//input[@id='customer.address.state']")
    WebElement txtState;
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    WebElement txtZipCode;
    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    WebElement txtPhoneNumber;
    @FindBy(xpath = "//input[@id='customer.ssn']")
    WebElement txtssn;
    @FindBy(xpath = "//input[@id='customer.username']")
    WebElement txtusername;
    @FindBy(xpath = "//input[@id='customer.password']")
    WebElement txtpassword;
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    WebElement txtconfirm;
    @FindBy(xpath="//input[@value = 'Register']")
    WebElement btnRegister;

    //for lbl

    @FindBy(xpath="//form[@id='customerForm']//tr[contains(.,'First Name:')]")
    public WebElement lblFirstName;

    @FindBy(xpath="//form[@id='customerForm']//tr[contains(.,'Last Name:')]")
    public WebElement lblLastName;

    @FindBy(xpath="//form[@id='customerForm']//tr[contains(.,'Address')]")
    public WebElement lblAddress;

   @FindBy(xpath="//form[@id='customerForm']//tr[contains(.,'City')]")
   public WebElement lblCity;

    @FindBy(xpath="//form[@id='customerForm']//tr[contains(.,'State')]")
    public WebElement lblState;

    @FindBy(xpath="//form[@id='customerForm']//tr[contains(.,'Zip Code')]")
    public WebElement lblZipCode;

    @FindBy(xpath="//form[@id='customerForm']//tr[contains(.,'Phone #:')]")
    public WebElement lblPhone;

    @FindBy(xpath="//form[@id='customerForm']//tr[contains(.,'SSN')]")
    public WebElement lblSSN;

    @FindBy(xpath="//form[@id='customerForm']//tr[contains(.,'Username:')]")
    public WebElement lblUserName;

    @FindBy(xpath="//form[@id='customerForm']//tr[contains(.,'Password')]")
    public WebElement lblPassword;

    @FindBy(xpath="//form[@id='customerForm']//tr[contains(.,'Confirm')]")
    public WebElement lblConfirm;



    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,60);
        PageFactory.initElements(driver,this);
    }

    public void clickRegisterLink(){
        Reporter.log("Register Link will be clicked",true);
         wait.until(ExpectedConditions.elementToBeClickable(linkRegister)).click();

        Reporter.log("Register Link is clicked",true);

    }
    public void validateRegistrationPage(String registrationLabel){
        WebElement element= wait.until(ExpectedConditions.visibilityOf(lblRegistrationHeader));
        Assert.assertEquals(element.getText(),registrationLabel);
        Reporter.log("Registration title has been verified " + element.getText(),true);
    }
    public void HeaderInfo(String info){
        WebElement element= wait.until(ExpectedConditions.visibilityOf(lblInfo));
        Assert.assertEquals(element.getText(),info);
        Reporter.log("Registration title has been verified " + element.getText(),true);
    }

    public void validateFirstNameLebel(String FirstNametext){
      Assert.assertEquals(lblFirstName.getText(),FirstNametext);
      Reporter.log("The FirstName Box lebel is :"+ lblFirstName.getText(),true);
    }
    public void validateLastNameLebel(String LastNametext){
        Assert.assertEquals(lblLastName.getText(),LastNametext);
        Reporter.log("The lastName Box lebel is :"+ lblLastName.getText(),true);
    }

    public void validateAddressLebel(String textAddress){
        Assert.assertEquals(lblAddress.getText(),textAddress);
        Reporter.log("The address Box lebel is :"+ lblAddress.getText(),true);
    }

    public void validateCityLebel(String textCity){
        Assert.assertEquals(lblCity.getText(),textCity);
        Reporter.log("The city Box lebel is :"+ lblCity.getText(),true);
    }

    public void validateStateLebel(String textState){
        Assert.assertEquals(lblState.getText(),textState);
        Reporter.log("The state Box lebel is :"+ lblState.getText(),true);
    }

    public void validateZipCodeLebel(String textZipCode){
        Assert.assertEquals(lblZipCode.getText(),textZipCode);
        Reporter.log("The ZipCode Box lebel is :"+ lblZipCode.getText(),true);
    }

    public void validatePhoneLebel(String textPhone){
        Assert.assertEquals(lblPhone.getText(),textPhone);
        Reporter.log("The Phone Box lebel is :"+ lblPhone.getText(),true);
    }

    public void validateSSNLebel(String textSSN){
        Assert.assertEquals(lblSSN.getText(),textSSN);
        Reporter.log("The SSN Box lebel is :"+ lblSSN.getText(),true);
    }

    public void validateUserNameLebel(String textUsername){
        Assert.assertEquals(lblUserName.getText(),textUsername);
        Reporter.log("The Username Box lebel is :"+ lblUserName.getText(),true);
    }

    public void validatePasswordLebel(String textPassword){
        Assert.assertEquals(lblPassword.getText(),textPassword);
        Reporter.log("The Password Box lebel is :"+ lblPassword.getText(),true);
    }

    public void validateConfirmLebel(String textConfirm){
        Assert.assertEquals(lblConfirm.getText(),textConfirm);
        Reporter.log("The Confirm Box lebel is :"+ lblConfirm.getText(),true);
    }

    public void enterFirstName(String FirstName){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtFirstName));
        element.sendKeys(FirstName);
        Reporter.log("First name is:"+FirstName,true);
    }
    public void enterLastName(String LastName){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtLastName));
        element.sendKeys(LastName);
        Reporter.log("Last name is:"+LastName,true);
    }
    public void enterAddress(String Address){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtAdress));
        element.sendKeys(Address);
        Reporter.log("The Address is:" + Address,true);
    }
    public void enterCity(String city){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtCity));
        element.sendKeys(city);
        Reporter.log("The city is:" + city,true);
    }
    public void enterState(String state){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtState));
        element.sendKeys(state);
        Reporter.log("The state is:" + state,true);

    }
    public void enterzipCode(String ZipCode){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtZipCode));
        element.sendKeys(ZipCode);
        Reporter.log("The ZipCode is:" + ZipCode,true);
    }
    public void enterPhoneNumber(String phoneNumber){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtPhoneNumber));
        element.sendKeys(phoneNumber);
        Reporter.log("The PhoneNumber is:" + phoneNumber,true);
    }
    public void enteeSSN(String SSN){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtssn));
        element.sendKeys(SSN);
        Reporter.log("The ssn is:" + SSN,true);
    }
    public void enterUsername(String Username){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtusername));
        element.sendKeys(Username);
        Reporter.log("The username is:" + Username,true);
    }
    public void enterpassword(String password){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtpassword));
        element.sendKeys(password);
        Reporter.log("The password is:" + password,true);
    }
    public void enterconfirmPassword(String password){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtconfirm));
        element.sendKeys(password);
        Reporter.log("The password is:" + password,true);
    }
    public void clickRegister(){
        Reporter.log("Register Button will be clicked",true);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(btnRegister));
        element.click();
        Reporter.log("Register Button is clicked",true);

    }
    public void validateTextRegisterbtn(String register){
        Assert.assertEquals(btnRegister.getText(),register);
        Reporter.log("The Text on Register button :" + btnRegister,true);
    }

}

