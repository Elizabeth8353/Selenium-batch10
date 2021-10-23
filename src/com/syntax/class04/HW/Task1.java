package com.syntax.class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*Open chrome browser
    Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
    enter valid username and password(user-Admin, password-Hum@nhrm123)
    click login button
    then veryfy syntax logo is displayed
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        WebElement user=driver.findElement(By.id("txtUsername"));
        user.sendKeys("Admin");
        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass.sendKeys("Hum@nhrm123");
        WebElement button=driver.findElement(By.className("button"));
        button.click();
        WebElement img=driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
        boolean image=img.isDisplayed();
        if(image){
            System.out.println("Logo is displayed");
        }else{
            System.out.println("Logo not displayed");
        }

    }
}
