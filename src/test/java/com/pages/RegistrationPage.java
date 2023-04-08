package com.pages;

import com.utility.Browser;
import com.utility.Constant;
import com.utility.FileReading;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.HashMap;
import java.util.Map;

public class RegistrationPage {
    WebDriver driver;
    WebDriverWait wait;


    @FindBy(xpath="//div[@id='loginPanel']/p[2]")
    WebElement linkRegister;

    @FindBy(xpath="//div[@id = 'rightPanel']/h1")
    WebElement lblRegistrationHeader;

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



    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,60);
        PageFactory.initElements(driver,this);
    }



    public void clickRegisterLink(){
        Reporter.log("Register Link will be clicked");
        WebElement element= wait.until(ExpectedConditions.visibilityOf(linkRegister));
        element.click();
        Reporter.log("Register Link is clicked");

    }
    public void validateRegistrationPage(String registrationLabel){
        WebElement element= wait.until(ExpectedConditions.visibilityOf(lblRegistrationHeader));
        Assert.assertEquals(element.getText(),registrationLabel);
        Reporter.log("Registration title has been verified " + element.getText());
    }
    public void validateLebelInfo(String info){
        WebElement element= wait.until(ExpectedConditions.visibilityOf(lblInfo));
        Assert.assertEquals(element.getText(),info);
        Reporter.log("Registration title has been verified " + element.getText());
    }
    public void enterFirstName(String FirstName){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtFirstName));
        element.sendKeys(FirstName);
        Reporter.log("First name is:"+FirstName);
    }
    public void enterLastName(String LastName){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtLastName));
        element.sendKeys(LastName);
        Reporter.log("Last name is:"+LastName);
    }
    public void enterAddress(String Address){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtAdress));
        element.sendKeys(Address);
        Reporter.log("The Address is:" + Address);
    }
    public void enterCity(String city){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtCity));
        element.sendKeys(city);
        Reporter.log("The city is:" + city);
    }
    public void enterState(String state){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtState));
        element.sendKeys(state);
        Reporter.log("The state is:" + state);

    }
    public void enterzipCode(String ZipCode){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtZipCode));
        element.sendKeys(ZipCode);
        Reporter.log("The ZipCode is:" + ZipCode);
    }
    public void enterPhoneNumber(String phoneNumber){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtPhoneNumber));
        element.sendKeys(phoneNumber);
        Reporter.log("The PhoneNumber is:" + phoneNumber);
    }
    public void enteeSSN(String SSN){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtssn));
        element.sendKeys(SSN);
        Reporter.log("The ssn is:" + SSN);
    }
    public void enterUsername(String Username){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtusername));
        element.sendKeys(Username);
        Reporter.log("The username is:" + Username);
    }
    public void enterpassword(String password){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtpassword));
        element.sendKeys(password);
        Reporter.log("The password is:" + password);
    }
    public void enterconfirmPassword(String password){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtconfirm));
        element.sendKeys(password);
        Reporter.log("The password is:" + password);
    }
    public void clickRegister(){
        Reporter.log("Register Button will be clicked");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(btnRegister));
        element.click();
        Reporter.log("Register Button is clicked");

    }
    public void validateTextRegisterbtn(String register){
        Assert.assertEquals(btnRegister.getText(),register);
        Reporter.log("The Text on Register button :" + btnRegister);
    }

}

