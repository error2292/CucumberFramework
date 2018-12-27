package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "E:\\E23300509\\Cucumberframework\\src\\main\\java\\Feature\\login.feature", 
		features = "E:\\E23300509\\Cucumberframework\\src\\main\\java\\Feature\\Eligible.feature", 
		glue= {"Step"},//path of step definition file
		format = {"pretty" , "html:test-output" , "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},// To generate different types of reporting.
		                                                                                                            //It can generate json ,html and xml reporting
		monochrome = true , //Monochrome - display the console output in readable format
		strict = true,  //it will check if any step is not defined in StepDefintion file 
		dryRun = false //to check the mapping is proper between feature file and step definition file
		)            

public class TestRunner {

} 
