package com.syntax.class08;

import com.syntax.MyMethods.Eli;
import javafx.beans.binding.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        Eli.setMyProperty();
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        String mainHandle=driver.getWindowHandle();
       System.out.println(mainHandle);//CDwindow-8F5620575FC2205491373E8318AD892F
        WebElement fallowOnInsta=driver.findElement(By.linkText("Follow On Instagram"));
        WebElement likeOnFace=driver.findElement(By.linkText("Like us On Facebook"));
        WebElement fallowInstaFace=driver.findElement(By.partialLinkText("Follow Instagram & Facebook"));
        fallowOnInsta.click();
        likeOnFace.click();
        fallowInstaFace.click();
        Set<String>allHandles=driver.getWindowHandles();
        System.out.println(allHandles.size());
        Iterator<String> it=allHandles.iterator();
        while (it.hasNext()){
            String handle=it.next();
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
        }








    }
}
