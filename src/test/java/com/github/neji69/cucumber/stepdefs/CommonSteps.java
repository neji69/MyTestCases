package com.github.neji69.cucumber.stepdefs;

import io.cucumber.java.ru.Дано;

import static com.codeborne.selenide.Selenide.open;

public class CommonSteps {

    @Дано("пользователь входит на сайт {string}")
    public void openUrl(String url) {
        open(url);
    }

}
