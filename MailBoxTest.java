package Tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/MailBoxTest",
		glue = "MailBoxStep",
		dryRun = false, 
		strict = false)

public class MailBoxTest {
	
}
