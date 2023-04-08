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
        wait.until(ExpectedConditions.elementToBeClickable(lnkSolutions)).click();
    }
    public void clickLinkAboutUs(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkAboutUs)).click();
    }
    public void clickLinkServices(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkServices)).click();
    }
    public void clickLinkProducts(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkProducts)).click();
    }
    public void clickLinkLocations(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkLocations)).click();
    }
    public void clickLinkAdminPage(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkAdminPage)).click();
    }
    public void validatetextCustomerLogin(String customerlogin){
        Assert.assertEquals(lblCustomerLogin.getText(),customerlogin);
        Reporter.log("The Text of lebel:" + lblCustomerLogin.getText());
    }
    public void enterUsername(String Username){
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(txtUsername));
        element.sendKeys(Username);
    }
    public void enterPassword(String Password){
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(txtPassword));
        element.sendKeys(Password);
    }
    public void clickLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();
    }
    public void validatebtnLoginText(String loginText){
        Assert.assertEquals(btnLogin.getText(),loginText);
        Reporter.log("The Text on button login is:" + btnLogin.getText());
    }
    public void clickForgotLoginInfoLink(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkForgotLoginInfo)).click();
    }
    public void validateTextForgotLoginInfo(String textForgotLoginInfo){
        Assert.assertEquals(lnkForgotLoginInfo.getText(),textForgotLoginInfo);
        Reporter.log("The text of link is:"+lnkForgotLoginInfo.getText());
    }
    public void clickRegisterLink(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkRegister)).click();
    }
    public void validatetextRegisterLink(String textRegister){
        Assert.assertEquals(lnkRegister.getText(),textRegister);
        Reporter.log("The text of link is:"+lnkRegister.getText());
    }



}
