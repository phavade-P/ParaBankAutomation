package com.utilities;

import com.constants.Constant;
import com.utility.Browser;
import com.utility.FileReading;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

public class PrePost {
    @BeforeSuite
    public void beforeSuite(){
        String browserName = System.getProperty("browsername");
        if (browserName != null) {
            Constant.browsername = browserName;
        }else{
            Constant.browsername = " chrome";
        }

        String env = System.getProperty("env");
        if(env != null){
            Constant.env = env;
        }else{
            Constant.env = "QA";
        }
    }



}
