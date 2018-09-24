package EDGE_runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class) 
@CucumberOptions(
		features="src/EDGE_Features",
		glue={"EDGE_Local_stepDefinitions"},
		plugin={"pretty","html:Results/cucumber-html-report"})
public class Edge_TestRunner {

}
