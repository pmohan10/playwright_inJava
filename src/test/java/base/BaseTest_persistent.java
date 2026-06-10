package base;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import javax.naming.Context;

public class BaseTest_persistent {

    static void main() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context = browser.newContext();

        Page page = context.newPage();
        page.navigate("https://automationexercise.com");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Products")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("WOMEN")).click();


//        page.pause();

//        page.navigate("https://parabank.parasoft.com");
//        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("about")).nth(1).click();


    }

}
