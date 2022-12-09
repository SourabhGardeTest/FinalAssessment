package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".\\Features\\AddCountry.feature",
		glue="StepDefinationCountry",
		dryRun=false,
		monochrome=true
		
		)
public class AddCountryRunner {

}
