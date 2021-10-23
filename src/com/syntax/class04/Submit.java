package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//Click similar as submit but works better
        //click applicable for forms
        //submit waits for page to load however the click()
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("Elizabeth@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("blahblah");
        driver.findElement(By.name("login")).submit();
        Thread.sleep(2000);
    }
}
