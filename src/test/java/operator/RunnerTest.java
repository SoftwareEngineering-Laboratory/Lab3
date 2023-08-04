package operator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/features/operator.feature")
@RunWith(Cucumber.class)
public class RunnerTest {
}
