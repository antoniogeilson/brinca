package runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@generate",
		plugin = "pretty",
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false,
		//glue = {"classpath:steps/BrincaSteps.java"},
		glue = "steps",
		//features = {"classpath:resources/features/brinca.feature"}
		features = "src/test/resources/features/brinca.feature"
		)

public class Runner {

}
