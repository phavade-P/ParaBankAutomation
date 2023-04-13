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

    @FindBy(xpath="//div[@id ='rightPanel']/h1")
    public WebElement HeaderOfLinkAboutUs;

    @FindBy(xpath="//a[contains(.,'Services')]")
    public WebElement lnkServices;

    @FindBy(xpath="//span[contains( .,'Available Bookstore SOAP services:')]")
    public WebElement HeaderOfServices;

    @FindBy(xpath="//ul[@class='leftmenu']/li[4]")
    public WebElement lnkProducts;

    @FindBy(xpath="//span[contains( .,'Products')]")
    public WebElement HeaderOfLinkProducts;


    @FindBy(xpath="//ul[@class='leftmenu']/li[5]")
    public WebElement lnkLocations;

    @FindBy(xpath="//span[contains( .,'Solutions')]")
    public WebElement HeaderOfLinkLocations;


    @FindBy(xpath="//ul[@class='leftmenu']/li[6]")
    public WebElement lnkAdminPage;

    @FindBy(xpath="//h1[contains( .,'Administration')]")
    public WebElement HeaderOfLinkAdminPage;


    @FindBy(xpath="//div[@id='leftPanel']/h2")
    public WebElement lblCustomerLogin;

    @FindBy(xpath="//form[@name ='login']/p[1]")
    public WebElement lblUsername;

    @FindBy(xpath="//form[@name ='login']/p[2]")
    public WebElement lblPassword;


    @FindBy(xpath="//input[@type='text']")
    public WebElement txtUsername;

    @FindBy(xpath="//input[@type='password']")
    public WebElement txtPassword;

    @FindBy(xpath="//input[@type='submit' and @value='Log In']")
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

    public void validateSolutionText(String textSolution)  {

       Assert.assertEquals(lnkSolutions.getText(),textSolution);
       Reporter.log("The text At link is :" + lnkSolutions.getText(),true);
    }

    public void clickLinkSolutions(){
        Reporter.log("Solution link will be clicked",true);
        wait.until(ExpectedConditions.elementToBeClickable(lnkSolutions)).click();
        Reporter.log("Solution link is clicked",true);

    }
    public void validateAboutUsLinkText(String textAboutUsLink)  {

        Assert.assertEquals(lnkAboutUs.getText(),textAboutUsLink);
        Reporter.log("The text At link is :" + lnkAboutUs.getText(),true);
    }
    public void clickLinkAboutUs(){
        Reporter.log("About Us link will be clicked",true);
        wait.until(ExpectedConditions.elementToBeClickable(lnkAboutUs)).click();
        Reporter.log("AboutUs link is clicked",true);
    }

    public void validateHeaderAfterClickAboutUs(String HeaderText){
        Reporter.log("About us link cliced and opening next page",true);
        Assert.assertEquals(HeaderOfLinkAboutUs.getText(),HeaderText);
        Reporter.log("the header of AboutUs link page is:"+HeaderOfLinkAboutUs.getText(),true);
    }

    public void validateServicesLinkText(String textServices)  {

        Assert.assertEquals(lnkServices.getText(),textServices);
        Reporter.log("The text At link is :" + lnkServices.getText(),true);
    }

    public void clickLinkServices()
    {
        Reporter.log("Services link will be clicked",true);
        wait.until(ExpectedConditions.elementToBeClickable(lnkServices)).click();
        Reporter.log("Services link is clicked",true);
    }

    public void validateHeaderAfterClickServices(String HeaderText){
        Reporter.log("Services link cliced and opening next page",true);
        Assert.assertEquals(HeaderOfServices.getText(),HeaderText);
        Reporter.log("the header of Services link page is:"+HeaderOfServices.getText(),true);
    }


    public void validateProductsLinkText(String textProducts)  {

        Assert.assertEquals(lnkProducts.getText(),textProducts);
        Reporter.log("The text At link is :" + lnkProducts.getText(),true);
    }

    public void clickLinkProducts()
    {
        Reporter.log("Products link will be clicked",true);
        wait.until(ExpectedConditions.elementToBeClickable(lnkProducts)).click();
        Reporter.log("Products link is clicked",true);
    }

    public void validateHeaderAfterClickProducts(String HeaderText){
        Reporter.log("Products link cliced and opening next page",true);
        Assert.assertEquals(HeaderOfLinkProducts.getText(),HeaderText);
        Reporter.log("the header of Products link page is:"+HeaderOfLinkProducts.getText(),true);
    }

    public void validateLocationsLinkText(String textLocation)  {

        Assert.assertEquals(lnkLocations.getText(),textLocation);
        Reporter.log("The text At link is :" + lnkLocations.getText(),true);
    }

    public void clickLinkLocations(){
        Reporter.log("Locations link will be clicked",true);
        wait.until(ExpectedConditions.elementToBeClickable(lnkLocations)).click();
        Reporter.log("Locations link is clicked",true);
    }

    public void validateHeaderAfterClickLocation(String HeaderText){
        Reporter.log("Location link cliced and opening next page",true);
        Assert.assertEquals(HeaderOfLinkLocations.getText(),HeaderText);
        Reporter.log("the header of Location link page is:"+HeaderOfLinkLocations.getText(),true);
    }

    public void validateAdminPageLinkText(String textAdminpage)  {

        Assert.assertEquals(lnkAdminPage.getText(),textAdminpage);
        Reporter.log("The text At link is :" + lnkAdminPage.getText(),true);
    }


    public void clickLinkAdminPage(){
        Reporter.log("Admin Page link will be clicked",true);
        wait.until(ExpectedConditions.elementToBeClickable(lnkAdminPage)).click();
        Reporter.log("AdminPage link is clicked",true);
    }

    public void validateHeaderAfterClickAdminPage(String HeaderText){
        Reporter.log("Admin Page link cliced and opening next page",true);
        Assert.assertEquals(HeaderOfLinkAdminPage.getText(),HeaderText);
        Reporter.log("the header of Admin Page link page is:"+HeaderOfLinkAdminPage.getText(),true);
    }

    public void validatetextCustomerLogin(String customerlogin)  {

        Reporter.log(" going to Custommer Login text",true);
        Assert.assertEquals(lblCustomerLogin.getText(),customerlogin);
        Reporter.log("The Text of lebel:" + lblCustomerLogin.getText(),true);
    }

    public void validateUsernametext(String textusername)  {


        Assert.assertEquals(lblUsername.getText(),textusername);
        Reporter.log("The Text is :" + lblUsername.getText(),true);
    }

    public void checkUserNameisEmpty(){
        Assert.assertEquals(txtUsername.getText(),"");
        Reporter.log("the text at username box is:" + txtUsername.getText() ,true);
    }

    public void enterUsername(String Username){
        Reporter.log("Username Textbox will be clicked",true);
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(txtUsername));
        element.sendKeys(Username);
    }

    public void validatePasswordtext(String textPassword)  {


        Assert.assertEquals(lblPassword.getText(),textPassword);
        Reporter.log("The Text is :" + lblPassword.getText(),true);
    }

    public void enterPassword(String Password)  {

        Reporter.log("Password Textbox will be clicked",true);
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(txtPassword));
        element.sendKeys(Password);
    }

    public void validatebtnLoginText()  {
        if(btnLogin.getText().equals("LOG In")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }

        /*Assert.assertEquals(btnLogin.getText(),loginText);
        Reporter.log("The Text on button login is:" + btnLogin.getText(),true);*/
    }

    public void clickLogin(){
        Reporter.log("Login button will be clicked",true);
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();
        Reporter.log("Login button is clicked",true);
    }

    public void validateTextForgotLoginInfo(String textForgotLoginInfo) {

        Reporter.log("Going to Forgot Login Link",true);
        Assert.assertEquals(lnkForgotLoginInfo.getText(),textForgotLoginInfo);
        Reporter.log("The text of link is:"+lnkForgotLoginInfo.getText(),true);
    }

    public void clickForgotLoginInfoLink(){
        Reporter.log("ForgotLogInInfo will be clicked",true);
        wait.until(ExpectedConditions.elementToBeClickable(lnkForgotLoginInfo)).click();
        Reporter.log("ForgotLogInInfo is clicked",true);

    }

    public void validatetextRegisterLink(String textRegister) {

        Reporter.log("Going to Register Link",true);
        Assert.assertEquals(lnkRegister.getText(),textRegister);
        Reporter.log("The text of link is:"+lnkRegister.getText(),true);
    }

    public void clickRegisterLink(){
        Reporter.log(" Register Link will be clicked",true);
        wait.until(ExpectedConditions.elementToBeClickable(lnkRegister)).click();
        Reporter.log(" Register Link is clicked",true);
    }

    public void loginParaBank(String username,String password){
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }




}
