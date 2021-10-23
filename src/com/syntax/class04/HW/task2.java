package com.syntax.class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class task2 {
    public static void main(String[] args) {
        /*Amazon link count
        open browser
        got to https://www.amazon.com/
        get all the links
        get number of links that has text
        print to console only the links that has text
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> amazon=driver.findElements(By.tagName("a"));
        System.out.println("amazon links size including without text: "+amazon.size());
        int count=0;
        for (WebElement a:amazon) {
            String links=a.getText();
            if (!(links.isEmpty())){
                System.out.println(links);
                count++;
            }
        }
        System.out.println("Total number of LInks with Text: "+count);
    }
}
