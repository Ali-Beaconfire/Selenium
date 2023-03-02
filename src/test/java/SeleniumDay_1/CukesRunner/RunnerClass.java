package SeleniumDay_1.CukesRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports/index.html"},
        features="src/test/resources/CucumberSalad/homePage.feature",
        glue={"StepDeffinition"}
)
public class RunnerClass {


}
