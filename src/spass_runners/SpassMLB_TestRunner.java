package spass_runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features="src/spass_Features",
		glue={"Cucumber.spassMLB_stepDefinitions"},
		plugin={"pretty","html:Results/cucumber-html-report"})

public class SpassMLB_TestRunner {

}
