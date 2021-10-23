package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        WebElement practiceButton=driver.findElement(By.cssSelector("a#btn_basic_example"));
        practiceButton.click();
        WebElement simpleFormDemo=driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]"));
        simpleFormDemo.click();
        WebElement textBox=driver.findElement(By.cssSelector("input[placeholder^='Please']"));
        textBox.sendKeys("Money Bags");
        WebElement showMessageButton=driver.findElement(By.cssSelector("button[onclick*='()']"));
        showMessageButton.click();
    }
}
