package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingAlerts {
    static String url="http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement simpleAlertButton=driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Alert simpleAlert=driver.switchTo().alert();//switching focus to alert
        Thread.sleep(1000);
        simpleAlert.accept();//handeling simple alert clicking ok

        WebElement confirmAlertButton =driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Alert confirmAlert=driver.switchTo().alert();
        String alertText=confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();//clicking cancel instead of ok

        WebElement promptAlertButton=driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Asghar is King");
    }
}
