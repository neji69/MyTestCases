package com.github.neji69.cucumber.stepdefs.sberbank;

import com.github.neji69.Sberbank.DepositPage;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.Тогда;

import java.util.List;

public class SberbankStepsDepositPage {

    DepositPage depositPage = new DepositPage();

    @Затем("перейти на вкладку «Подобрать вклад»")
    public void clickToPickUpDeposit() {
        depositPage.checkOpenPageFromTitle("«Сбербанк» - Подбор вкладов");
        depositPage.clickTabPodobrat();
    }

    @Дано("{int} чек-бокса")
    public void checkVisibleCheckBox(int size, List<String> dataTable) {
        depositPage.CheckAmountCheckBoxAndTheirName(size, dataTable);
    }

    @Тогда("проверка, установлен чекбокс {string}")
    public void checkSelectetCheckBoxValue(String nameCheckBox) {
        depositPage.checkCheckBoxChecked(nameCheckBox);
    }

    @Тогда("{int} вкладки")
    public void CheckVisibleDeposit(int size, List<String> dataTableDepositOffers) {
        depositPage.sizeDepositOffersAndTheirName(size, dataTableDepositOffers);
    }

    @Затем("отключить чек-бокс {string} и выбрать {string} и {string}")
    public void selectedCheckBox(String nameCheckBox1, String nameCheckBox2, String nameCheckBox3) {
        depositPage.checkedCheckBox(nameCheckBox1);
        depositPage.checkedCheckBox(nameCheckBox2);
        depositPage.checkedCheckBox(nameCheckBox3);
    }

    @Тогда("проверка остался только {int} вклад")
    public void leftOnlyContributionControl(int size, List<String> dataTableDepositOffers) {
        depositPage.refreshTabDepositOffers();
        depositPage.sizeDepositOffersAndTheirName(size, dataTableDepositOffers);
    }

    @Затем("нажать на кнопку Подробнее вклада Управляй")
    public void clickOnContribButtonControl() {
        depositPage.clickButtonDetailsOffer();
    }

}
