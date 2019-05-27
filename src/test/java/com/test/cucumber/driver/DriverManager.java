package com.test.cucumber.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver driver;

    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        DriverManager.driver = new ChromeDriver(getCapabilities());
        DriverManager.driver.manage().window().maximize();
        DriverManager.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        initializePages();
    }

    private ChromeOptions getCapabilities() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }

    public void quitDriver() {
        if (DriverManager.driver != null) {
            DriverManager.driver.quit();
            DriverManager.driver = null;
        }
    }

    private void initializePages() {
        if (DriverManager.driver != null) {
            //Add pages
        }
    }

    public WebDriver getWebDriver() {
        return driver;
    }
}
