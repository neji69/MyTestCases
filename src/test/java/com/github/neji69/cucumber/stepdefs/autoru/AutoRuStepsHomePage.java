package com.github.neji69.cucumber.stepdefs.autoru;

import com.github.neji69.AutoRu.HomePage;
import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.Тогда;

public class AutoRuStepsHomePage {

    HomePage homePage = new HomePage();

    @Тогда("закрыть всплывающее окно")
    public void closePopUp() {
        homePage.closePopUp();
    }

    @Тогда("проверить название страницы содержит текст {string}")
    public void checkTextOpenPage(String title) {
        homePage.checkOpenPageFromTitle(title);
    }

    @Затем("сохранить количество объявлений выбранной {word} марки автомобиля и совершить переход кликнув по ней")
    public void saveAmountAndGoToTheModelPage(String carMark) {
        homePage.parseAmountCars(carMark);
    }
}
