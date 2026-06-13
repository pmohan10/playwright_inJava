package tests.paraBank_test;

import org.testng.annotations.Test;
import paraBank.AcctServices;
import paraBank.BaseTest;
import paraBank.Login;
import paraBank.AcctsOvrvw;
import paraBank.TrnsfrFunds;

public class Test1_basic extends BaseTest {
    Login login;
    AcctServices acctServices;
    AcctsOvrvw acctsOvrvw;
    TrnsfrFunds trnsfrFunds;


    @Test
    public void startTest() {
        login = new Login(page);
        acctServices = login.loginPage();
    }

    @Test
    public void linksTest() {
        login = new Login(page);
        acctServices = login.loginPage();
        acctServices.goToOpenNewAcct();
        acctServices.goToAcctOverview();
        acctServices.goToBillPay();
        acctServices.goToReqLoan();
    }
}
