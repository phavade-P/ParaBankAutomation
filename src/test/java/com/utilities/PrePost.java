package com.utilities;

import com.constants.Constant;
import com.utility.Browser;
import com.utility.FileReading;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

public class PrePost {
   public  Browser browser = new Browser();
    public Map<String,String > envrnmnt = new HashMap<String, String>();
    public Map<String,String> TestData = new HashMap<String, String>();

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
    @BeforeTest
    public void launch(){

        envrnmnt = FileReading.readEnvironment(Constant.env,Constant.filename);

        browser.launch();
        browser.maximize();
        browser.nevigateUrl(envrnmnt.get("ApplicationUrl"));
    }

    @AfterMethod
    public void close(){
        browser.close();
    }



}
