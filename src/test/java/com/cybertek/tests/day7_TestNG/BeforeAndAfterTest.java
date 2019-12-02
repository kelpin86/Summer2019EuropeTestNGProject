package com.cybertek.tests.day7_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class BeforeAndAfterTest {

    @Test
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test
    public void test2(){
        System.out.println("This is test 2");
    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public  void tearDown(){
        System.out.println("After Method");
    }

}
