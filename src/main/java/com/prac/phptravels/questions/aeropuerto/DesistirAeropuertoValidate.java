package com.prac.phptravels.questions.aeropuerto;

import com.prac.phptravels.ui.aeropuerto.CrearAeropuertoForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class DesistirAeropuertoValidate implements Question<Boolean> {

    private String keyWord;

    public DesistirAeropuertoValidate(String keyWord) {
        this.keyWord = keyWord;
    }
    public static DesistirAeropuertoValidate search(String keyWord){
        return new DesistirAeropuertoValidate(keyWord);
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                Scroll.to(CrearAeropuertoForm.BTN_SEARCH_AIRPORT),
                Click.on(CrearAeropuertoForm.BTN_SEARCH_AIRPORT),
                Enter.theValue(keyWord).into(CrearAeropuertoForm.BUSCAR_AIRPORT_TEXTBOX),
                Click.on(CrearAeropuertoForm.BTN_GO_SEARCH_AIRPORT)


        );

        actor.attemptsTo(

                Ensure.that(CrearAeropuertoForm.TBL_NOAIRPORT).isDisplayed()
        );

        return true;
    }
}
