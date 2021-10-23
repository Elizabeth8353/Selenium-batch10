package com.syntax.class07;

import com.syntax.MyMethods.Eli;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
    static String url = "http://syntaxprojects.com/";

    public static void main(String[] args) throws InterruptedException {
        Eli.setMyProperty();
       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//If the element is not found will wait the entire 20 sec if found in 5sec will ignore the 15sec remaining
        WebElement startPacticingButton=driver.findElement(By.id("btn_basic_example"));
        startPacticingButton.click();
//The downside of Implicit wait is it only applies to findElement even if though element if found and disable it will not throw an error
        //because element is found it won't look for disable error

    }
}
