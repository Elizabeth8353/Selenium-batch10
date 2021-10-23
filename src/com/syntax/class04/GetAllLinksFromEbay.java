package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinksFromEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
            List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println("Number of Links "+allLinks.size());

        for (WebElement link:allLinks) {
            String linkText=link.getText();//getting text from each link iteration
            String fullLink=link.getAttribute("href");//getting the links with getAttribute() which gets us the value of the attribute we provide
            if(!linkText.isEmpty()){//printing only link text and links that hold value and not empty
                System.out.println(linkText+" "+fullLink);
            }
        }

    }
}
