package com.prac.phptravels.questions.inicio;

import com.prac.phptravels.ui.inicio.InicioForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class InicioFallidoValidate implements Question<Boolean> {

     public static InicioFallidoValidate userAdminFail(){
         return new InicioFallidoValidate();
     }
    @Override
    public Boolean answeredBy(Actor actor) {

         actor.attemptsTo(
                 Scroll.to(InicioForm.LBL_PAGE)
         );

         actor.attemptsTo(

                 WaitUntil.the(InicioForm.PPU_ERROR, isCurrentlyEnabled()).forNoMoreThan(Duration.ofSeconds(10)),
                 Ensure.that(InicioForm.PPU_ERROR).isDisplayed()
         );
        return true;
    }
}
