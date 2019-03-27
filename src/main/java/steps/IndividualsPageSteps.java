package steps;

import io.qameta.allure.Step;
import pages.IndividualsPage;

public class IndividualsPageSteps {

    @Step("Выбираем конкретную услугу - {0}")
    public void selectWorldPartStep(String name){
        IndividualsPage individualsPage = new IndividualsPage();
        individualsPage.chooseWorldPart(name);
    }
}
