package Runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src\\main\\resources\\Features",
        glue = {"stepDefinition"},
        tags = "@Testing"
)
public class TestRunner extends AbstractTestNGCucumberTests
{

}

