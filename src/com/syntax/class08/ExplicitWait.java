package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    static String url="http://syntaxprojects.com/dynamic-data-loading-demo.php";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement button=driver.findElement(By.id("save"));
        button.click();
       //implicit only works with findElements only waiting for element to be found but explicit wait we are waiting for specific contitions for a specific element
        //implicit will only help to find the element will not tell you if it's enable or disable
        WebDriverWait wait=new WebDriverWait(driver,20);//need to pass 2 different arguments the obj of our WebDriver and waiting time
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("First-Name")));//pass in arguments expected condition
        // "//p[contains(text(),'First Name')]"//Or we can use xpath for the dinamic element
       // WebElement firstName=driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));//locating by xpath
        WebElement firstName=driver.findElement(By.id("First-Name"));
        System.out.println(firstName.getText());


    }
}
