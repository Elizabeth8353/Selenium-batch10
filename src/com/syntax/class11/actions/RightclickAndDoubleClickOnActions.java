package com.syntax.class11.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickAndDoubleClickOnActions {
    static String url = "http://demo.guru99.com/test/simple_context_menu.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement rightClickButton=driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action=new Actions(driver);
        action.contextClick(rightClickButton).perform();

        WebElement editOption=driver.findElement(By.xpath("//span[text()='Edit']"));
        //editOption.click();
        action.click(editOption).perform();//if regular click not working line 21 then use this action click
       Alert alert= driver.switchTo().alert();// to handle alerts we need alert interface and we storing it in var because we can switch to another alert in future without having to write all of it
       alert.accept();
       WebElement doubleClickButton=driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
       action.doubleClick(doubleClickButton).perform();
        System.out.println(alert.getText());
        alert.accept();


    }
}
