package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//cannot have two main methods in one class is because it won't compile correctly
public class HandelingFrames {
    static String url="http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
      //  WebElement textBox=driver.findElement(By.id("name"));can't locate element in order to see element we need to switch to iframe if is iframe tag
     //   textBox.sendKeys("Michael is probably naughty");
        driver.switchTo().frame(0);//switching to iframe
        WebElement textBox=driver.findElement(By.id("name"));//now we can see element
        textBox.sendKeys("Michael is probably naughty");
driver.switchTo().defaultContent();//switching back to main page
      //  WebElement simpleAlertButton=driver.findElement(By.id("alert"));
     //   simpleAlertButton.click();

        System.out.println("=====Secound way to handle iframe");
        driver.switchTo().frame("iframe_a");
        textBox.clear();//
        textBox.sendKeys("Syntax tecs");

        driver.switchTo().defaultContent();

        System.out.println("=====Third way switching to Iframe+========================");
        WebElement frameElement= driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textBox.clear();
        textBox.sendKeys("Hi Ely");
    }
}
