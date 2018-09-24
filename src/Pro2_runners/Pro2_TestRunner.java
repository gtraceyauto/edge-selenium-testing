package Pro2_runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features="src/Pro2_Features",
		glue={"Pro2_stepDefinitions"},
		plugin={"pretty","html:Results/cucumber-html-report"})

public class Pro2_TestRunner {

}
