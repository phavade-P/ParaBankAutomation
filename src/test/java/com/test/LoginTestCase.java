package com.test;

import com.constants.Constant;
import com.utility.Browser;
import com.utility.FileReading;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class LoginTestCase {

    @BeforeTest
    public void launch(){
        Map<String,String > envrnmnt = new HashMap<String, String>();
        envrnmnt = FileReading.readEnvironment(Constant.env);
        Browser browser = new Browser("chrome");
        browser.launch();
        browser.maximize();
        browser.nevigateUrl(envrnmnt.get("ApplicationUrl"));
    }
    @Test
    public void TC001_validateLabelOnLogin(){
        System.out.println("running my first test case");
        Reporter.log("running test case");

    }

}
