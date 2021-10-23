package com.syntax.class11.upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class desktopUploading {
    static String url = "https://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {
        //use input tag to upload
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement fileUploadLink=driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();
        WebElement chooseFile=driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:/Users/Elizabeth/OneDrive/Desktop/SeleniumUpload.xlsx");//if send keys don't work use robot class
        WebElement upload=driver.findElement(By.id("file-submit"));
        upload.click();
    }
}
