package com.test.google.steps;

import com.test.cucumber.driver.DriverManager;
import cucumber.api.java8.En;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestSteps implements En {
    private WebElement el;

    public TestSteps(DriverManager driver) {
        Given("user is in google page", () -> {
            driver.getWebDriver().get("https://www.google.com");
        });

        When("user inputs {search} in search field", (String string) -> {
            el = string.equalsIgnoreCase("facebook") ? driver.googlePage.result1FB : driver.googlePage.result1TW;
            driver.googlePage.searchInput.sendKeys(string);
        });

        When("user press enter key", () -> {
            Actions action = new Actions(driver.getWebDriver());
            action.sendKeys(Keys.RETURN).perform();
        });

        Then("first result should contain {string}", (String result) -> {
            String text = el.getText();
            SoftAssertions.assertSoftly(softAssertions -> {
                softAssertions.assertThat(text).contains(result);
            });
        });
    }
}
