package com.syntax.class07.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task1 {
        /*Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify the title is displayed
Print out the title of the all pages
         */
    static String web="webdriver.chrome.driver";
    static String driver="Drivers/chromedriver.exe";
    static String url="https://demoqa.com/browser-windows";
        public static void main(String[] args) throws InterruptedException {
            System.setProperty(web, driver);
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
           String mainPage= driver.getWindowHandle();
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            WebElement newTab=driver.findElement(By.id("tabButton"));
            WebElement newWindow=driver.findElement(By.id("windowButton"));
            WebElement newWindowMessage=driver.findElement(By.id("messageWindowButton"));
            newTab.click();
            newWindow.click();
            newWindowMessage.click();


            Set<String> allHandles=driver.getWindowHandles();
            System.out.println(allHandles.size());

            Iterator<String> it= allHandles.iterator();
            while (it.hasNext()){
               String nextHandle=it.next();
               if(nextHandle.equals(mainPage)) {
                   driver.switchTo().window(nextHandle);
                   System.out.println(driver.getTitle()+"Title Displayed");

               }else{
                   System.out.println("Title did not display");
               }

           }
            driver.switchTo().window(mainPage);




    }
}
