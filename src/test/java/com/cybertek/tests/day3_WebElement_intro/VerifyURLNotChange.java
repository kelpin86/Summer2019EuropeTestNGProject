package com.cybertek.tests.day3_WebElement_intro;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLNotChange {

    /* open browser
    go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
    click on Retrieve password
    verify that url did not change */

    public static void main(String[] args) {
        //open chrome
      //WebDriver driver = WebDriverFactory.getDriver("chrome");
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();



        //go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //save url to string variable
        String expectedUrl = driver.getCurrentUrl();
        //click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        String actualUrl = driver.getCurrentUrl();

        //verify that url is not change
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.quit();

    }

     }


