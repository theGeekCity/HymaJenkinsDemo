package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class feature1Step {
    @Given("test case is Feature {int} Scenario {int}")
    public void testCaseIsFeatureScenario(int arg0, int arg1) {
        System.out.println(" Starting Feature: "+ arg0 + " Scenario: "+arg1);
    }

    @And("test step step {int}")
    public void testStepStep(int arg0) {
        System.out.println(" Test step"+ arg0);
    }
}
