package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ScenarioPage extends BaseSteps {

    @When("^выбрана услуга \"(.+)\"$")
    public void stepSelectService(String service){
        mainPage.chooseService(service);
    }

    @When("^выбрана конкретеная услуга \"(.+)\"$")
    public void selectWorldPartStep(String name){
        individualsPage.chooseWorldPart(name);
    }

    @When("^выбран онлайн расчет страхования$")
    public void selectPaymentStep(){
        onlinePage.selectPayment();
    }

    @Then("^переход на страницу заполнения данных страхователя$")
    public void compareHeaderStep(){ calculationPage.compareHeader(); }

    @When("^заполнено поле количества поездок$")
    public void selectCountOfTripsStep(){ calculationPage.chooseCountOfTrips(); }

    @When("^поле страны посещения заполнено значением\"(.+)\"$")
    public void selectCountryStep(String country) throws InterruptedException { calculationPage.chooseCountry(countryName); }

    @When("^поле даты первой поездки заполнено датой, плюс две недели от текущей$")
    public void setDepartureDateStep() throws InterruptedException { calculationPage.setDepartureDate(); }

    @When("^выбрано количество дней в сумме, палнируемых для нахождения за рубежом:\"(.+)\"$")
    public void selectCountryOfDaysStep(String countOfDays){ calculationPage.chooseCountOfDays(countOfDays); }

    @When("^поле ввода имени заполнено значением\"(.+)\"$")
    public void selectNameStep(String name) throws InterruptedException { calculationPage.selectName(name); }

    @When("^поле ввода даты рождения заполнено значением\"(.+)\"$")
    public void selectBirthDateStep(String date) throws InterruptedException { calculationPage.selectBirthDate(date); }

//    @When("^выбрана усуга \"Активный отдых или спорт\" активной(true): \"(.+)\"$")
//    @Step("Выбираем услугу \"Активный отдых или спорт\" активной(true): {0}")
//    public void selectRelaxOptionStep(boolean a){
//        calculationPage.chooseRelaxOption(a);
//    }
//    @Step("Даем согласие на обработку своих персональных данных")
//    public void consentStep(){
//        calculationPage.consent();
//    }
//    @Step("Нажимаем кнопку расчета")
//    public void calculationStep(){
//        calculationPage.calculation();
//    }



    // mainPage.chooseService("Путешествия");
//        individualsPage.chooseWorldPart("Страхование выезжающих за рубеж");
//        onlinePage.selectPayment();
//        calculationPage.compareHeader();
//        calculationPage.chooseCountOfTrips();
//        calculationPage.chooseCountry(countryName);
//        calculationPage.setDepartureDate();
//        calculationPage.chooseCountOfDays("Не более 90 дней");
//        calculationPage.selectName("PUTIN VLADIMIR");
//        calculationPage.selectBirthDate("07.10.1952");
//        calculationPage.chooseRelaxOption(true);
//        calculationPage.consent();
//        calculationPage.calculation();
//        finalPage.compareFinalResults("Многократные поездки в течение года","Шенген","PUTIN VLADIMIR","07.10.1952","(включая активный отдых)");
//}

}
