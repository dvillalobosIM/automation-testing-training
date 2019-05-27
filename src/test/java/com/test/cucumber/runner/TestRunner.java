package com.test.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"com.test"}, features = "src/test/resources/features", plugin = {"pretty", "json:target/test-results/cucumber-report.json", "html:target/test-results/html-report", "junit:target/test-results/junit-report.xml"})
public class TestRunner {
}
