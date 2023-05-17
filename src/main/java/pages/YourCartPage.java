package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class YourCartPage extends BasePage {

    private final Locator shoppingCartElement = page.locator("[class=\"shopping_cart_link\"]");
    private final Locator checkoutElement = page.locator("#checkout");
    private final Locator pageYourCartTitleElement = page.locator("[class=\"title\"]");

    Locator firstNameElement = page.getByPlaceholder("First Name");
    Locator lastNameElement = page.getByPlaceholder("Last Name");
    Locator zipPostalElement = page.getByPlaceholder("Zip/Postal Code");
    private final Locator continueElement = page.locator("#continue");

    private final Locator finishElement = page.locator("#finish");

    private final Locator clickburgerDropMenu = page.locator("#react-burger-menu-btn");
    private final Locator clicklogoutlink = page.locator("#logout_sidebar_link");

    public YourCartPage(Page page) {
        super(page);
    }

    public void clickOnCart(String element) {
        this.clickElement(shoppingCartElement);
    }

    public void validateCartTitle(String expectedTitle) {
        this.checkElementTitle(pageYourCartTitleElement, expectedTitle);
    }

    public void clickOncheckout(String element) {
        this.clickElement(checkoutElement);
    }


    public void fillForm(String Firstname, String LastName, String Zip) {
        this.typeText(firstNameElement, Firstname);
        this.typeText(lastNameElement, LastName);
        this.typeText(zipPostalElement, Zip);
    }

    public void clickOncontinue(String element) {
        this.clickElement(continueElement);
    }

    public void clickOnfinish(String element) {
        this.clickElement(finishElement);
    }

    public void clickLogout(String element) {
        this.clickElement(clickburgerDropMenu);
    }

    public void clickLogoutbutton(String element) {
        this.clickElement(clicklogoutlink);
    }
}


