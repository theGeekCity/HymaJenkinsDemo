package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/featureFiles/",
        glue = {"StepDef"},
        monochrome = true,
        plugin = { "pretty","html:target/cucumber.html",
                    "json:target/cucumber.json"},
        tags = "@smoke1"

)
public class cucumberRunner {
}
