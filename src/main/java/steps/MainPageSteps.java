package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainPageSteps {

    @Step("Выбираем раздел услуг - {0}")
    public void stepSelectService(String service){
        MainPage mainPage = new MainPage();
        mainPage.chooseService(service);
    }
}
