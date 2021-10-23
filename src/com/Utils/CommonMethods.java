package com.Utils;

import com.syntax.testbase.BaseClass;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;

public class CommonMethods extends BaseClass {
/*THIS METHOD SENDS TEXT TO A GIVEN WEBELEMENT
@param element
@param text
fuction to send text to a specific function to send texts
 */

    public void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }
/*
THis method will switch to frame by index
@param index
 */
    public void switchToFrame(int index){
        try {
            driver.switchTo().frame(index);
        }catch (NoSuchFrameException e){
            e.printStackTrace();
        }
    }
}
