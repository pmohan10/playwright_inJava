package tests.paraBank_test;

import org.testng.annotations.Test;
import paraBank.AcctOvrvw;
import paraBank.BaseTest;
import paraBank.Login;

public class Test1 extends BaseTest {
    Login login ;
    AcctOvrvw acctoverview;

    @Test
    public void startTest(){
        login = new Login(page);
        acctoverview = login.loginPage();
    }

//    @Test
    public void navTest() {
        login = new Login(page);
        acctoverview = login.loginPage();
        acctoverview.goToOpenNewAcct();
        acctoverview.goToAcctOverview();
    }
}
