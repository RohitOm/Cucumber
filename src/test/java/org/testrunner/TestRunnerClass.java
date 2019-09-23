package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//no need of semi colon

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org//stepdefinition",monochrome=true)

public class TestRunnerClass {


}
