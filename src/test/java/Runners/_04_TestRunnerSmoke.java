package Runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"pretty","json:target/cucumber.json"}
        //plugin = {"html:target//cucumber-reports.html"}

)

public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
