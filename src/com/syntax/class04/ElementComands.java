package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementComands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement ageRadioButton = driver.findElement(By.cssSelector("input[value='5 - 15']"));
        boolean isAgeRadiobuttonEnable = ageRadioButton.isEnabled();//means its clickable and working method is used to check
        System.out.println(isAgeRadiobuttonEnable);//if element is enable or disable if disable we can't click
        if (!isAgeRadiobuttonEnable) {
            System.out.println("jnhofhnasn");
        } else {
            System.out.println("Is enabled");
        }

        boolean isAgeRadioButtonDisplayed = ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioButtonDisplayed);//means it is present and viewable in webpage


        boolean isAgeRadioButtonSelected = ageRadioButton.isSelected();//means if it is clicked
        System.out.println("Before Clicking " + isAgeRadioButtonSelected);//right now false since has not been clicked yet
        ageRadioButton.click();// clicking on radiobutton
        isAgeRadioButtonSelected = ageRadioButton.isSelected();//need to reassign ageradiobutton.isSelected() since it was initilized with false on line27
        System.out.println("After Clicking " + isAgeRadioButtonSelected);//now its true since we reassigned to true after click on line 30
        driver.quit();
    }
}
