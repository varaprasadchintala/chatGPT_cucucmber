package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
    @CucumberOptions(features= {"C:/Users/asus/Downloads/New folder/Cucumber_BDD/src/test/java/feature/login.feature"},  glue="stepDefinitions",plugin = {"pretty", "html:target/cucumber-reports"},
            monochrome = true,
    tags="@sanity")
    public class TestRun {

    }

