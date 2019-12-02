package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {
    public static void main(String[] args) {


        WebDriver driver =WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button3 =driver.findElement(By.xpath("//button[@onclick='button3()']"));
        button3.click();







    }

}
