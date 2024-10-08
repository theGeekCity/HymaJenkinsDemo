package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/featureFiles/",
        glue = {"StepDef"},
        monochrome = true,
        plugin = { "pretty","html:target/report/cucumber.html",
                    "json:target/report/cucumber.json"},
        tags = "@smoke"

)
public class smokerunnerTest {

//mvn test -Dcucumber.filter.tags="@smoke" -Dcucumber.plugin="html:target/cucumberHTMLReports/cucumber.html"

}
