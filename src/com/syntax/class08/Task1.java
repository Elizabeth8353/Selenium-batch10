package com.syntax.class08;

import com.syntax.MyMethods.Eli;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
    static String url="http://syntaxprojects.com/dynamic-elements-loading.php";


    public static void main(String[] args) throws InterruptedException {

        Eli.setMyProperty();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement button=driver.findElement(By.id("startButton"));
        button.click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));
        WebElement text= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println(text.getText());
        driver.quit();
    }
}
