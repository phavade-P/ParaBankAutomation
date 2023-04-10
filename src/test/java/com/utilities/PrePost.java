package com.utilities;

import com.constants.Constant;
import org.testng.annotations.BeforeSuite;

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
