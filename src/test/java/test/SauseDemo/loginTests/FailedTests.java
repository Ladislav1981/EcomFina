package test.SauseDemo.loginTests;

import org.testng.annotations.Test;
import pages.LoginPage;
import test.SauseDemo.BaseTest;

public class FailedTests extends BaseTest {

    @Test
    public void test_o1_failedUsername() {


        page.navigate("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(page);
        loginPage.assertThatPageUrl("https://www.saucedemo.com/");//playwright//
        // loginPage.assertEqualsPageUrl("https://www.saucedemo.com/");//testNG//
        loginPage.fillLoginForm("Ladislav", "secret_sauce");
        loginPage.validateLoginErrorMessage("Epic sadface: Username and password do not match any user in this service");
    }


    @Test
    public void test_o2_failedpassword() {


        page.navigate("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(page);
        loginPage.assertThatPageUrl("https://www.saucedemo.com/");//playwright//
        // loginPage.assertEqualsPageUrl("https://www.saucedemo.com/");//testNG//
        loginPage.fillLoginForm("standard_user", "1234567");
        loginPage.validateLoginErrorMessage("Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void test_o3_emptyUsernamefield() {
        page.navigate("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(page);
        loginPage.assertThatPageUrl("https://www.saucedemo.com/");//playwright//
        // loginPage.assertEqualsPageUrl("https://www.saucedemo.com/");//testNG//
        loginPage.fillLoginForm("", "secret_sauce");
        loginPage.validateLoginErrorMessage("Epic sadface: Username is required");
    }


    @Test
    public void test_o4_emptyPasswordfield() {
        page.navigate("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(page);
        loginPage.assertThatPageUrl("https://www.saucedemo.com/");//playwright//
        // loginPage.assertEqualsPageUrl("https://www.saucedemo.com/");//testNG//
        loginPage.fillLoginForm("standard_user", "");
        loginPage.validateLoginErrorMessage("Epic sadface: Password is required");
    }


}
