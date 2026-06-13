package paraBank;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Login {
    private final Page page;
    private final Locator userName;
    private final Locator passwd;
    private final Locator loginBtn;

    public Login(Page page){
        this.page = page;
        this.userName = page.locator("[name=\"username\"]");
        this.passwd = page.locator("[name=\"password\"]");
        this.loginBtn = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In"));
    }

    public AcctOvrvw loginPage(){
        page.navigate("https://parabank.parasoft.com/");
        assertThat(page.getByText("Customer Login")).isVisible();
        try {
            userName.fill("user19");
            passwd.fill("keepthis");
            loginBtn.click();
            assertThat(page.getByText("Account Services")).isVisible();
        } catch (AssertionError e) {
            System.out.println("login failure");
        }
        return new AcctOvrvw(page);
    }
}
