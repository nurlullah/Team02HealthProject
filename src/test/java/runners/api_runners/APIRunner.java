package runners.api_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/html-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt",
        },
        features = "./src/test/resources/features/api_features/api.feature",
        glue = "stepdefinitions",
        tags = "@userApi",
        dryRun = true

)
public class APIRunner {

}