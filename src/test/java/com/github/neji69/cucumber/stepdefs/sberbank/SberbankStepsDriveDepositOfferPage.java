package com.github.neji69.cucumber.stepdefs.sberbank;

import com.github.neji69.Sberbank.DriveDepositOfferPage;
import io.cucumber.java.ru.Тогда;

public class SberbankStepsDriveDepositOfferPage {

    DriveDepositOfferPage driveDepositOfferPage = new DriveDepositOfferPage();

    @Тогда("проверка, в новом окне открылась вкладка {string}")
    public void checkInNewWindowOpenedTab(String title) {
        driveDepositOfferPage.checkOpenPageFromTitle(title);
    }

    @Тогда("на странице отображается надпись {string}")
    public void onPageIsDisplayed(String text) {
        driveDepositOfferPage.checkH2Text(text);
    }

}
