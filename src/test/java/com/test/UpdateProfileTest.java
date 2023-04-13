package com.test;

import com.pages.LoginPage;
import com.pages.UpdateProfilePage;
import com.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

public class UpdateProfileTest extends PrePost {
    @Test
    public void validateAllLabels(){
        LoginPage loginPage = new LoginPage(browser.getDriver());
        String user[] = {}
        loginPage.loginParaBank();
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());
        TestData= FileReading.readUserProperties("UpdateProfile");
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
}
