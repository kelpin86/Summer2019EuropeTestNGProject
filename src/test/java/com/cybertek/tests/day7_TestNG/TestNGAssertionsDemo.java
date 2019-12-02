package com.cybertek.tests.day7_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @Test
    public void test1(){

        System.out.println("First Assertion");
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        System.out.println("Second Assertion");
        Assert.assertEquals("Title","title");
    }
    @Test
    public void test3(){
        Assert.assertNotEquals("one","two","one is no equals to two");

    }
    @Test
    public void test4(){

    }
}
