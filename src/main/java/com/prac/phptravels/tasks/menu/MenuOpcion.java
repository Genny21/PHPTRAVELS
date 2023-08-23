package com.prac.phptravels.tasks.menu;

import com.prac.phptravels.ui.menu.MenuOpcionForm;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class MenuOpcion implements Task {

    private Target menuTarget;

    private static String menuSeleccionado;


    public MenuOpcion(Target menuTarget) {
        this.menuTarget = menuTarget;
    }

    public static Performable flight() {

        menuSeleccionado = "Menu flights";
        return Instrumented
                .instanceOf(MenuOpcion.class).withProperties(MenuOpcionForm.MENU_FLIGHT);
    }

    public static Performable flightAirport() {

        menuSeleccionado = "Submenu Flights Airports";
        return Instrumented
                .instanceOf(MenuOpcion.class).withProperties(MenuOpcionForm.SUBMENU_FLIGHTS_AIRPORTS);
    }

    public static Performable flightAirline() {

        menuSeleccionado = "Submenu Flights Airlines";
        return Instrumented
                .instanceOf(MenuOpcion.class).withProperties(MenuOpcionForm.SUBMENU_FLIGHTS_AIRLINES);
    }

    public static Performable flightS() {

        menuSeleccionado = "Submenu Flights";
        return Instrumented
                .instanceOf(MenuOpcion.class).withProperties(MenuOpcionForm.SUBMENU_FLIGHTS);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(this.menuTarget));
    }
}
