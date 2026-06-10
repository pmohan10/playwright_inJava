package paraBank;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AcctOvrvw {
    private final Page page;
    private final Locator openNewAcct;
    private final Locator acctsOvrvw;
    private final Locator trnfrFnds;
    private final Locator bilpay;
    private final Locator fndTrans;
    private final Locator updContactInfo;
    private final Locator reqLoan;
    private final Locator logOut;

    public AcctOvrvw(Page page) {
        this.page = page;
        this.openNewAcct = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Open New Account"));
        this.acctsOvrvw = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Accounts Overview"));
        this.trnfrFnds = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Transfer Funds"));
        this.bilpay = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Bill Pay"));
        this.fndTrans = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Find Transactions"));
        this.updContactInfo = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Update Contact Info"));
        this.reqLoan = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Request Loan"));
        this.logOut = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Log Out"));
    }

    public void goToOpenNewAcct() {
        openNewAcct.click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Open New Account"))).isVisible();
    }

    public void goToAcctOverview() {
        acctsOvrvw.click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Accounts Overview"))).isVisible();
    }

    public void goToTrnsfrFunds() {
        trnfrFnds.click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Transfer Funds"))).isVisible();
    }

    public void goToBillPay() {
        bilpay.click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Bill Payment Service"))).isVisible();
    }

    public void goToFndTrans(){
        fndTrans.click();
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Find Transactions"))).isVisible();
    }

    public void goToUpdContInfo(){
        updContactInfo.click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Update Profile"))).isVisible();
    }

    public void goToReqLoan(){
        reqLoan.click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Apply for a Loan"))).isVisible();
    }

    public void goToLogout(){
        logOut.click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Customer Login"))).isVisible();
    }
}
