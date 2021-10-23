package com.syntax.class11.JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JsExecuterDemo {
    public static String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.backgroundColor='pink'",password);//highlight password textbox red
        //when you want to highlight important words or
        js.executeScript("arguments[0].style.backgroundColor='yellow'",userName);

        WebElement loginButton=driver.findElement(By.id("btnLogin"));
      //  loginButton.click();
        js.executeScript("arguments[0].click(),click()",loginButton);//using js to click on login button
    }
}
