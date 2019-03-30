package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;


public class ScenarioPage {

    @When("^выбрана услуга \"(.+)\"$")
    public void stepSelectService(String service){
        MainPageSteps mainPage = new MainPageSteps();
        mainPage.stepSelectService(service);
    }

    @When("^выбрана конкретеная услуга \"(.+)\"$")
    public void selectWorldPartStep(String name){
        IndividualsPageSteps individualsPage = new IndividualsPageSteps();
        individualsPage.selectWorldPartStep(name);
    }

    @When("^выбран онлайн расчет страхования$")
    public void selectPaymentStep(){
        OnlinePageSteps onlinePage = new OnlinePageSteps();
        onlinePage.selectPaymentStep();
    }

    @Then("^переход на страницу заполнения данных страхователя$")
    public void compareHeaderStep(){
        CalculationPageSteps calculationPage = new CalculationPageSteps();
        calculationPage.compareHeaderStep();
    }

    @When("^заполнено поле количества поездок$")
    public void selectCountOfTripsStep(){
        CalculationPageSteps calculationPage = new CalculationPageSteps();
        calculationPage.selectCountOfTripsStep();
    }

    @When("^поле страны посещения заполнено значением \"(.+)\"$")
    public void selectCountryStep(String country) throws InterruptedException {
        CalculationPageSteps calculationPage = new CalculationPageSteps();
        calculationPage.selectCountryStep(country);
    }

    @When("^поле даты первой поездки заполнено датой, плюс две недели от текущей$")
    public void setDepartureDateStep() throws InterruptedException {
        CalculationPageSteps calculationPage = new CalculationPageSteps();
        calculationPage.setDepartureDateStep();
    }

    @When("^выбрано количество дней в сумме, палнируемых для нахождения за рубежом:\"(.+)\"$")
    public void selectCountryOfDaysStep(String countOfDays){
        CalculationPageSteps calculationPage = new CalculationPageSteps();
        calculationPage.selectCountryOfDaysStep(countOfDays);
    }

    @When("^поле ввода имени заполнено значением \"(.+)\"$")
    public void selectNameStep(String name) throws InterruptedException {
        CalculationPageSteps calculationPage = new CalculationPageSteps();
        calculationPage.selectNameStep(name);
    }

    @When("^поле ввода даты рождения заполнено значением \"(.+)\"$")
    public void selectBirthDateStep(String date) throws InterruptedException {
        CalculationPageSteps calculationPage = new CalculationPageSteps();
        calculationPage.selectBirthDateStep(date);
    }

    @When("^выбрана усуга дополнительная услуга активного отдыха \"(.+)\"$")
    public void selectRelaxOptionStep(String choice){
        CalculationPageSteps calculationPage = new CalculationPageSteps();
        calculationPage.selectRelaxOptionStep(choice);
    }

    @When("^дано согласие на обработку персональных данных$")
    public void consentStep(){
        CalculationPageSteps calculationPageSteps = new CalculationPageSteps();
        calculationPageSteps.consentStep();
    }

    @When("^нажата кнопка расчета$")
    public void calculationStep(){
        CalculationPageSteps calculationPage = new CalculationPageSteps();
        calculationPage.calculationStep();
    }

    @Then("^переход на страницу с итоговыми данными и ценой страховки$")
    public void waitingForFinalPageStep(){
        FinalPageSteps finalPage = new FinalPageSteps();
        finalPage.waitingForFinalPageStep();
    }

    @Then("^сравниваем полученные данные с теми, что вводили на странице заполнения данных:\"(.+)\",\"(.+)\",\"(.+)\",\"(.+)\",\"(.+)\"$")
    public void compareFinalResultsPage(String reasonOfInsurance, String partOfWorldToVisit, String fullName, String dateOfBirth, String activeSportOption) {
        FinalPageSteps finalPage = new FinalPageSteps();
        finalPage.compareFinalResultsPage(reasonOfInsurance, partOfWorldToVisit, fullName, dateOfBirth, activeSportOption);
    }
}
