package com.demoQA.Runners.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.demoQA/Reto.feature",
        glue = "com.demoQA.Runners.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class retoRunner {
}
