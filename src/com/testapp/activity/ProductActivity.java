package com.testapp.activity;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

/**
 * Created by aparajita on 15/05/17.
 */
public class ProductActivity {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/LION_2/Downloads/AparajitaDocs/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");

        WebElement searchBox;
        searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("sony tv");
        searchBox.submit();

        driver.findElements(By.className("search-guidance__text-item-link")).get(0).click();

        selectRandom(driver);
        getGuestCheckout(driver);

    }

    private static void getGuestCheckout(WebDriver driver) {
        driver.findElement(By.id("binBtn_btn")).click();
        driver.findElement(By.id("addNoThx")).click();
        driver.findElement(By.id("gtChk")).click();

    }

    @Test
    public static void selectRandom(WebDriver driver)
    {
        driver.findElement(By.className("vip")).click();

 /*       List<WebElement> elementList = driver.findElements(By.id("ListViewInner"));
        Random rand = new Random();
        int index = rand.nextInt(elementList.size());
        System.out.println("Total elements : " + elementList.size()+"  "+index+"image "+elementList.get(index).getTagName());
        elementList.get(index).click();*/
    }
}
