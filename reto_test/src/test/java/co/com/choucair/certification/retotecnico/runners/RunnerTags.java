package co.com.choucair.certification.retotecnico.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        features = "src/test/resources/features/startSharp.feature",
        tags = "@testApp",
        glue = {
                "co.com.choucair.certification.retotecnico.stepdefinitions",
                "co.com.choucair.certification.retotecnico.util"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTags {
}
