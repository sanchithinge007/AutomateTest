package com.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features", 
		glue={"StepDefination"},
		plugin = {"pretty","html:target/cucumber-report.html","json:target/report.json"})
public class TestNgRunner {
	
	
}
