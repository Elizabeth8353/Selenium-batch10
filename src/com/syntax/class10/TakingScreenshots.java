package com.syntax.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenshots {
    static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement user = driver.findElement(By.id("ctl00_MainContent_username"));
        user.sendKeys("Tester", Keys.TAB);
        WebElement pass = driver.findElement(By.id("ctl00_MainContent_password"));
        pass.sendKeys("test", Keys.ENTER);



        TakesScreenshot ts=(TakesScreenshot) driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);//the screenshot it taken on this step
        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/SmartBear/adminLogin.png"));//storing our screenshot in a file
            FileUtils.copyFile(sourceFile, new File("screenshots/SmartBear/adminLogin1.png"));//secound screenshot and we can override by not changing the name
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
