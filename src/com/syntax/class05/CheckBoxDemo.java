package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {
   public static String url="http://syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        List<WebElement> optionCheckBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        int size =optionCheckBoxes.size();
        System.out.println(size);
        for (WebElement option:optionCheckBoxes) {
            String checkboxValue=option.getAttribute("value");
           //  option.click(); to check all of them without line 25 to 30
            if(checkboxValue.equalsIgnoreCase("Option-2")){//if to place condition
               // option.click(); this condition is to would only click on one check box
                //break//line 26 to 27 this would check one check box and break out of loop
                Thread.sleep(1000);

                continue;
            }
            option.click();

        }


    }
}
