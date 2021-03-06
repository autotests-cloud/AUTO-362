package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Нельзя запустить поиск билетов без указании даты вылета")
    void generatedTest() {
        step("Подменить куку \"Открыть booking.com\" на выключена", () -> {
            step("// todo: just add selenium action");
        });

        step("Открыть 'https://aviasales.ru/'", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести в поле \"Откуда\" - Москва", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести в поле \"Куда\" - Санкт-Петербург", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать кнопку \"Найти билеты\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить что над полем \"Когда\" отображается сообщение об ошибке", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://aviasales.ru/'", () ->
            open("https://aviasales.ru/"));

        step("Page title should have text 'Купить авиабилеты дешево онлайн | Авиасейлс - поиск самых дешевых билетов на самолет'", () -> {
            String expectedTitle = "Купить авиабилеты дешево онлайн | Авиасейлс - поиск самых дешевых билетов на самолет";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://aviasales.ru/'", () ->
            open("https://aviasales.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}