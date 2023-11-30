package co.com.example.runners;

import com.google.gson.internal.bind.util.ISO8601Utils;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
//YOU TUBE
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/EjemploGlobal.feature",
        glue = "co.com.example",
        tags = "@EscenarioYoutube",
        snippets = SnippetType.CAMELCASE
)
public class EjemploGlobalRunner {

    public void algo(){
        System.out.println("runner 1");

    }
}
