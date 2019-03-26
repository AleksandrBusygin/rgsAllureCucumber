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

    @When("^поле ввода имени заполнено значением \"(.+)\"$")
    public void selectNameStep(String name) throws InterruptedException { calculationPage.selectName(name); }

    @When("^поле ввода даты рождения заполнено значением \"(.+)\"$")
    public void selectBirthDateStep(String date) throws InterruptedException { calculationPage.selectBirthDate(date); }

    @When("^выбрана усуга \"Активный отдых или спорт\" активной(true): \"(.+)\"$")
    public void selectRelaxOptionStep(boolean a){ calculationPage.chooseRelaxOption(a); }

    @When("^дано согласие на обработку персональных данных$")
    public void consentStep(){ calculationPage.consent(); }

    @When("^нажата кнопка расчета$")
    public void calculationStep(){ calculationPage.calculation();}

    @Then("^переход на страницу с итоговыми данными и ценой страховки$")
    public void waitingForFinalPageStep(){ finalPage.waitingForFinalPage();}

    @Then("^сравниваем полученные данные с теми, что вводили на странице заполнения данных:\"(.+)\",\"(.+)\",\"(.+)\",\"(.+)\",\"(.+)\"$")
    public void compareFinalResultsPage(String reasonOfInsurance, String partOfWorldToVisit, String fullName, String dateOfBirth, String activeSportOption)
    {  finalPage.compareFinalResults(reasonOfInsurance, partOfWorldToVisit, fullName, dateOfBirth, activeSportOption); }

}
