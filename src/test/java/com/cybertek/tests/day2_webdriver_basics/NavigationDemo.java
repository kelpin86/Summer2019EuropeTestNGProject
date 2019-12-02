package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class NavigationDemo {
    private static long millis;

    public static void main(String[] args) throws InterruptedException {

        //setting up the browser
        WebDriverManager.chromedriver().setup();

        //selenium object
        WebDriver driver = new ChromeDriver();

        //navigate to website
        driver.get("https://wwww.google.com");

        //another way of opening website
        String url = "https://facebook.com";
        //driver.navigate().to(url:"https://facebook.com");

        //goes back to previous website
        driver.navigate().back();


        Thread.sleep(3000);
        
        //goes forward after goes back
        
        driver.navigate().forward();






    }
}
