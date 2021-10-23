package com.syntax.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    /*This driver will navigate to a website by given URL   <--this is a javadoc
    @param URL
     */
    public static void openWithSpecificUrl(String url){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

/*
This method will quit an open Browser   <--this is a javadoc
 */
    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
