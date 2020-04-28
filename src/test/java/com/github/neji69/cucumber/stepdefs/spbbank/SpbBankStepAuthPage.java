package com.github.neji69.cucumber.stepdefs.spbbank;

import com.github.neji69.SpbBank.BspbRuAuth;
import io.cucumber.java.ru.Тогда;

public class SpbBankStepAuthPage {

    private static final String LOGIN = "demo";
    private static final String PASSWORD = "demo";

    BspbRuAuth bspbRuAuth = new BspbRuAuth();

    @Тогда("открывается страница Авторизации и пользователь авторизируется используя логин и пароль")
    public void userAuthorization() {
        bspbRuAuth.authorize(LOGIN, PASSWORD);
    }

}
