package com.prac.phptravels.tasks.aeropuerto;

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


public class DesistirCrearAeropuerto implements Task {

    private final String estado;

    private final String codigo;

    private final String nombre;

    private final String ciudad;

    private final String pais;

    public DesistirCrearAeropuerto(String estado, String codigo, String nombre, String ciudad, String pais) {
        this.estado = estado;
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public static CrearAeropuertoConBuilder estado(String estado) {
        return new CrearAeropuertoConBuilder(estado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {





        actor.attemptsTo(

                Click.on(CrearAeropuertoForm.BTN_ADD_AIRPORT),
                SelectFromOptions.byVisibleText(estado).from(CrearAeropuertoForm.STATUS_LIST),
                Enter.theValue(codigo).into(CrearAeropuertoForm.CODE_TEXTBOX),
                Enter.theValue(nombre).into(CrearAeropuertoForm.AIRPORT_TEXTBOX),
                Enter.theValue(ciudad).into(CrearAeropuertoForm.CITY_TEXTBOX),
                Click.on(CrearAeropuertoForm.COUNTRY_LIST),
                WaitUntil.the(CrearAeropuertoForm.ITM_INPUT,isCurrentlyEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(pais).into(CrearAeropuertoForm.ITM_INPUT),
                Click.on(CrearAeropuertoForm.ITM_COUNTRY),
                Click.on(CrearAeropuertoForm.BTN_RETURN)

        );



    }




    public static class CrearAeropuertoConBuilder {

        private  String estado;

        private  String codigo;

        private  String nombre;

        private  String ciudad;

        private String pais;

        public CrearAeropuertoConBuilder(String estado) {
            this.estado = estado;
            this.codigo = "";
            this.nombre = "";
            this.ciudad = "";
            this.pais = "";
        }


        public CrearAeropuertoConBuilder codigo(String codigo){

            this.codigo = codigo;
            return this;

        }

        public CrearAeropuertoConBuilder nombre(String nombre){

            this.nombre = nombre;
            return this;

        }

        public CrearAeropuertoConBuilder ciudad(String ciudad){

            this.ciudad = ciudad;
            return this;

        }

        public CrearAeropuertoConBuilder pais(String pais){

            this.pais = pais;
            return this;

        }

        public Performable run(){

            return Instrumented.instanceOf(DesistirCrearAeropuerto.class)
                    .withProperties(estado, codigo, nombre, ciudad,pais);
        }

    }
}
