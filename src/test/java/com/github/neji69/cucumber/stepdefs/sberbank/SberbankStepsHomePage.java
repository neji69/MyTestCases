package com.github.neji69.cucumber.stepdefs.sberbank;

import com.github.neji69.Sberbank.HomePage;
import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.Тогда;

public class SberbankStepsHomePage {

    HomePage homePage = new HomePage();

    @Тогда("проверка перехода, название страницы {string}")
    public void checkOpenPageFromTitle(String title) {
        homePage.checkOpenPageFromTitle(title);
    }

    @Затем("перейти через верхнее меню во {string}")
    public void goToMenuAndClickDeposit(String item) {
        homePage.chooseMenuItem(item);
        homePage.chooseSubMenuItem(item);
    }
}
