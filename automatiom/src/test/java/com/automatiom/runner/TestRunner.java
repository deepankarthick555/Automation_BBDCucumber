package com.automatiom.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:/features",
		glue= "com.automatiom.step_definitions",
		dryRun = false,
		monochrome= true
		)
public class TestRunner {
	
	

}
