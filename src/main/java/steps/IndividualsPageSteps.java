package steps;

import io.qameta.allure.Step;

public class IndividualsPageSteps extends BaseSteps {

    @Step("Выбираем конкретную услугу - {0}")
    public void selectWorldPartStep(String name){
        individualsPage.chooseWorldPart(name);
    }
}
