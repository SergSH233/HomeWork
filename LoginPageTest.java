package Tests;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/LoginTest",
		glue = "LoginStep",
		dryRun = false, 
		strict = false
)
public class LoginPageTest {

}
