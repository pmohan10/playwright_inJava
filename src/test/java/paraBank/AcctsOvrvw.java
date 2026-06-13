package paraBank;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AcctsOvrvw {
    protected Page page;

    public AcctsOvrvw(Page page){
        this.page= page;
    }

    public void acctDetails(){
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("14121")).click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Account Details"))).isVisible();
    }
}