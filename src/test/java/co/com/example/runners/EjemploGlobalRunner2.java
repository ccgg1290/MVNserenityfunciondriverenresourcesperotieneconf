package co.com.example.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
//GOOGLE
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.com.example",
        tags = "@EscenarioGmail",
        snippets = SnippetType.CAMELCASE
)
public class EjemploGlobalRunner2 {

    public void algo(){
        System.out.println("runner 2");

    }


}
