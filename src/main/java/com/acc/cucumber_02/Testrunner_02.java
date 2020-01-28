package com.acc.cucumber_02;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={json:target/cucumber.json},
		features = "Feature_01"
		,glue= {"step_definition_02"}
		//,tags= {"@SmokeTest"}
		//,tags= {"@RegressionTest"}
		//,tags= {"@End2End"}
		//,tags= {"@SmokeTest,@RegressionTest"} //it means test cases which involve both smoke test and regression test separately(OR tags)
		//,tags= {"@SmokeTest","@RegressionTest"} //it means test cases which involve both smoke test and regression test together(AND tags)
		//,tags= {"@SmokeTest","~@RegressionTest"} //Ignoring Regression test
		//,tags= {"~@SmokeTest","~@RegressionTest","~@End2End"}//Ignoring Smoke,Regression,End2End Tests
		,tags= {"@SmokeTest,@RegressionTest,@End2End"} 
		)

public class Testrunner_02 {

}
