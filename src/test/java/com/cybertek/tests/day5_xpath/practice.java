package com.cybertek.tests.day5_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
    private static long millis;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        long millis = 3000;
        Thread.sleep(millis);
        driver.navigate().to("https://apple.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();


        //driver.close();

    }
}
