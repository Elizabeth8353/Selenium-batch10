package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();//opens browser
        driver.navigate().to("https://www.google.com/");
        //maximizing is important when you need to screenshot your testscript
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();//you cant see your tool bar no tabs
        driver.navigate().back();//goes back to line 10 opening browser

    }
}
