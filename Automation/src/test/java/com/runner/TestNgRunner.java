package com.runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/Features", 
		glue="src/test/java/StepDefination/",
		plugin = {"pretty","html:target/cucumber-report.html","json:target/report.json"})
public class TestNgRunner {
	
	
}
