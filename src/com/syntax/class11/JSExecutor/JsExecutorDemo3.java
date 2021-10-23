package com.syntax.class11.JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorDemo3 {
    public static String url="https://www.google.com/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        JavascriptExecutor js=(JavascriptExecutor)driver
                ;
        js.executeScript("window.open();");
        driver.get(url);
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("Hello world");
    }
}
