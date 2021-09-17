package com.app.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Feature",
        glue = "com.app.stepDefinition")


public class ActionRunnerClass {
}
