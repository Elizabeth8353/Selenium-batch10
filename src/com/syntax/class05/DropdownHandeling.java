package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHandeling {
    public static String url="http://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement daysDD=driver.findElement(By.id("select-demo"));


        Select select=new Select(daysDD);//inside constructor of select need to provide the webelement you want to perform actions on

        System.out.println("==================is multiple==============================");
        boolean is=select.isMultiple();//method tells you if you can select more than one option
        System.out.println(is);
        //methods in select class three ways to select values in the dropdown
       // select.selectByIndex(3);
      //  Thread.sleep(1000);
      //  select.selectByVisibleText("Thursday"); by text in the node
      //  Thread.sleep(1000);
      //  select.selectByValue("Sunday");//the attribute of the value

        List<WebElement> allOptions=select.getOptions();//getOptions is a method returns a list of Webelements
        int size=allOptions.size();
        System.out.println(size);

        for (int i = 0; i <size ; i++) {
            String optonsText=allOptions.get(i).getText();
            System.out.println(optonsText);
            select.selectByIndex(i);
            Thread.sleep(1000);
        }

    }
}
