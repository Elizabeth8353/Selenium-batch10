package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandeling {
    static String url="https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();//this captures address ID for the webpage we just navigated to
        System.out.println(mainPageHandle);//visual look of web unike ID address
        WebElement helpLink=driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String>allWindowHandles= driver.getWindowHandles();//when ever you have a gethandles it will automatically return you a linkedHash set
        //linkedHashset is the internal structure of this method
        //get handle gives us a Set instead of a list because sets do not keep duplicate values
        System.out.println(allWindowHandles.size());

        Iterator<String> it=allWindowHandles.iterator();
        mainPageHandle=it.next();//1st handle main handle
        String childHandle= it.next();//since we have two different tabs we need another handle
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);//switching back to main page

        //driver.close();//only closes main page since focus on selenium was on the main page leaves child tab open
        driver.quit();//terminates whole session



    }
}
