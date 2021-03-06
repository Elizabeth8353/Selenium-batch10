package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropdown {
    public static String url="https://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement categoriesDD=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(categoriesDD);

        List<WebElement> options=select.getOptions();
        for (WebElement option:options) {
            String optionText=option.getText();
            System.out.println(optionText);
        }
        select.selectByValue("search-alias=alexa-skills");//this is by value the attribute value of our value attribute
        //visible text is better to use in the job

    }
}
