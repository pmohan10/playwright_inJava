package orangeHRM;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Login {

    private Page page;
    private Locator userName;
    private Locator password;
    private Locator loginBtn;

    public Login(Page page){
        this.page = page;
        this.userName = page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username"));
        this.password = page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password"));
        this.loginBtn = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login"));
    }

    public void navigationPage(){
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public Dashboard doLogin(String username, String pw){
        userName.fill(username);
        password.fill(pw);
        loginBtn.click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Dashboard"))).isVisible();
        return new Dashboard(page);
    }
}

