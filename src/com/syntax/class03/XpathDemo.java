package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement userName=driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        userName.sendKeys("Tester");
        WebElement passWord=driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("test");

        WebElement loginButton=driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();


    }
}