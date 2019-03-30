package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.*;
import util.Init;
import util.TestProperties;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSteps {

    public static Properties properties = TestProperties.getInstance().getProperties();
    protected static String baseUrl;
    protected MainPage mainPage;
    protected IndividualsPage individualsPage;
    protected OnlinePage onlinePage;
    protected CalculationPage calculationPage;
    protected FinalPage finalPage;

    @Before
    public void startScenario() {
        switch (properties.getProperty("browser2")) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", properties.getProperty("webdriver.gecko.driver"));
                Init.setDriver(new FirefoxDriver());
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
                Init.setDriver(new ChromeDriver());
                break;
            case "explorer":
                System.setProperty("webdriver.ie.driver", properties.getProperty("webdriver.ie.driver"));
                Init.setDriver(new InternetExplorerDriver());
                break;
        }
        baseUrl = properties.getProperty("app.url");
        Init.getDriver().get(baseUrl);
        Init.getDriver().manage().window().maximize();
        Init.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        mainPage = new MainPage();
        individualsPage = new IndividualsPage();
        onlinePage = new OnlinePage();
        calculationPage = new CalculationPage();
        finalPage = new FinalPage();
    }

    @After
    public void close(){
        Init.getDriver().close();
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) Init.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}