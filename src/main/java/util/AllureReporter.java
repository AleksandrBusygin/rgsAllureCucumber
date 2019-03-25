package util;

import io.qameta.allure.Allure;
import static util.Init.getDriver;


public class AllureReporter extends ru.yandex.qameta.allure.cucumberjvm.AllureReporter{

    @Override
    public void result(Result result) {
        if ("failed".equals(result.getStatus())) takeScreenshot(result);
        super.result(result);
    }

    public void takeScreenshot(Result step) {
        if (getDriver() != null) {
            Allure.LIFECYCLE.fire(new MakeAttachmentEvent(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES),
                    "Скриншот в момент ошибки", "image/png"));
        }
    }
}