package runner;

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
        tags = "@reg"

)
public class runnerTest {

//    mvn test -Dcucumber.options="src/test/resources/featureFiles/" -Dcucumber.options= "--tags @smoke" -Dcucumber.options= "--glue StepDef"
//$     mvn -Dtest=runnerTest test

}
