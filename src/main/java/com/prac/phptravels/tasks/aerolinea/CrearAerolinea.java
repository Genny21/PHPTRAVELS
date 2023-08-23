package com.prac.phptravels.tasks.aerolinea;

import com.prac.phptravels.ui.aerolinea.CrearAerolineaForm;
import com.prac.phptravels.ui.aeropuerto.CrearAeropuertoForm;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;


public class CrearAerolinea implements Task {

    private final String estado;

    private final String iata;

    private final String nombre;


    private final String pais;

    public CrearAerolinea(String estado, String iata, String nombre, String pais) {
        this.estado = estado;
        this.iata = iata;
        this.nombre = nombre;
        this.pais = pais;
    }

    public static CrearAeropuertoConBuilder estado(String estado) {
        return new CrearAeropuertoConBuilder(estado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {





        actor.attemptsTo(

                Click.on(CrearAerolineaForm.BTN_ADD_AIRLINE),
                SelectFromOptions.byVisibleText(estado).from(CrearAerolineaForm.STATUS_LIST),
                Enter.theValue(iata).into(CrearAerolineaForm.IATA_TEXTBOX),
                Enter.theValue(nombre).into(CrearAerolineaForm.NAME_TEXTBOX),
                Click.on(CrearAerolineaForm.COUNTRY_LIST),
                WaitUntil.the(CrearAerolineaForm.ITM_INPUT,isCurrentlyEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(pais).into(CrearAerolineaForm.ITM_INPUT),
                Click.on(CrearAerolineaForm.ITM_COUNTRY),
                Click.on(CrearAerolineaForm.BTN_SAVE_AIRLINE)

        );



    }




    public static class CrearAeropuertoConBuilder {

        private  String estado;

        private  String iata;

        private  String nombre;

        private String pais;

        public CrearAeropuertoConBuilder(String estado) {
            this.estado = estado;
            this.iata = "";
            this.nombre = "";
            this.pais = "";
        }


        public CrearAeropuertoConBuilder iata(String iata){

            this.iata = iata;
            return this;

        }

        public CrearAeropuertoConBuilder nombre(String nombre){

            this.nombre = nombre;
            return this;

        }


        public CrearAeropuertoConBuilder pais(String pais){

            this.pais = pais;
            return this;

        }

        public Performable run(){

            return Instrumented.instanceOf(CrearAerolinea.class)
                    .withProperties(estado, iata, nombre,pais);
        }

    }
}
