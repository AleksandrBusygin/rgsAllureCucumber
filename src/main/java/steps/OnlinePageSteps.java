package steps;

import io.qameta.allure.Step;

public class OnlinePageSteps extends BaseSteps {

    @Step("Выбираем онлайн расчет")
    public void selectPaymentStep(){
        onlinePage.selectPayment();
    }
}
