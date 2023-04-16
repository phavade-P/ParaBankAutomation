package com.test;

import com.constants.Constant;
import com.pages.LoginPage;
import com.utilities.PrePost;

import com.utility.FileReading;
import org.testng.annotations.Test;

//@Listeners(com.utilities.Listeners.class)
public class LoginTestCase extends PrePost {


        // loginPage.validateSolutionText(LoginpageTestData.get("solution"));


    @Test
    public void Test002_CheckAboutUsLink() {
        LoginPage loginPage = new LoginPage(browser.getDriver());
        TestData = FileReading.readUserProperties(Constant.login+Constant.slash+"LoginData");
        loginPage.clickLinkAboutUs();
        loginPage.validateAboutUsLinkText(TestData.get("about_us"));
        loginPage.validateHeaderAfterClickAboutUs(TestData.get("Header_About_us"));
    }


        @Test
        public void login () {
            LoginPage loginPage = new LoginPage(browser.getDriver());
            String[] userdata=users.get("user1_credentials").split(";");
            loginPage.loginParaBank(userdata[0],userdata[1]);
        }

    }