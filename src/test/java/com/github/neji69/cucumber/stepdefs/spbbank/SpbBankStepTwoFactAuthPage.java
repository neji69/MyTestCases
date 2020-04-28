package com.github.neji69.cucumber.stepdefs.spbbank;

import com.github.neji69.SpbBank.TwoFactAuth;
import io.cucumber.java.ru.Затем;

public class SpbBankStepTwoFactAuthPage {

    //Данные для теста (смс для авторизации)
    private static final String SMS_CODE = "0000";

    TwoFactAuth twoFactAuth = new TwoFactAuth();

    @Затем("открывается страница двухфакторной авторизации где пользователь вводит смс код и кнопку подтверждения")
    public void userSmsAuthorization() {
        twoFactAuth.smsAuth(SMS_CODE);
    }

}
