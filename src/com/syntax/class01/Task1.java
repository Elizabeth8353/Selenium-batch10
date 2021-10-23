package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        /*1. launch the browser
          2. navigate to amazon web site
          3. print out the title and the url in the console
          4. close the browser
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");//set property one says which driver
        //and path we have our chrome stored in

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String title= driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(title+" "+url);
        driver.quit();
    }
}
