package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"FeatureFiles/Demoblaze1.feature", "FeatureFiles/Demoblaze2.feature"},
    glue = "stepDefinition",
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class Runner {
}
