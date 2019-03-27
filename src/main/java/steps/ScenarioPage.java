package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;


public class ScenarioPage {

    @When("^выбрана услуга \"(.+)\"$")
    public void stepSelectService(String service){
        MainPage mainPage = new MainPage();
        mainPage.chooseService(service);
    }

    @When("^выбрана конкретеная услуга \"(.+)\"$")
    public void selectWorldPartStep(String name){
        IndividualsPage individualsPage = new IndividualsPage();
        individualsPage.chooseWorldPart(name);
    }

    @When("^выбран онлайн расчет страхования$")
    public void selectPaymentStep(){
        OnlinePage onlinePage = new OnlinePage();
        onlinePage.selectPayment();
    }

    @Then("^переход на страницу заполнения данных страхователя$")
    public void compareHeaderStep(){
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.compareHeader();
    }

    @When("^заполнено поле количества поездок$")
    public void selectCountOfTripsStep(){
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.chooseCountOfTrips();
    }

    @When("^поле страны посещения заполнено значением\"(.+)\"$")
    public void selectCountryStep(String country) throws InterruptedException {
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.chooseCountry(country);
    }

    @When("^поле даты первой поездки заполнено датой, плюс две недели от текущей$")
    public void setDepartureDateStep() throws InterruptedException {
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.setDepartureDate();
    }

    @When("^выбрано количество дней в сумме, палнируемых для нахождения за рубежом:\"(.+)\"$")
    public void selectCountryOfDaysStep(String countOfDays){
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.chooseCountOfDays(countOfDays);
    }

    @When("^поле ввода имени заполнено значением \"(.+)\"$")
    public void selectNameStep(String name) throws InterruptedException {
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.selectName(name);
    }

    @When("^поле ввода даты рождения заполнено значением \"(.+)\"$")
    public void selectBirthDateStep(String date) throws InterruptedException {
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.selectBirthDate(date);
    }

    @When("^выбрана усуга \"Активный отдых или спорт\" активной(true): \"(.+)\"$")
    public void selectRelaxOptionStep(boolean a){
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.chooseRelaxOption(a);
    }

    @When("^дано согласие на обработку персональных данных$")
    public void consentStep(){
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.consent();
    }

    @When("^нажата кнопка расчета$")
    public void calculationStep(){
        CalculationPage calculationPage = new CalculationPage();
        calculationPage.calculation();
    }

    @Then("^переход на страницу с итоговыми данными и ценой страховки$")
    public void waitingForFinalPageStep(){
        FinalPage finalPage = new FinalPage();
        finalPage.waitingForFinalPage();
    }

    @Then("^сравниваем полученные данные с теми, что вводили на странице заполнения данных:\"(.+)\",\"(.+)\",\"(.+)\",\"(.+)\",\"(.+)\"$")
    public void compareFinalResultsPage(String reasonOfInsurance, String partOfWorldToVisit, String fullName, String dateOfBirth, String activeSportOption) {
        FinalPage finalPage = new FinalPage();
        finalPage.compareFinalResults(reasonOfInsurance, partOfWorldToVisit, fullName, dateOfBirth, activeSportOption);
    }

}
