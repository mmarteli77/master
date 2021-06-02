package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features",glue={"StepDefinitions"},
				
        monochrome=true,
        plugin = {"pretty","html:Reports/HTML/HtmlReports","json:Reports/JSON/jsonReport.json","junit:Reports/JUNIT/junitReport.xml"}
		
		)

public class TestRunner {
	
	

}