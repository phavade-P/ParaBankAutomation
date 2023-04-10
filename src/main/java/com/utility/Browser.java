package com.utility;

import com.constants.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Browser {
    private WebDriver driver;
    private String browsername;

    public WebDriver getDriver() {
        return this.driver;
    }

    public Browser(String browsername) {
        this.browsername = browsername;
    }

    public void launch() {
        this.browsername=Constant.browsername;

        if (browsername.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.driver.chrome", Constant.pathmainResources + "\\chrome_exe\\chromedriver.exe");
            this.driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.driver.chrome", Constant.pathmainResources + "\\chrome_exe\\chromedriver.exe");
            this.driver = new FirefoxDriver();
        } else {

        }
    }
       /* else if (this.browsername.equalsIgnoreCase("chromeGrid"))
        {

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");
            try {
                // this.driver= new RemoteWebDriver(new URL"");

            } catch (Exception e) {
                System.out.println(e.toString());
            }
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        }*/

        public void maximize () {

                this.driver.manage().window().maximize();

        }

        public void nevigateUrl (String url){
            this.driver.get("url");
        }
        public void close () {
            this.driver.close();
            this.driver.quit();
        }
    }

