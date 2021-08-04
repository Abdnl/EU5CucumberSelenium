package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},

        features = "src/test/resources/features",
            glue = "com/vytrack/step_definitions",
            dryRun = false,
            // Run all scenarios that has @driver and @VYT-123 tags
            //tags = "@driver and @VYT-123"       // NEW VERSION ***
            //tags = {"@driver" , "@VYT-123"}   // OLD VERSION ***
            // Run a scenario that matches either of two tags
            //tags = "@driver or @store_manager"
            // Run all the scenarios that has @login tag, But SKIP @wip and @sales_manager tags.
            //tags = "@login and not @wip and not @sales_manager"
            //tags = {"@login" , "~@wip" , "~@sales_manager"}   // --> OLD VERSION
            tags = "@wip"
)

public class CukesRunner {
}
