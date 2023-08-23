package com.prac.phptravels.tasks.inicio;

import com.prac.phptravels.ui.inicio.InicioForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InicioSesion implements Task {

     private String email;
     private String passWord;

    public InicioSesion() {
       }

    public static InicioSesion userAdmin(String email, String passWord){

        InicioSesion task = instrumented(InicioSesion.class);
        task.email = email;
        task.passWord = passWord;
        return task;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(email).into(InicioForm.USERNAME_TEXTBOX),
                Enter.theValue(passWord).into(InicioForm.PASSWORD_TEXTBOX),
                Click.on(InicioForm.BTN_LOGIN)

        );

    }
}
