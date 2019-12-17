package com.cybertek.tests.day13_properties_driver_testbase;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {
    @Test
    public void test(){

        String s1 = Singleton.getInstance();
        //100 lines of code
        String s2 = Singleton.getInstance();
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
    @Test
    public void test2(){
        WebDriver driver = Driver.get();

        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().navigate().refresh();
    }
    @Test
    public void test3() throws InterruptedException {
        Driver.get().get("http://amazon.com");
        Thread.sleep(3000);
        Driver.closeDriver();
    }
}
