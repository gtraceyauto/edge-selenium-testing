package EDGE_runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class) 
@CucumberOptions(
		features="src/EDGE_Features",
		glue={"EDGE_Remote_stepDefinitions"},
		plugin={"pretty","html:Results/cucumber-html-report"})
public class Edge_Remote_Smoke_Tests_Runner {

}
