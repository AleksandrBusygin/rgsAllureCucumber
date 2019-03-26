package util;

import io.qameta.allure.cucumberjvm.AllureCucumberJvm;
import gherkin.formatter.model.Result;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import steps.BaseSteps;

import static util.Init.getDriver;

public class AllureReporter extends AllureCucumberJvm{

    @Override
    public void result(Result result) {
        if ("failed".equals(result.getStatus())) BaseSteps.takeScreenshot();
        super.result(result);
    }



}