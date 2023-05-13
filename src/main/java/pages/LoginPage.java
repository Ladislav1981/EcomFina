package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage extends BasePage {

    Locator userNameElement = page.getByPlaceholder("UserName");
    Locator passwordElement = page.getByPlaceholder("Password");

    Locator loginButtonElement = page.getByText("Login");
    Locator errorMessageElement = page.locator("[data-test=\"error\"]");


    public LoginPage(Page page) {
        super(page);
    } //Используем функции страницы BasePage+нажимаем чтобы вывести конструктор на эту страницу//


    public void fillLoginForm(String username, String password) { //Функция которая будет авторизировать//
        this.typeText(userNameElement, username);
        this.fillText(passwordElement, password);
        this.clickElement(loginButtonElement);
    }

    public void validateLoginErrorMessage(String expectedErrorMessage) {
        this.checkElementTitle(errorMessageElement, expectedErrorMessage);

    }
}
