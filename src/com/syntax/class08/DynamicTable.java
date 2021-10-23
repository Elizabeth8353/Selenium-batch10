package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class DynamicTable {
    static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement user=driver.findElement(By.id("ctl00_MainContent_username"));
        user.sendKeys("Tester");
        WebElement pass=driver.findElement(By.id("ctl00_MainContent_password"));
        pass.sendKeys("test");
        WebElement button=driver.findElement(By.id("ctl00_MainContent_login_button"));
        button.click();

        List<WebElement>rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']"));
        Iterator<WebElement>it=rows.iterator();
        while (it.hasNext()){
            WebElement row= it.next();
            String text=row.getText();
            System.out.println(text);
        }

        System.out.println("===========for loop without the header===========");
        for (int i = 1; i <rows.size() ; i++) {//IF WE WANT TO INCLUDE THE HEADER INITIALIZE i to 0 instead of 1
            String rowText=rows.get(i).getText();
            System.out.println(rowText);
        }

    }
}
