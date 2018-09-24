package ice_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class) 
@CucumberOptions(features="src/ice_Features",glue={"ice_stepDefinitions"})
public class Ice_TestRunner {

}
