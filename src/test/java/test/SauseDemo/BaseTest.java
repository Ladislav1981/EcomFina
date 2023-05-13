package test.SauseDemo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    @BeforeMethod   //Method running before test//
    public void setupTest() {
        System.out.println("Open browser.....");
        playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
                        .setChannel("chrome")
        );

        page = browser.newPage();
    }

    @AfterMethod // method running after test//

    public void tearDown() {
        System.out.println("Clossing Browser.....");
        page.waitForTimeout(2000);
        page.close();
        browser.close();
        playwright.close();

    }


}
