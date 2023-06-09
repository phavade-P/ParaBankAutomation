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



    @FindBy(xpath="//div[@id='leftPanel']/p[contains(.,'Welcome')]")
    public WebElement lblWelcome;

    @FindBy(xpath="//div[@id='leftPanel']//li[6 and contains(.,'Update Contact Info')]")
    public WebElement lnkUpdateContactInfo;

    @FindBy(xpath="//h1[@class='title' and contains(.,'Update Profile')]")
    public WebElement lblUpdateProfileHeader;

    @FindBy(xpath="//table[@class='form2']//tr[contains(.,'First Name')]")
    public WebElement lblFirstName;

    @FindBy(xpath="//table[@class='form2']//tr[contains(.,'Last Name:')]")
    public WebElement lblLastName;

    @FindBy(xpath="//table[@class='form2']//tr[contains(.,'Address')]")
    public WebElement lblAddress;

    @FindBy(xpath="//table[@class='form2']//tr[contains(.,'City')]")
    public WebElement lblCity;

    @FindBy(xpath="//table[@class='form2']//tr[contains(.,'State')]")
    public WebElement lblState;

    @FindBy(xpath="//table[@class='form2']//tr[contains(.,'Zip Code')]")
    public WebElement lblZipCode;

    @FindBy(xpath="//table[@class='form2']//tr[contains(.,'Phone #')]")
    public WebElement lblPhoneNumber;








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

    @FindBy(xpath="//div[@ng-if='showResult']/h1[contains(.,'Profile Updated')]")
    public WebElement headerPrifileUpdated;

    public UpdateProfilePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait= new WebDriverWait(driver,60);
    }

    public void clickLinkUpdateContactInfo(){
        Reporter.log("UpdateContact Info link will be clicked",true);
        wait.until(ExpectedConditions.visibilityOf(lnkUpdateContactInfo)).click();
        Reporter.log("UpdateContact Info is clicked",true);
    }

    public void getTextOfHeader(String HeaderTextUpdateProfile){
        Assert.assertEquals(lblUpdateProfileHeader.getText(),HeaderTextUpdateProfile);
        Reporter.log("The header of page: "+ lblUpdateProfileHeader.getText());
    }


    public void enterFirstName(String Firstname){
        Reporter.log("Clicking on FirstName box",true);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtFirstName));
        element.sendKeys(Firstname);
        Reporter.log(" FirstName entered: "+ txtFirstName.getText(),true);
    }

    public void ValidateFirstName(String txtFirstname){
        Assert.assertEquals(lblFirstName.getText(),txtFirstname);
        Reporter.log("The First Name box Label is:"+ lblFirstName.getText(),true);

    }

    public void ValidateLastName(String txtLastname){
        Assert.assertEquals(lblLastName.getText(),txtLastname);
        Reporter.log("The Last Name box Label is:"+ lblLastName.getText(),true);

    }

    public void ValidateAddress(String txtAddress){
        Assert.assertEquals(lblAddress.getText(),txtAddress);
        Reporter.log("The Address box Label is:"+ lblAddress.getText(),true);

    }

    public void ValidateCity(String txtCity){
        Assert.assertEquals(lblCity.getText(),txtCity);
        Reporter.log("The City box Label is:"+ lblCity.getText(),true);

    }

    public void ValidateState(String txtState){
        Assert.assertEquals(lblState.getText(),txtState);
        Reporter.log("The State box Label is:"+ lblState.getText(),true);

    }

    public void ValidateZipCode(String txtZipCode){
        Assert.assertEquals(lblZipCode.getText(),txtZipCode);
        Reporter.log("The ZipCode box Label is:"+ lblZipCode.getText(),true);

    }
    public void ValidatePhone(String txtPhone){
        Assert.assertEquals(lblPhoneNumber.getText(),txtPhone);
        Reporter.log("The Phone box Label is:"+ lblPhoneNumber.getText(),true);

    }



    public void enterLastName(String lastName){
        Reporter.log("Clicking on LastName box",true);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtLastName));
        element.sendKeys(lastName);
        Reporter.log("Last name is entered : "+ txtLastName.getText(),true);
    }

    public void enterAddress(String address){
        Reporter.log("Clicking on Address box",true);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtAddress));
        element.sendKeys(address);
        Reporter.log("Address is entered : "+ txtAddress.getText(),true);
    }

    public void enterCity(String city){
        Reporter.log("Clicking on City box",true);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtCity));
        element.sendKeys(city);
        Reporter.log("City is entered : "+ txtCity.getText(),true);
    }

    public void enterState(String state){
        Reporter.log("Clicking on State box",true);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtState));
        element.sendKeys(state);
        Reporter.log("state is entered : "+ txtState.getText(),true);
    }

    public void enterZipCode(String zipCode){
        Reporter.log("Clicking on Zipcode box",true);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtZipCode));
        element.sendKeys(zipCode);
        Reporter.log("ZipCode is entered : "+ txtZipCode.getText(),true);
    }
    public void enterPhoneNumber(String phoneNumber){
        Reporter.log("Clicking on phone box",true);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtPhoneNumber));
        element.sendKeys(phoneNumber);
        Reporter.log("phone Number is entered : "+ txtPhoneNumber.getText(),true);
    }

    public void clickBtnUpdateProfile(){
        Reporter.log("Clicking on Update Propfile button",true);

        wait.until(ExpectedConditions.visibilityOf(btnUpdateProfile)).click();
        Reporter.log("Clicked on Update Propfile button",true);
    }

    public void velidateProfileUpdated(String ProfileUpdated){
        Reporter.log("Going on Profile Updated header",true);
        wait.until(ExpectedConditions.visibilityOf(headerPrifileUpdated));
        Assert.assertEquals(headerPrifileUpdated.getText(),ProfileUpdated);
        Reporter.log("Update is done successfully :"+ headerPrifileUpdated.getText(),true);

    }


}
