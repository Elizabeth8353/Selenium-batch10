package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
                                                            //for windows add extension.exe
                                                            // you can use\\if not working

        WebDriver driver=new ChromeDriver();//launch chrome browser
        driver.get("https://www.google.com/");//navigating to google
        String url=driver.getCurrentUrl();//get current url www.google.com
        System.out.println(url);
        String title= driver.getTitle();//getting title the title is mentioned in the tab
        System.out.println(title);
        driver.quit();


    }
}
