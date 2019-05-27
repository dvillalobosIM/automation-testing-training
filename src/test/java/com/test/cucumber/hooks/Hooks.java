package com.test.cucumber.hooks;

import com.test.cucumber.driver.DriverManager;
import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    private DriverManager driverManager;

    public Hooks(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    //ADD HOOKS

    private void takeScreenshot(Scenario scenario) {
        if (driverManager.getWebDriver() != null) {
            scenario.embed(((TakesScreenshot) driverManager.getWebDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
        }
    }

    private void teardownDriver() {
        driverManager.quitDriver();
    }
}
