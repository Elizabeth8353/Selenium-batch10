package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandelingStaticWebtable {
    static String url = "http://syntaxprojects.com/table-search-filter-demo.php";
    // most of the time when we are interacting with a table what we want to do is get access to the rows and if we
    // want to do that we need to use xpath
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData= driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rowData.size());

        Iterator<WebElement> it=rowData.iterator();
        while (it.hasNext()){
            WebElement row=it.next();
            String rowText=row.getText();
            System.out.println(rowText);
        }
        System.out.println("============Print Headings using iterator====================");
        List<WebElement>colsData=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println(colsData.size());
        Iterator<WebElement> it2=colsData.iterator();
        while (it2.hasNext()){
            WebElement col=it2.next();
            String texts=col.getText();
            System.out.println(texts);
        }
        System.out.println("=====================for loop =================");
        for (WebElement c:colsData) {
            // String col=c.getText();
            //System.out.println(col);
            System.out.println(c.getText()); //we can also print directly without storing it in string

        }
    }
}
