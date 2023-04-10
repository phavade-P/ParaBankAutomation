package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath="//li[@class='Solutions']")
     public WebElement lnkSolutions;

    @FindBy(xpath="//a[contains(.,'About Us')]")
    public WebElement lnkAboutUs;

    @FindBy(xpath="//a[contains(.,'Services')]")
    public WebElement lnkServices;

    @FindBy(xpath="//ul[@class='leftmenu']/li[4]")
    public WebElement lnkProducts;

    @FindBy(xpath="//ul[@class='leftmenu']/li[5]")
    public WebElement lnkLocations;

    @FindBy(xpath="//ul[@class='leftmenu']/li[6]")
    public WebElement lnkAdminPage;

    @FindBy(xpath="//div[@id='leftPanel']/h2")
    public WebElement lblCustomerLogin;

    @FindBy(xpath="//input[@type='text']")
    public WebElement txtUsername;

    @FindBy(xpath="//input[@type='password']")
    public WebElement txtPassword;

    @FindBy(xpath="//input[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath="//div[@id='loginPanel']/p[1]")
    WebElement lnkForgotLoginInfo;

    @FindBy(xpath="//div[@id='loginPanel']/p[2]")
    WebElement lnkRegister;




    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WebDriverWait(driver,60);
    }

    public void clickLinkSolutions(){
        Reporter.log("Solution link will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(lnkSolutions)).click();
        Reporter.log("Solution link is clicked");

    }
    public void clickLinkAboutUs(){
        Reporter.log("About Us link will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(lnkAboutUs)).click();
        Reporter.log("AboutUs link is clicked");
    }
    public void clickLinkServices()
    {
        Reporter.log("Services link will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(lnkServices)).click();
        Reporter.log("Services link is clicked");
    }
    public void clickLinkProducts()
    {
        Reporter.log("Products link will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(lnkProducts)).click();
        Reporter.log("Products link is clicked");
    }
    public void clickLinkLocations(){
        Reporter.log("Locations link will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(lnkLocations)).click();
        Reporter.log("Locations link is clicked");
    }
    public void clickLinkAdminPage(){
        Reporter.log("Admin Page link will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(lnkAdminPage)).click();
        Reporter.log("AdminPage link is clicked");
    }
    public void validatetextCustomerLogin(String customerlogin){
        Reporter.log(" going to Custommer Login text");
        Assert.assertEquals(lblCustomerLogin.getText(),customerlogin);
        Reporter.log("The Text of lebel:" + lblCustomerLogin.getText());
    }
    public void enterUsername(String Username){
        Reporter.log("Uername Textbox will be clicked");
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(txtUsername));
        element.sendKeys(Username);

    }
    public void enterPassword(String Password){
        Reporter.log("Password Textbox will be clicked");
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(txtPassword));
        element.sendKeys(Password);
    }
    public void validatebtnLoginText(String loginText){
        Reporter.log("going to Login Button will be clicked");
        Assert.assertEquals(btnLogin.getText(),loginText);
        Reporter.log("The Text on button login is:" + btnLogin.getText());
    }
    public void clickLogin(){
        Reporter.log("Login button will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();
        Reporter.log("Login button is clicked");
    }
    public void validateTextForgotLoginInfo(String textForgotLoginInfo){
        Reporter.log("Going to Forgot Login Link");
        Assert.assertEquals(lnkForgotLoginInfo.getText(),textForgotLoginInfo);
        Reporter.log("The text of link is:"+lnkForgotLoginInfo.getText());
    }

    public void clickForgotLoginInfoLink(){
        Reporter.log("ForgotLogInInfo will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(lnkForgotLoginInfo)).click();
        Reporter.log("ForgotLogInInfo is clicked");

    }
    public void validatetextRegisterLink(String textRegister){
        Reporter.log("Going to Register Link");
        Assert.assertEquals(lnkRegister.getText(),textRegister);
        Reporter.log("The text of link is:"+lnkRegister.getText());
    }

    public void clickRegisterLink(){
        Reporter.log(" Register Link will be clicked");
        wait.until(ExpectedConditions.elementToBeClickable(lnkRegister)).click();
        Reporter.log(" Register Link is clicked");
    }




}
