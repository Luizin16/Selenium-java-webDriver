package swaglabs.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "swaglabs.steps",
        tags = "@CN_VALIDARLISTAGEMPRODUTOS",
        plugin = {
                "pretty",
                "html:reports/cucumber-report.html",
                "json:reports/cucumber.json"
        },
        monochrome = true
)
public class RunFeature {
}