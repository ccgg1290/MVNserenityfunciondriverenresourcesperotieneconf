package co.com.example.stepdefinitions;

import co.com.example.userinterfaces.HomePage;
import co.com.example.userinterfaces.HomePageGmail;
import co.com.example.userinterfaces.HomePageGoogle;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class EjemploGlobalSteps {

    private HomePage homePage = new HomePage();

    //you tube
    @Dado("^que un nuevo cliente (.*) accede hasta la web de youtube$")
    public void queUnNuevoClienteAccedeHastaLaWebDeYoutube(String nombreActor) {
        //theActorCalled(nombreActor).wasAbleTo(Open.browserOn(homePage));
        OnStage.theActorCalled("Cristian").attemptsTo(
                Open.browserOn().the(HomePage.class));
          getDriver().manage().window().maximize();
    }

    //@EscenarioSinEjemplos1
    @Cuando("^el agrega (.*) (.*) al carro$")
    public void ElAgregaAlCarro(String cantidad, String descripcion) {
        System.out.println("cuando ejecutamos algo caso 1");
        /*theActorInTheSpotlight().wasAbleTo(
                BuscarProducto.conDescripcion(descripcion, tipoCategoria),
                AgregarProducto.cantidad(cantidad)
        );*/
    }

    //google
    @Dado("que un nuevo cliente accede hasta la web de google")
    public void queUnNuevoClienteAccedeHastaLaWebDeComprasDeGoogle() {

        OnStage.theActorCalled("Cristian").attemptsTo(
                Open.browserOn().the(HomePageGoogle.class));
               // getDriver().manage().window().maximize();
    }
    //@EscenarioSinEjemplos2
    @Cuando("ingresa a google")
    public void ingresaAGoogle() {
        System.out.println("cuando ingresamos a google");
        /*theActorInTheSpotlight().wasAbleTo(
                BuscarProducto.conDescripcion(descripcion, tipoCategoria),
                AgregarProducto.cantidad(cantidad)
        );*/
    }




    //google
    @Dado("que un nuevo cliente accede hasta la web de gmail")
    public void queUnNuevoClienteAccedeHastaLaWebDeGmail() {

        OnStage.theActorCalled("Cristian").attemptsTo(
                Open.browserOn().the(HomePageGmail.class));
        // getDriver().manage().window().maximize();
    }
    //@EscenarioSinEjemplos2
    @Cuando("ingresa a gmail")
    public void ingresaAGmail() {

        System.out.println("cuando ingresamos a gmail");
        /*theActorInTheSpotlight().wasAbleTo(
                BuscarProducto.conDescripcion(descripcion, tipoCategoria),
                AgregarProducto.cantidad(cantidad)
        );*/
    }





    /* @Cuando("^el agrega productos al carro$")
    public void elAgregaProductosAlCarro(List<String> datos) {
        System.out.println("cuaado ejecutamos algo caso 2");
       theActorInTheSpotlight().wasAbleTo(
                BuscarProducto.conDescripcion(datos.get(1), datos.get(2)),
                AgregarProducto.cantidad(datos.get(0))
        );


    }*/

    @Entonces("^el ve los productos listado en el carro de compras$")
    public void elVeLosProductosListadoEnElCarroDeCompras() {
        System.out.println("Entonces se valida correctamente");
        //theActorInTheSpotlight().should(seeThat(the(LNK_ARTICULO_AGREGADO), isPresent()));
    }

}
