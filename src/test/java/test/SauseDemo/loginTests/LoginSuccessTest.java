package test.SauseDemo.loginTests;

import org.testng.annotations.Test;
import pages.LoginPage;
import test.SauseDemo.BaseTest;

public class LoginSuccessTest extends BaseTest {

    @Test
    public void test_o1_standartUserlogin() {


        page.navigate("https://www.saucedemo.com/");


        LoginPage loginPage = new LoginPage(page);

        loginPage.assertThatPageUrl("https://www.saucedemo.com/");//playwright//
        // loginPage.assertEqualsPageUrl("https://www.saucedemo.com/");//testNG//

        loginPage.fillLoginForm("standard_user", "secret_sauce");


    }


    @Test
    public void test_o2_locked_out_user() {


        page.navigate("https://www.saucedemo.com/");


        LoginPage loginPage = new LoginPage(page);

        loginPage.assertThatPageUrl("https://www.saucedemo.com/");//playwright//
        // loginPage.assertEqualsPageUrl("https://www.saucedemo.com/");//testNG//

        loginPage.fillLoginForm("locked_out_user", "secret_sauce");


    }


    @Test
    public void test_o3_problem_user() {


        page.navigate("https://www.saucedemo.com/");


        LoginPage loginPage = new LoginPage(page);

        loginPage.assertThatPageUrl("https://www.saucedemo.com/");//playwright//
        // loginPage.assertEqualsPageUrl("https://www.saucedemo.com/");//testNG//

        loginPage.fillLoginForm("problem_user", "secret_sauce");


    }

    @Test
    public void test_o4_performance_glitch_user() {


        page.navigate("https://www.saucedemo.com/");


        LoginPage loginPage = new LoginPage(page);

        loginPage.assertThatPageUrl("https://www.saucedemo.com/");//playwright//
        // loginPage.assertEqualsPageUrl("https://www.saucedemo.com/");//testNG//

        loginPage.fillLoginForm("performance_glitch_user", "secret_sauce");


    }


}
