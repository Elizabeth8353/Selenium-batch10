package com.syntax.class02.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw2 {
    public static void main(String[] args) throws InterruptedException {
        /*navigate to fb.com
          click on create new account
          fill up all the textboxes
          click on sign up button
          close the pop up
          close the browser
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
       // driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createNewAcc= driver.findElement(By.linkText("Create New Account"));
        createNewAcc.click();
        Thread.sleep(1000);
        WebElement name=driver.findElement(By.name("firstname"));
        name.sendKeys("Elizabeth");
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Val");
        WebElement mobilNumber=driver.findElement(By.name("reg_email__"));
        mobilNumber.sendKeys("703-555-6655");
        WebElement newPassword=driver.findElement(By.id("password_step_input"));
        newPassword.sendKeys("P#DSNLFien2522");
        WebElement signUpBotton=driver.findElement(By.name("websubmit"));
        signUpBotton.click();
        WebElement closePopUp=driver.findElement(By.xpath("//*[@class='_8idr img']"));
        closePopUp.click();
        Thread.sleep(1000);
        driver.close();

    }
}
