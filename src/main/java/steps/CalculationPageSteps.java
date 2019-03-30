package steps;

import io.qameta.allure.Step;
import pages.CalculationPage;

public class CalculationPageSteps {

    @Step("Проверяем наличие заголовка страницы:\"Страхование выезжающих за рубеж\"")
    public void compareHeaderStep(){
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.compareHeader();
    }
    @Step("Выбираем пункт: \"Несколько в течение года\"")
    public void selectCountOfTripsStep(){
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.chooseCountOfTrips();
    }
    @Step("Выбираем страну посещения в зоне шенгенского соглашения - {0}")
    public void selectCountryStep(String country) throws InterruptedException {
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.chooseCountry(country);
    }
    @Step("Задаем дату первой поездки, плюс две недели от нынешней")
    public void setDepartureDateStep() throws InterruptedException {
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.setDepartureDate();
    }
    @Step("Выбираем количество дней в сумме, планируемых для нахождения за рубежом: {0}")
    public void selectCountryOfDaysStep(String countOfDays){
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.chooseCountOfDays(countOfDays);
    }
    @Step("Заполняем поле ввода данных именем: {0}")
    public void selectNameStep(String name) throws InterruptedException {
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.selectName(name);
    }
    @Step("Заполняем поле ввода данных датой рождения: {0}")
    public void selectBirthDateStep(String date) throws InterruptedException {
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.selectBirthDate(date);

    }
    @Step("Выбираем услугу \"Активный отдых или спорт\" активной(true): {0}")
    public void selectRelaxOptionStep(String a){
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.chooseRelaxOption(a);
    }
    @Step("Даем согласие на обработку своих персональных данных")
    public void consentStep(){
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.consent();
    }
    @Step("Нажимаем кнопку расчета")
    public void calculationStep(){
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.calculation();
    }
}
