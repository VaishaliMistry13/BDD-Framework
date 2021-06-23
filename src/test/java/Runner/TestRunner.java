package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = ".", tags = "@E2E",

        //      features = ".", tags = "@E2E, @SmokeTest",   //AND
        //      features = ".", tags = "@E2E, @SmokeTest",   //OR
        //    features = "C:\\Users\\C D Lad\\Desktop\\Software Testing\\BDD Framework\\src\\test\\java\\Feature\\Register.feature",
        glue = {"StepDefinition"},
        format = {"pretty", "html:html", "json:json/cucumber.json", "junit:junit/cucumber.xml"},
        dryRun = false
        //monochrome = true,
        //strict = true
)
public class TestRunner {

}

