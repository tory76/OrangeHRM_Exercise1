package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Test",glue = "StepDefinations",
      monochrome = true, tags ="@job or @performance")

public class FullTestRunne{
        }
