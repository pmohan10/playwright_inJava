package tests;

import base.BaseTest;
import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class NewTest extends BaseTest {

@Test
    public void searchTest() {
        page.navigate("https://www.amazon.com/");
        Locator searchBox = page.getByPlaceholder("Search Amazon");
        searchBox.fill("shoes");
        page.locator("#nav-search-submit-button").click();
    }
}
