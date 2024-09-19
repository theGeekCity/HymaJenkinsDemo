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
        tags = "@reg"

)
public class regrunnerTest {

//mvn test -Dcucumber.filter.tags="@smoke" -Dcucumber.plugin="html:target/cucumberHTMLReports/cucumber.html"
//    mvn clean -Dtest=regrunnerTest test

//   mvn -Denv=QA -Dusername=myname -Dpassword=mypwd clean -Dtest=regrunnerTest test

}
