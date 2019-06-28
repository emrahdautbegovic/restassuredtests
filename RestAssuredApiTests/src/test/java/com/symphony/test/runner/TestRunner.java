package com.symphony.test.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "pretty",
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },
        plugin = {
                "io.qameta.allure.cucumberjvm.AllureCucumberJvm"
        },
        glue = {
                "com.symphony.test.steps"
        },
        features = {
                "src/test/resources/features/symphonytest.feature"
        })

public class TestRunner {}