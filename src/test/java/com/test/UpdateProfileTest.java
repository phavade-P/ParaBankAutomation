package com.test;

import com.constants.Constant;
import com.pages.LoginPage;
import com.pages.UpdateProfilePage;
import com.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

public class UpdateProfileTest extends PrePost {
    @Test
    public void TC001_validateAllLabels(){


        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());
        TestData= FileReading.readUserProperties(Constant.updateProfile+Constant.slash+"TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        String[] userDetails =users.get("user1_credentials").split(";");
         loginPage.loginParaBank(userDetails[0], userDetails[1]);
         updateProfilePage.clickLinkUpdateContactInfo();
        updateProfilePage.getTextOfHeader(TestData.get("header"));
        updateProfilePage.ValidateFirstName(TestData.get("firstName"));
        updateProfilePage.ValidateLastName(TestData.get("LastName"));
        updateProfilePage.ValidateAddress(TestData.get("Address"));
        updateProfilePage.ValidateCity(TestData.get("City"));
        updateProfilePage.ValidateState(TestData.get("State"));
        updateProfilePage.ValidateZipCode(TestData.get("ZipCode"));
        updateProfilePage.ValidatePhone(TestData.get("Phone"));

    }
    @Test
    public void TC002_UpdateProfileSuccessfully(){
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());
        TestData= FileReading.readUserProperties(Constant.updateProfile+Constant.slash+"TC002_UpdateProfileSuccessfully");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        String[] userDetails =users.get("user1_credentials").split(";");
        loginPage.loginParaBank(userDetails[0], userDetails[1]);

        updateProfilePage.clickLinkUpdateContactInfo();
        updateProfilePage.enterFirstName(TestData.get("firstName"));
        updateProfilePage.enterLastName(TestData.get("LastName"));
        updateProfilePage.enterAddress(TestData.get("Address"));
        updateProfilePage.enterCity(TestData.get("City"));
        updateProfilePage.enterState(TestData.get("State"));
        updateProfilePage.enterZipCode(TestData.get("Zipcode"));
        updateProfilePage.enterPhoneNumber(TestData.get("Phone"));
        updateProfilePage.clickBtnUpdateProfile();
        updateProfilePage.velidateProfileUpdated(TestData.get("upadte"));


    }
}
