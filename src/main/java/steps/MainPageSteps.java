package steps;

import io.qameta.allure.Step;

public class MainPageSteps extends  BaseSteps{

    @Step("Выбираем раздел услуг - {0}")
    public void stepSelectService(String service){
        mainPage.chooseService(service);
    }
}
