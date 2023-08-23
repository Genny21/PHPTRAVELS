package stepdefinitions;

import actors.WebCast;
import io.cucumber.java.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.util.EnvironmentVariables;

public class Hooks {

    private EnvironmentVariables environmentVariables;

    @Before
    public void settingTheStage() {
        OnStage.setTheStage(
                new WebCast(environmentVariables
                )
        );
    }


    @After
    public void afterScenario()  {

        //BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).getDriver().close();
    }

}
