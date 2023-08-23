package navigator;

import com.prac.phptravels.constans.Constants;
import navigator.homepagephp.PhpTravels;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class NavigateTo {

    public static Performable homePagePhpTravels(){
        return Task.where("Se inicia el navegador abriendo la aplicación web de PHP Travels " + OnStage.theActorInTheSpotlight().recall(Constants.BASE_URL),
                Open.browserOn().the(PhpTravels.class)
        );
    }

}
