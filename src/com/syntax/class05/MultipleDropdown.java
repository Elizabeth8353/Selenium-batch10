package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleDropdown {
    public static String url="http://syntaxprojects.com/basic-select-dropdown-demo.php";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);

            WebElement statesDD=driver.findElement(By.id("multi-select"));

            Select select=new Select(statesDD);
            boolean isMultiple=select.isMultiple();//checks if DD has more then one option we can click on at the same time
            System.out.println(isMultiple);

            if(isMultiple){
                List<WebElement> options=select.getOptions();////getOptions is a method returns a list of Webelements
                //we are getting the options and storing them in list container
                for (WebElement option:options) {
                    String optionText=option.getText();//in every iteration a text will be stored on optionText
                    if(optionText.equalsIgnoreCase("New York")){//the text on line 28 will be compared to New York if true will break loop
                      break;  // if i want it to select till new york only
                   }
                    select.selectByVisibleText(optionText);
                }
            }
          //  select.deselectByIndex(5); //deselects one index starts at 0
           // select.deselectAll(); will deselect all



    }
}
