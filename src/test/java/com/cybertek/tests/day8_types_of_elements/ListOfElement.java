package com.cybertek.tests.day8_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import net.bytebuddy.description.type.TypeList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class ListOfElement {
    @Test
    public void test1() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("buttons.size() = " + buttons.size());
        //verify that you got 6 webelements
        Assert.assertEquals(buttons.size(), 6, "Verify we got 6 buttons");
        for (WebElement button : buttons) {
            System.out.println(button.getText());
        }
    }





}






