package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeys {
    static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement user=driver.findElement(By.id("ctl00_MainContent_username"));
        user.sendKeys("Tester", Keys.TAB);
        WebElement pass=driver.findElement(By.id("ctl00_MainContent_password"));
        pass.sendKeys("test",Keys.ENTER);//when we click on button instead we are testing the functunality of the button
    }
}
