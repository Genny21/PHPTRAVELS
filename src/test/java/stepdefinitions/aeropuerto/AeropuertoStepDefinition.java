package stepdefinitions.aeropuerto;

import com.prac.phptravels.questions.aeropuerto.AeropuertoValidate;
import com.prac.phptravels.questions.aeropuerto.DesistirAeropuertoValidate;
import com.prac.phptravels.tasks.aeropuerto.CrearAeropuerto;
import com.prac.phptravels.tasks.aeropuerto.DesistirCrearAeropuerto;
import com.prac.phptravels.tasks.menu.MenuOpcion;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import stepdefinitions.inicio.InicioStepDefinition;

public class AeropuertoStepDefinition {

    @Dado("que {word} ha ingresado exitosamente a phptravels")
    public void queGennyHaIngresadoExitosamenteAPhptravels(String actor) {

        new InicioStepDefinition().queGennySeEncuentraRegistradaEnPhptravelsParaGestionarSuCuenta(actor);
        new InicioStepDefinition().intentaAccederConCredenciales();


    }
    @Cuando("realiza la creacion de un nuevo aeropuerto con toda la informacion")
    public void realizaLaCreacionDeUnNuevoAeropuertoConTodaLaInformacion() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                MenuOpcion.flight(),
                MenuOpcion.flightAirport(),
                CrearAeropuerto
                        .estado("Enabled")
                        .codigo("FJDC")
                        .nombre("Francisco Jose de Caldas")
                        .ciudad("Bogota")
                        .pais("Colombia")
                        .run()


        );



    }
    @Entonces("deberia presentarse el aeropuerto creado")
    public void deberiaPresentarseElAeropuertoCreado() {

                   OnStage.theActorInTheSpotlight().asksFor(AeropuertoValidate.search("Francisco Jose de Caldas"));
       }

    @Cuando("desiste de la creacion de un nuevo aeropuerto")
    public void desisteDeLaCreacionDeUnNuevoAeropuerto() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                MenuOpcion.flight(),
                MenuOpcion.flightAirport(),
                DesistirCrearAeropuerto
                        .estado("Enabled")
                        .codigo("FJDC")
                        .nombre("Francisco Jose de Caldas")
                        .ciudad("Bogota")
                        .pais("Colombia")
                        .run()
        );

    }
    @Entonces("no deberia presentarse ningun nuevo aeropuerto")
    public void noDeberiaPresentarseNingunNuevoAeropuerto() {

        OnStage.theActorInTheSpotlight().asksFor(DesistirAeropuertoValidate.search("Francisco Jose de Caldas"));


    }



}
