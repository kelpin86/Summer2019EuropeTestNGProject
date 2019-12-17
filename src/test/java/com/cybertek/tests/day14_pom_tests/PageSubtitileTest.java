package com.cybertek.tests.day14_pom_tests;

import com.cybertek.Pages.DashboardPage;
import com.cybertek.Pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitileTest extends TestBase {
    /*Test case
    Open browser
    Login as a Driver
    Verify that page subtitle is Quick Launchpad
    Go to Activities -> Calendar Events
    verify that page subtitle is Calendar Events
    */
    @Test
    public void verifySubtitleTest() {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);
        DashboardPage dashboardPage = new DashboardPage();
        //expected title
        String expectedSubtitle = "Quick Launchpad";
        //actual title from website
        String actualSubtitle = dashboardPage.getPageSubTitle();
        //verify titles are matching
        Assert.assertEquals(actualSubtitle, expectedSubtitle, "Verify subtitles");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        CalendarEventsPage calendarEventsPage;
        calendarEventsPage = new CalendarEventsPage();

       // Assert.assertEquals(calendarEventsPage.getPageSubTitle(), "Calendar Events", "Verify subtitles");
    }


    private class CalendarEventsPage {
        public void getPageSubTitle() {
        }
    }
}


 