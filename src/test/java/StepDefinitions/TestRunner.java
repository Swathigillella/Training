package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/",glue= {"StepDefinitions"},
monochrome=true,
//plugin= {"pretty","Junit:target/JunitReports.xml"}
//plugin= {"pretty","json:target/reports/cucumber.json"}
plugin= {"pretty","html:target/reports"}
)
public class TestRunner{

}
