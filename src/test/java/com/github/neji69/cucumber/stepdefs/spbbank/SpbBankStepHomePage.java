package com.github.neji69.cucumber.stepdefs.spbbank;

import com.github.neji69.SpbBank.Home;
import io.cucumber.java.ru.Тогда;

public class SpbBankStepHomePage {

    Home home = new Home();

    @Тогда("открывается домашняя страница где пользователь кликает по кнопке Обзор")
    public void openHomePageAndClickButtonOverview() {
        home.buttonOverviewClick();
    }

}
