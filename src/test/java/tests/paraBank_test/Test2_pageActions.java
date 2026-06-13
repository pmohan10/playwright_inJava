package tests.paraBank_test;

import org.testng.annotations.Test;
import paraBank.AcctServices;
import paraBank.BaseTest;
import paraBank.Login;
import paraBank.AcctsOvrvw;
import paraBank.TrnsfrFunds;

public class Test2_pageActions extends BaseTest{
    Login login;
    AcctServices acctServices;
    AcctsOvrvw acctsOvrvw;
    TrnsfrFunds trnsfrFunds;

    @Test
    public void acctDetailsTest() {

        login = new Login(page);
        acctServices = login.loginPage();
        acctsOvrvw = acctServices.goToAcctOverview();
        acctsOvrvw.acctDetails();
    }

    @Test
    public void trnsfrFundsTest(){
        new Login(page).loginPage().goToTrnsfrFunds().amntTransfer(50);
    }
}
