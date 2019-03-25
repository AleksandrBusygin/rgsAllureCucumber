package steps;

import io.qameta.allure.Step;

public class CalculationPageSteps extends BaseSteps {

    @Step("Проверяем наличие заголовка страницы:\"Страхование выезжающих за рубеж\"")
    public void compareHeaderStep(){
        calculationPage.compareHeader();
    }
    @Step("Выбираем пункт: \"Несколько в течение года\"")
    public void selectCountOfTripsStep(){
        calculationPage.chooseCountOfTrips();
    }
    @Step("Выбираем страну посещения в зоне шенгенского соглашения - {0}")
    public void selectCountryStep(String country) throws InterruptedException {
        calculationPage.chooseCountry(countryName);
    }
    @Step("Задаем дату первой поездки, плюс две недели от нынешней")
    public void setDepartureDateStep() throws InterruptedException {
        calculationPage.setDepartureDate();
    }
    @Step("Выбираем количество дней в сумме, планируемых для нахождения за рубежом: {0}")
    public void selectCountryOfDaysStep(String countOfDays){
        calculationPage.chooseCountOfDays(countOfDays);
//        Не более 90 дней
    }
    @Step("Заполняем поле ввода данных именем: {0}")
    public void selectNameStep(String name) throws InterruptedException {
        calculationPage.selectName(name);
//        "PUTIN VLADIMIR"
    }
    @Step("Заполняем поле ввода данных датой рождения: {0}")
    public void selectBirthDateStep(String date) throws InterruptedException {
        calculationPage.selectBirthDate(date);
//        "PUTIN VLADIMIR"
    }
    @Step("Выбираем услугу \"Активный отдых или спорт\" активной(true): {0}")
    public void selectRelaxOptionStep(boolean a){
            calculationPage.chooseRelaxOption(a);
    }
    @Step("Даем согласие на обработку своих персональных данных")
    public void consentStep(){
        calculationPage.consent();
    }
    @Step("Нажимаем кнопку расчета")
    public void calculationStep(){
        calculationPage.calculation();
    }
}
