package com.test;

import com.constants.Constant;
import com.pages.LoginPage;
import com.utilities.PrePost;
import com.utility.Browser;
import com.utility.FileReading;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

//@Listeners(com.utilities.Listeners.class)
public class LoginTestCase extends PrePost {




    @Test
    public void TC001_validatelabels() throws InterruptedException {

        LoginPage loginPage  = new LoginPage(browser.getDriver());
        TestData =  FileReading.readUserProperties("LoginData");
        loginPage.validateSolutionText(TestData.get("solution"));
        loginPage.validateAboutUsLinkText(TestData.get("about_us"));
        loginPage.validateServicesLinkText(TestData.get("services"));
        loginPage.validateProductsLinkText(TestData.get("products"));
        loginPage.validateLocationsLinkText(TestData.get("location"));
        loginPage.validateAdminPageLinkText(TestData.get("adminPage"));
        loginPage.validatetextCustomerLogin(TestData.get("customerLogin"));
        loginPage.validateUsernametext(TestData.get("username"));
        loginPage.validatePasswordtext(TestData.get("password"));
        loginPage.validatebtnLoginText();
        loginPage.validateTextForgotLoginInfo(TestData.get("forgotaboutInfo"));
        loginPage.validatetextRegisterLink(TestData.get("register"));


        // loginPage.validateSolutionText(LoginpageTestData.get("solution"));
    }

    @Test
    public void Test002_CheckAboutUsLink(){
        LoginPage loginPage  = new LoginPage(browser.getDriver());
        TestData =  FileReading.readUserProperties(Constant.filename);
        loginPage.clickLinkAboutUs();
        loginPage.validateAboutUsLinkText(TestData.get("about_us"));
        loginPage.validateHeaderAfterClickAboutUs(TestData.get("Header_About_us"));

    }




    @Test
    public void checkUsernameFieldisEmpty(){
        LoginPage loginPage  = new LoginPage(browser.getDriver());
        loginPage.checkUserNameisEmpty();
    }


}
