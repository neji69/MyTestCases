package com.github.neji69.cucumber.stepdefs.spbbank;

import com.github.neji69.SpbBank.OverviewPage;
import io.cucumber.java.ru.Затем;

public class SpbBankStepOverviewPage {

    OverviewPage overviewPage = new OverviewPage();

    @Затем("проверяем что открылась страница Обзор")
    public void checkOverviewPageOpening() {
        overviewPage.checkPageOpeningByTitle();
    }

    @Затем("проверяем что на странице отобразился блок Финансовая свобода и рядом отображаеться сумма в нужном формате")
    public void checkValueContentFinanceFree() {
        overviewPage.checkValueContentFinanceFree();
    }

    @Затем("наводим курсор на сумму и проверяем появление строки мои средства с суммой в нужном формате")
    public void moveToElementAndCheckValueContentFinanceFree() {
        overviewPage.moveToElementAndCheckValueContentFinanceFree();
    }

}
