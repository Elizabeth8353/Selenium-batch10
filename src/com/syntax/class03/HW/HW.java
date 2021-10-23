package com.syntax.class03.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        WebElement practicingButton=driver.findElement(By.partialLinkText("Start"));
        practicingButton.click();
        Thread.sleep(1000);
        WebElement simpleFormButton=driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]"));
        simpleFormButton.click();
        WebElement enterText=driver.findElement(By.id("user-message"));
        enterText.sendKeys("Hello World in Selenium");
        Thread.sleep(1000);
        WebElement showMessageButton=driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessageButton.click();
        Thread.sleep(1000);
       // driver.quit();
    }
}
