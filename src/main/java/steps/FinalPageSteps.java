package steps;

import io.qameta.allure.Step;

public class FinalPageSteps extends BaseSteps {

    @Step("Ждем загрузки финальной страницы и скролим к итоговым данным")
    public void waitingForFinalPageStep(){
        finalPage.waitingForFinalPage();
    }

    @Step("Проверяем итоговые значения с теми, что мы вводили: условия страхования - {0}; территория действия - {1}; полное имя застрахованного - {2}; дата рождения застрахованного - {3}; имеется ли опция активного отдыха - {4}")
    public void compareFinalResultsPage(String reasonOfInsurance, String partOfWorldToVisit, String fullName, String dateOfBirth, String activeSportOption) {
        finalPage.compareFinalResults(reasonOfInsurance, partOfWorldToVisit, fullName, dateOfBirth, activeSportOption);
    }
}
