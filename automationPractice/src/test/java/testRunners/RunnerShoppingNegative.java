package testRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/resources/featureFiles",
		glue = {"stepDefinitions"},
		tags = {"@ORD7"}
		
		)
public class RunnerShoppingNegative extends AbstractTestNGCucumberTests {

}
