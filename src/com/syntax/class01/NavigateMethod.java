package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        // diferent way to navigate to a website

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.amazon.com/");//with navigate you can move back and foward and refresh your page
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close();//closes current tab
        driver.quit();//closes all the tabs/whole browser
    }
}
