package com.utilities;

import com.constants.Constant;
import com.utility.Browser;
import com.utility.FileReading;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PrePost {
    public Browser browser= new Browser();
    public Map<String,String> envrnmnt = new HashMap<String, String>();
    public Map<String,String> users = new HashMap<String, String>();
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
        envrnmnt = FileReading.readEnvironmentData(Constant.env+Constant.slash,"QA");
        users = FileReading.readEnvironmentData(Constant.env+Constant.slash,"userCredentials");

    }
    @BeforeTest
    public void launch(){
        browser.launch();
        browser.maximize();
        browser.nevigateUrl(envrnmnt.get("ApplicationUrl"));
    }

    @AfterMethod
    public void close(){
        this.takeScreenshot();
        browser.close();
    }

    public void takeScreenshot(){
        TakesScreenshot screenshot = ((TakesScreenshot)browser.getDriver());
        File srcfile=screenshot.getScreenshotAs(OutputType.FILE);
        String date= new Date().toString();
        date = date.replace(":","_").replace(" ","-");
        File destFile = new File("D:\\shrunayu\\prajakta\\Parabank\\ParaBankAutomation\\src\\test\\resources\\Screenshot"+"SSC_"+Constant.currentclsname+date+".png");
        try {
            FileUtils.copyFile(srcfile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
