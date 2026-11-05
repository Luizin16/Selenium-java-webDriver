package swaglabs.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Executa todas as features.
 * Para rodar só uma parte: mvn test -Dcucumber.filter.tags="@smoke"
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"swaglabs.steps", "swaglabs.hooks"},
        plugin = {
                "pretty",
                "html:target/reports/cucumber-report.html",
                "json:target/reports/cucumber.json"
        },
        monochrome = true
)
public class RunCucumberTest {
}
