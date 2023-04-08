package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class UpdateProfilePage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath="//input[@type='text']")
    public WebElement txtUsername;

    @FindBy(xpath="//input[@type='password']")
    public WebElement txtPassword;

    @FindBy(xpath="//input[@type='submit']")
    public WebElement btnLogin;

    @FindBy(xpath="//div[@id='leftPanel']/p[contains(.,'Welcome')]")
    public WebElement lblWelcome;

    @FindBy(xpath="//div[@id='leftPanel']//li[6 and contains(.,'Update Contact Info')]")
    public WebElement lnkUpdateContactInfo;

    @FindBy(xpath="//h1[@class='title' and contains(.,'Update Profile')]")
    public WebElement lblUpdateProfileHeader;

    @FindBy(xpath="//input[@name='customer.firstName']")
    public WebElement txtFirstName;

    @FindBy(xpath="//input[@name='customer.lastName']")
    public WebElement txtLastName;

    @FindBy(xpath="//input[@name='customer.address.street']")
    public WebElement txtAddress;

    @FindBy(xpath="//input[@name='customer.address.city']")
    public WebElement txtCity;

    @FindBy(xpath="//input[@name='customer.address.state']")
    public WebElement txtState;

    @FindBy(xpath="//input[@name='customer.address.zipCode']")
    public WebElement txtZipCode;

    @FindBy(xpath="//input[@name='customer.phoneNumber']")
    public WebElement txtPhoneNumber;

    @FindBy(xpath="//input[@type='submit' and @value='Update Profile']")
    public WebElement btnUpdateProfile;

    public UpdateProfilePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait= new WebDriverWait(driver,60);
    }

    public void clickLinkUpdateContactInfo(){
        wait.until(ExpectedConditions.visibilityOf(lnkUpdateContactInfo)).click();
    }

    public void getTextOfHeader(String HeaderTextUpdateProfile){
        Assert.assertEquals(lblUpdateProfileHeader.getText(),HeaderTextUpdateProfile);
        Reporter.log("The header of page: "+ lblUpdateProfileHeader.getText());
    }

    public void enterFirstName(String Firstname){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtFirstName));
        element.sendKeys(Firstname);
    }

    public void enterLastName(String lastName){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtLastName));
        element.sendKeys(lastName);
    }

    public void enterAddress(String address){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtAddress));
        element.sendKeys(address);
    }

    public void enterCity(String city){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtCity));
        element.sendKeys(city);
    }

    public void enterState(String state){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtState));
        element.sendKeys(state);
    }

    public void enterZipCode(String zipCode){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtZipCode));
        element.sendKeys(zipCode);
    }
    public void enterPhoneNumber(String phoneNumber){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtPhoneNumber));
        element.sendKeys(phoneNumber);
    }

    public void clickBtnUpdateProfile(){
        wait.until(ExpectedConditions.visibilityOf(btnUpdateProfile)).click();
    }


}
