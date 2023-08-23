package stepdefinitions.inicio;

import com.prac.phptravels.questions.inicio.InicioFallidoValidate;
import com.prac.phptravels.questions.inicio.InicioValidate;
import com.prac.phptravels.tasks.inicio.InicioSesion;
import io.cucumber.java.es.*;
import navigator.NavigateTo;
import net.serenitybdd.screenplay.actors.OnStage;

public class InicioStepDefinition {


    @Dado("que {word} se encuentra registrada en phptravels para gestionar su cuenta")
    public void queGennySeEncuentraRegistradaEnPhptravelsParaGestionarSuCuenta(String actor){

        OnStage.theActor(actor).attemptsTo(
                NavigateTo.homePagePhpTravels()
        );
    }

    @Cuando("intenta acceder con credenciales")
    public void intentaAccederConCredenciales(){


        OnStage.theActorInTheSpotlight().attemptsTo(
                InicioSesion.userAdmin("admin@phptravels.com", "demoadmin")
        );

    }

    @Entonces("debería mostrarse en pantalla el tablero de gestion de viajes")
    public void deberiMostrarseEnPantallaElTableroDeGestionDeViajes(){

        OnStage.theActorInTheSpotlight().asksFor(InicioValidate.userAdmin()

        );

    }

    @Cuando("intenta acceder con credenciales no validas")
    public void intentaAccederConCredencialesNoValidas() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InicioSesion.userAdmin("admin@phptravels.es", "otrapass")
        );
    }
    @Entonces("debería mostrarse en pantalla el mensaje de error correspondiente")
    public void deberíaMostrarseEnPantallaElMensajeDeErrorCorrespondiente() {

        OnStage.theActorInTheSpotlight().asksFor(InicioFallidoValidate.userAdminFail()
        );
    }

}
