package steps;

import io.qameta.allure.Step;
import pages.OnlinePage;

public class OnlinePageSteps {

    @Step("Выбираем онлайн расчет")
    public void selectPaymentStep(){
        OnlinePage onlinePage = new OnlinePage();
        onlinePage.selectPayment();
    }
}
