package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        ////
//        features we use to provide the path of all the feature files
        features ="src/test/resources/features",
//        glue keyword we use to provide the path of the package where
//        the step defs are available
        glue= "steps",
//        when dry run is equal to true it stops actual execution, it quickly scans
//        and will provide the actual missing step definition
        dryRun= false,

        tags = " @sprint1",
//        monochrome means sometimes the console output for cucumber test is having some
//        irrelevant info, when you set it to true, it removes all the irrelevant info
//        from the console and will give you simple output
        monochrome = true,
//        "pretty" is used to print all the steps in console
        plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json","rerun:target/failed.txt" }
)

public class RunnerClass {

}
