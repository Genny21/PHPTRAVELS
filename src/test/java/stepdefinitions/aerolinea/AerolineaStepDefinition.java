package stepdefinitions.aerolinea;

import com.prac.phptravels.questions.aerolinea.AerolineaValidate;
import com.prac.phptravels.tasks.aerolinea.CrearAerolinea;
import com.prac.phptravels.tasks.menu.MenuOpcion;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;

public class AerolineaStepDefinition {


    @Cuando("realiza la creacion de una nueva aerolinea con toda la informacion")
    public void realizaLaCreacionDeUnaNuevaAerolineaConTodaLaInformacion() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                MenuOpcion.flight(),
                MenuOpcion.flightAirline(),
                CrearAerolinea
                        .estado("Enabled")
                        .iata("ATAA")
                        .nombre("Nueva air automation")
                        .pais("Colombia")
                        .run()

                );

    }
    @Entonces("deberia presentarse la aerolinea creada")
    public void deberiaPresentarseLaAerolineaCreada() {

        OnStage.theActorInTheSpotlight().asksFor(AerolineaValidate.search("Nueva air automation"));


    }


}
