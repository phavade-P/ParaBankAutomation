package com.utility;

import com.constants.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Browser {
    private WebDriver driver;
    private String browsername;

    public WebDriver getDriver() {
        return this.driver;
    }


    public void launch() {
       // this.browsername=Constant.browsername;

        if (Constant.browsername.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", Constant.pathmainResources + "\\chrome_exe\\chromedriver.exe");
            this.driver = new ChromeDriver();
        } else if (Constant.browsername.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.chrome.driver", Constant.pathmainResources + "\\chrome_exe\\chromedriver.exe");
            this.driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", Constant.pathmainResources + "\\chrome_exe\\chromedriver.exe");
            this.driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
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

        }*/

        public void maximize () {
               try {
                   this.driver.manage().window().maximize();

               }catch(Exception e) {
                   this .launch();
                   this.driver.manage().window().maximize();
               }
        }

        public void nevigateUrl (String url)
        {
            this.driver.get(url);
        }
        public void close () {
            this.driver.close();
            this.driver.quit();
        }
    }

