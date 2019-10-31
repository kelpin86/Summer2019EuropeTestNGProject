package com.cybertek.tests.day3_WebElement_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLChange {
    /**
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybertekschool.com/email_sent
     */

    public static void main(String[] args) {
        //open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //enter any email
        WebElement emailInput = driver.findElement(By.name("email"));
        //sendKeys()-->send keyboard actions to webelement / enters given text
        emailInput.sendKeys("email@gmail.com");
        //locate to password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        //click button
        retrievePasswordButton.click();
        String expectedUrl = "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();
        //verify that url changed to http://practice.cybertekschool.com/email_sent
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }
        //close
        driver.quit();
    }
}