package com.test;

import com.constants.Constant;
import com.pages.LoginPage;
import com.utilities.PrePost;

import org.testng.annotations.Test;

//@Listeners(com.utilities.Listeners.class)
public class LoginTestCase extends PrePost {


        // loginPage.validateSolutionText(LoginpageTestData.get("solution"));
    }

    @Test
    public void Test002_CheckAboutUsLink(){
        LoginPage loginPage  = new LoginPage(browser.getDriver());
        TestData =  FileReading.readUserProperties(Constant.filename);
        loginPage.clickLinkAboutUs();
        loginPage.validateAboutUsLinkText(TestData.get("about_us"));
        loginPage.validateHeaderAfterClickAboutUs(TestData.get("Header_About_us"));




    @Test
    public void checkUsernameFieldisEmpty(){
        LoginPage loginPage  = new LoginPage(browser.getDriver());
        loginPage.checkUserNameisEmpty();
    }

