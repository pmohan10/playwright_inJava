package paraBank;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TrnsfrFunds {
    protected Page page;

    public TrnsfrFunds(Page page){
        this.page=page;
    }

    public void amntTransfer(int n){
        page.locator("[name=\"input\"]").fill(String.valueOf(n));
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Transfer")).click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Transfer Complete!"))).isVisible();
    }
}
