package com.cybertek.Pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {
    //no ned to explicitly write constructors, because it will use its parents constructor.
    public DashboardPage() {
        PageFactory.initElements(Driver.get(), this);
    }
}

