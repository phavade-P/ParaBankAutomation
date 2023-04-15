package com.test;

import com.pages.RegistrationPage;
import com.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

public class RegistrationTestCase extends PrePost {

    @Test
    public void checkAllLabelsOnPage(){
        RegistrationPage registrationPage = new RegistrationPage(browser.getDriver());
        TestData = FileReading.readUserProperties("RegistrationData");
        registrationPage.clickRegisterLink();
       // Thread.wait(6000);
        registrationPage.validateRegistrationPage(TestData.get("Header_registration"));
        registrationPage.validateFirstNameLebel(TestData.get("first_name"));
        registrationPage.validateLastNameLebel(TestData.get("last_name"));
        registrationPage.validateAddressLebel(TestData.get("address"));
        registrationPage.validateCityLebel(TestData.get("city"));
        registrationPage.validateStateLebel(TestData.get("state"));
        registrationPage.validateZipCodeLebel(TestData.get("zip_code"));
        registrationPage.validatePhoneLebel(TestData.get("phone_number"));
        registrationPage.validateSSNLebel(TestData.get("SSN"));
        registrationPage.validateUserNameLebel(TestData.get("username"));
        registrationPage.validatePasswordLebel(TestData.get("password"));
        registrationPage.validateConfirmLebel(TestData.get("confirm"));


    }

}


