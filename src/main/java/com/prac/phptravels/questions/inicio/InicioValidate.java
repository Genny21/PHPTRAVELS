package com.prac.phptravels.questions.inicio;

import com.prac.phptravels.ui.inicio.InicioForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

public class InicioValidate implements Question<Boolean> {

     public static InicioValidate userAdmin(){
         return new InicioValidate();
     }
    @Override
    public Boolean answeredBy(Actor actor) {

         actor.attemptsTo(
                 Ensure.that(InicioForm.LBL_VALIDATE_LOGIN).isDisplayed()
         );
        return true;
    }
}
