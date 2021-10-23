package com.syntax.class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {
    public static void main(String[] args) {
        /*HRMS application Navigate login:
        Open chrome browser
        go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        enter valid user name
        leave password field empty
        click on login button
        verify error message with text "Password cannot be empty" is displayed
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement user=driver.findElement(By.cssSelector("input#txtUsername"));
        user.sendKeys("Admin");
        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass.sendKeys("");
        WebElement button=driver.findElement(By.name("Submit"));
        button.click();
        WebElement errorMessage=driver.findElement(By.id("spanMessage"));
        String errorMesText=errorMessage.getText();

        if(errorMesText.equals("Password cannot be empty")){
            System.out.println("Error message is displayed: "+errorMessage.getText());
        }else {
            System.out.println("Error message does not display (Password cannot be empty) instead it displays: "+errorMesText);
        }






    }
}
