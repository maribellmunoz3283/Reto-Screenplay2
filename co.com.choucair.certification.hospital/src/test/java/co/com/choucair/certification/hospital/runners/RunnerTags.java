package co.com.choucair.certification.hospital.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/manage.feature",
        tags = "@Regression",
        glue = {"co.com.choucair.certification.hospital.stepdefinitions", "co.com.choucair.certification.hospital.util"},
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
