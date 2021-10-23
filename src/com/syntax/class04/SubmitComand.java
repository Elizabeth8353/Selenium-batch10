package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitComand {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("Tester");
        WebElement passWord=driver.findElement(By.cssSelector("input[name*='password']"));
        passWord.sendKeys("test");
        WebElement login=driver.findElement(By.className("button"));
        login.submit();
    }
}
