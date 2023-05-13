package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.testng.Assert;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public abstract class BasePage {

    Page page;

    public BasePage(Page page) {  //Создали конструктор BasePage при помощи alt+insert//
        this.page = page;
    }


    protected void clickElement(Locator element) {  // пишем функцию которая будем делать нажатие на элемент//
        element.click();
        System.out.println("Clicking on" + element + "......");

    }

    protected void typeText(Locator element, String textToType) {
        element.clear(); //для того чтобы использовать TYPE нужно стереть предедущую строку если есть
        element.type(textToType, new Locator.TypeOptions().setDelay(50)); // вызов функции+опции определить время печатания каждого символа//

    }

    protected void fillText(Locator element, String textToFill) {//не печатание текста а приклеевание текста//

        element.fill(textToFill);
    }


    public void assertThatPageUrl(String expectedUrl) {  //валидация URL аддресса Playwright//
        assertThat(page).hasURL(expectedUrl);

    }


    public void assertEqualsPageUrl(String expectedUrl) {  //валидация URL аддресса TestNG//
        Assert.assertEquals(page.url(), expectedUrl);
    }

    public void checkElementTitle(Locator element, String expectedTitle) { //валидация заголовка//
        assertThat(element).hasText(expectedTitle);

    }

    public void selectDropdown(Locator element, String value) {  // вызов опций поиска товаров//
        element.selectOption(value);
        page.waitForTimeout(2000);
    }

}
