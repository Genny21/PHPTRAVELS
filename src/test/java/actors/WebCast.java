package actors;

import com.prac.phptravels.constans.Constants;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;
import setup.enviroment.TestEnvironments;

public class WebCast extends Cast {


    private final TestEnvironments testEnvironments;

    public WebCast(EnvironmentVariables environmentVariables) {
        this.testEnvironments = new TestEnvironments(environmentVariables);
    }

    @Override
    public Actor actorNamed(String actorName, Ability... abilities) {
        Actor theActor = null;
        theActor =
                super.actorNamed(actorName, BrowseTheWeb.with(theDefaultBrowserFor(actorName)))
                        .describedAs("Usuario que ha obtenido los privilegios para usar la web");
        theActor.remember(Constants.BASE_URL, testEnvironments.getBaseUrl());
        theActor.remember(Constants.PATH_PHP_VUELOS, testEnvironments.getPathVuelo());
        theActor.remember(Constants.PATH_PHP_AEROPUERTOS, testEnvironments.getPathAeropueto());
        theActor.remember(Constants.PATH_PHP_AEROLINEAS, testEnvironments.getPathAerolinea());
        return theActor;
    }

    private WebDriver theDefaultBrowserFor(String actorName) {
        return ThucydidesWebDriverSupport.getWebdriverManager().getWebdriverByName(actorName);
    }

}
