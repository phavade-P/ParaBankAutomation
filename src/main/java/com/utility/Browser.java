package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    private WebDriver driver;
    private String browsername;

    public WebDriver getDriver(){
        return this.driver;
    }

    public Browser(String browsername){
        this.browsername=browsername;
    }

    public void launch(){
      String browserName = System.getProperty("browsername");
      if(browserName!= null){
          browserName=Constant.browsername;
      }

      if(browsername.equalsIgnoreCase("Chrome")){
          System.setProperty("webdriver.driver.chrome",Constant.pathmainResources+"\\chrome_exe\\chromedriver.exe");
          this.driver=new ChromeDriver();
      }
      else if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.driver.chrome",Constant.pathmainResources+"\\chrome_exe\\chromedriver.exe");
            this.driver=new FirefoxDriver();
        }else{
          System.out.println("the provided browser name is not valid" + this.browsername + "taking chrome as default");
          this.driver = null;
      }
    }

    public void maximize(){

        try{
            this.driver.manage().window().maximize();
        }catch(Exception e){
            this.launch();
            this.driver.manage().window().maximize();
        }
    }

    public void nevigateUrl(String url){
        this.driver.get("url");
    }
    public void close(){
        this.driver.close();
        this.driver.quit();
    }
}
