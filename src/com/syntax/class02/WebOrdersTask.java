package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrdersTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));//assigning our located webelement username
        password.sendKeys("test");//performing action on our stored variable password
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        //String title=driver.getTitle();
       // if ((title.equals("Web Orders"))){
          //  System.out.println("Title is "+title+" and Verified");
       // }else{
           // System.out.println("Incorrect title can't verify");
       // }
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
       // driver.close();
    }
}
