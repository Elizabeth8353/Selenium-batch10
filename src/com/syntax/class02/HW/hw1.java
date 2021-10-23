package com.syntax.class02.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw1 {
    public static void main(String[] args) throws InterruptedException {
        /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
          fill out the form
          click on register
          close the browser
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        WebElement firstName=driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Elizabeth");
        WebElement lastName=driver.findElement(By.name("customer.lastName"));
        lastName.sendKeys("Val");
        WebElement address=driver.findElement(By.id("customer.address.street"));
        address.sendKeys("8112 syntax street");
        WebElement city=driver.findElement(By.name("customer.address.city"));
        city.sendKeys("Alexandria");
        WebElement state=driver.findElement(By.id("customer.address.state"));
        state.sendKeys("Virginia");
        WebElement zipCode=driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("22309");
        WebElement phoneNumber=driver.findElement(By.name("customer.phoneNumber"));
        phoneNumber.sendKeys("703-625-5544");
        WebElement ssn=driver.findElement(By.name("customer.ssn"));
        ssn.sendKeys("213-55-4544");
        WebElement userName=driver.findElement(By.id("customer.username"));
        userName.sendKeys("Elizabeth86@gmail.com");
        WebElement userPassword=driver.findElement(By.id("customer.password"));
        userPassword.sendKeys("P@ssw8686");
        WebElement confirmPassword=driver.findElement(By.name("repeatedPassword"));
        confirmPassword.sendKeys("P@ss8686");
        Thread.sleep(2000);
        WebElement registerButton=driver.findElement(By.className("button"));
        registerButton.click();
        Thread.sleep(1000);
        driver.close();
    }
}
