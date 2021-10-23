package com.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        WebElement createAccount=driver.findElement(By.linkText("Create New Account"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Elizabeth");
        WebElement surname=driver.findElement(By.name("lastname"));
        surname.sendKeys("Peralta");
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("Elizabeth5@gmail.com");



    }
}
