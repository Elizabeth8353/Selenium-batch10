package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvanceWindowHandles {
    static String url="https://syntaxprojects.com/window-popup-modal-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String mainPage=driver.getWindowHandle();
        System.out.println(mainPage);

        WebElement instagramButton=driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton=driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton=driver.findElement(By.linkText("Follow Instagram & Facebook"));

        instagramButton.click();//we can click on all three because we are still are still on main page focus is on main page
        fbButton.click();
        igAndFbButton.click();

        Set<String>allWindowHandles=driver.getWindowHandles();
        System.out.println(allWindowHandles.size());

        Iterator<String> it=allWindowHandles.iterator();
        while (it.hasNext()){//start iterating through handles
            String handle=it.next();//get the next handle
            if (!mainPage.equals(handle)) {//set a condition
                driver.switchTo().window(handle);//switch to a window which is not equal to main page handle
             //   String title = driver.getTitle();//will get all the three pages link
             //  System.out.println(title);
                Thread.sleep(1000);
                driver.close();//the focus stays in the last window
            }
//if i place getTitle here for main page not only do I need to switch back regardles but it will print 4 times since it iterates 4 times
        }

       driver.switchTo().window(mainPage);//switch back to parent handle since line 34-39 had the focus on the other pages then after closing focus
        //was not on any page thats why we switch it back to main page, which is why we are not doing (driver.switchTo().defaultcontent()) because
        //it would point to nothing it would not go to main page

      //  System.out.println(driver.getTitle());//we can get the title of our mainpage(firstpage)
        instagramButton.click();//clicking again on one of the child tabs



    }
}
