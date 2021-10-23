package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarHandeling {
    static String url = "https://www.delta.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement calendar=driver.findElement(By.id("input_departureDate_1"));
        calendar.click();

        WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
        WebElement dMonth=driver.findElement(By.className("dl-datepicker-month-0"));
        String dMonthText=dMonth.getText();

        while (!dMonthText.equals("December 2021")){
            nextButton.click();
            dMonthText=dMonth.getText();
        }

        List<WebElement> departDates=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-month-0']/tr/td"));
        for (WebElement departDate:departDates) {
            if(departDate.getText().equals("19")){
                departDate.click();
                break;
            }
        }

        WebElement rMonth=driver.findElement(By.className("dl-datepicker-month-1"));
        String rMonthText=rMonth.getText();
        while (!rMonth.equals("February")){
            nextButton.click();
            rMonthText=rMonth.getText();
        }
        List<WebElement>returnDate=driver.findElements(By.xpath(""));


    }
}
