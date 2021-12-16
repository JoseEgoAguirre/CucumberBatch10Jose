package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features/",
            //glue is where we can find the implementation for gherkin steps
            //here we provide the path of our steps package
            glue = "APISteps",
            //if we set dryRun to true, then

            dryRun = false,
            //it keeps console output for the cucumber test easily readable
            //it will remove all the unreadable characters
            monochrome = true,
            tags = "@APIWorkFlow",
            plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
    //plugin - we use it to generate report for the execution
    //pretty - it takes care of printing the steps in console
    //json
    //strict=true it checks all the steps definition
    )

            public class APIRunner {

}
