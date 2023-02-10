package ru.netology;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;



public class CardDeliveryTest {

    @Test
    void shouldFillValid() {
        open("http://localhost:9999/");
        $("[data-test-id='city'] input").setValue("Уфа");
        $("[data-test-id='date'] input").setValue("22.02.2023");
        $("[data-test-id='name'] input").setValue("Иванов Иван");
        $("[data-test-id='phone'] input").setValue("+79099654321");
        $("[data-test-id='agreement']").click();
        $x("//span[text()='Забронировать']").click();
        $("[data-test-id=notification]").should(appear, Duration.ofSeconds(15));
    }
}
