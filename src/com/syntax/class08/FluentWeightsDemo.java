package com.syntax.class08;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWeightsDemo {
    public static void main(String[] args) {
        //It's a global wait used in some frameworks it's written only once as implicit wait
        //we don't interact like in explicit waits we interact with specific element in fluent and implicit we set only once and it will perform for whole execution
        //Not usually used in frame works different syntax then other waits
        WebDriver driver=new ChromeDriver();
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(20))
        .pollingEvery(Duration.ofSeconds(5))//will start looking for element after 5 sec/ but implicit looks every 0.5 sec till reached total
        .ignoring(NoSuchElementException.class);// we can ignore some excemptions
    }
}
