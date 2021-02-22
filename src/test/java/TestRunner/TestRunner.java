package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		monochrome = true, features = "src/test/java/Features", tags = "@News", publish = true, glue = {
				"StepDefinitions" }, plugin = { "pretty", "html:target/htmlreports" })

public class TestRunner {

}
