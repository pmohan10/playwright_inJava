package tests;

import base.BaseTest;
import orangeHRM.Login;
import orangeHRM.Dashboard;
import org.testng.annotations.Test;

public class OrangeHRM_test extends BaseTest {

    Login login;
    Dashboard dashboard;

    @Test
    public void startTest() {

        login = new Login(page);
        login.navigationPage();
        login.doLogin("Admin", "admin123");
//        dashboard.clkAssignLeave();
//        page.pause();
    }


    @Test
    public void assignLeaveTest() {

        login = new Login(page);
        login.navigationPage();
        dashboard = login.doLogin("Admin", "admin123");
        dashboard.clkAssignLeave();
//        page.pause();
    }

}
