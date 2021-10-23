package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class HandelingDDWithIterator {
    public static String url="https://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoriesDD);

        boolean isMultiple=select.isMultiple();
        if(!isMultiple){
            List<WebElement> options=select.getOptions();////getOptions is a method returns a list of Webelements
            Iterator<WebElement> it=options.iterator();//we cannot get an obj from an interface directly, we can get and obj
            //only by refering to a different class for example we are using select in list and options from select for this Iterator

            while (it.hasNext()){//everytime we step forwad and have any values only then we will proceed to line 31
                WebElement ddOption= it.next();//next step will return us the next webelement because out iterator of webelemeny
                //once we have our single webelement on line 33 we can get the text of that webelement
                String optionText=ddOption.getText();//we are getting the text of our single webelement
                System.out.println(optionText);// we printing our the text of that webelement in our console
            }
        }

    }
}
