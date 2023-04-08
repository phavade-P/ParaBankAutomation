package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class FindTransactionPage {
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

    @FindBy(xpath="//div[@id='leftPanel']//li[5 and contains(.,'Find Transactions')]")
    public WebElement lnkFindTransactions;

    @FindBy(xpath="//h1[@class='title' and contains(.,'Find Transactions')]")
    public WebElement headerFindTransactions;

    @FindBy(xpath="//select[@id='accountId']")
    public WebElement selectAccountId;




    public FindTransactionPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait= new WebDriverWait(driver,60);
    }

    public void enterUserName(String username){
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(txtUsername));
        element.sendKeys(username);
    }

    public void enterPassword(String password){
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(txtUsername));
        element.sendKeys(password);
    }
    public void clickLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();
    }

    public void validateWelcomeUserText(String WelComeText){
        wait.until(ExpectedConditions.visibilityOf(lblWelcome));
        Assert.assertEquals(lblWelcome.getText(),WelComeText);
        Reporter.log("The String at welcome :" + lblWelcome.getText());
    }

    public void clickLinkFindTransactions(){
        wait.until(ExpectedConditions.visibilityOf(lnkFindTransactions)).click();
    }

    public void validateTextHeader(String headertext){
        Assert.assertEquals(headerFindTransactions.getText(),headertext);
        Reporter.log("the text at header of page is:"+ headerFindTransactions.getText());
    }
    public void selectAccountId(){
        wait.until(ExpectedConditions.visibilityOf(selectAccountId)).isSelected();
    }
    




}
