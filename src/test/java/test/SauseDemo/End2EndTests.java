package test.SauseDemo;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class End2EndTests extends BaseTest {

    @Test
    public void test_o1_buyItemsTest() {


        page.navigate("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(page);
        loginPage.assertThatPageUrl("https://www.saucedemo.com/");//playwright//
        // loginPage.assertEqualsPageUrl("https://www.saucedemo.com/");//testNG//
        loginPage.fillLoginForm("standard_user", "secret_sauce");

        ProductPage productPage = new ProductPage(page);
        productPage.assertThatPageUrl("https://www.saucedemo.com/inventory.html");
        productPage.validateTitle("Products");
        productPage.sortItems("Price (high to low)");
        productPage.sortItems("Name (A to Z)");
        productPage.chooseItem("Sauce Labs Backpack");
        productPage.validateAddedItems("1");
        productPage.chooseItem("Sauce Labs Bike Light");
        productPage.validateAddedItems("2");

    }


}
