package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
            // or ikisinden biri varsa çalışıyor
        tags = "@Regression or @SmokeTest", //"@Regression and @SmokeTest" ikiside yazılıysa çalışıyor
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}

)

public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
} // Browser tipi vermek için, rapora ek parametre eklemek için sonra kullanacağız
