package orangeHRM;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Dashboard {
    private Page page;
    private final Locator assignLeave;

    public Dashboard(Page page){
        this.page = page;
        this.assignLeave = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Assign Leave"));
    }

    public void clkAssignLeave(){
        assignLeave.click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Leave").setExact(true))).isVisible();

    }
}
