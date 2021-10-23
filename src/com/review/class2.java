package com.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.navigate().to("https://www.saucedemo.com/");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        String title=driver.getTitle();
        System.out.println("the title of the page is "+title);
        String url= driver.getCurrentUrl();
        System.out.println("the url of the page is "+url);
        driver.manage().window().maximize();
        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement login=driver.findElement(By.id("login-button"));
        login.click();

        WebElement menu=driver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
        Thread.sleep(2000);
        WebElement about=driver.findElement(By.id("about_sidebar_link"));
        about.click();
        driver.navigate().back();
        WebElement addToCart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();
    }
}
