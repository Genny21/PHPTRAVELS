package com.prac.phptravels.questions.aerolinea;

import com.prac.phptravels.questions.aeropuerto.AeropuertoValidate;
import com.prac.phptravels.ui.aerolinea.CrearAerolineaForm;
import com.prac.phptravels.ui.aeropuerto.CrearAeropuertoForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class AerolineaValidate implements Question<Boolean> {

    private String keyWord;

    public AerolineaValidate(String keyWord) {
        this.keyWord = keyWord;
    }
    public static AerolineaValidate search(String keyWord){
        return new AerolineaValidate(keyWord);
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                Scroll.to(CrearAerolineaForm.BTN_SEARCH_AIRLINE),
                Click.on(CrearAerolineaForm.BTN_SEARCH_AIRLINE),
                Enter.theValue(keyWord).into(CrearAerolineaForm.BUSCAR_AIRLINE_TEXTBOX),
                Click.on(CrearAerolineaForm.BTN_GO_SEARCH_AIRLINE)


        );

        actor.attemptsTo(

                Ensure.that(keyWord).isEqualTo(actor.asksFor(Text.of(CrearAerolineaForm.TBL_AIRLINEA)))
        );

        return true;
    }
}
