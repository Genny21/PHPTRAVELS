package com.prac.phptravels.ui.aerolinea;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearAerolineaForm {

    public static final Target BTN_ADD_AIRLINE = Target.the("Botón para agregar una nueva aerolinea").located(By.xpath("//a[@class='xcrud-button xcrud-green xcrud-action']"));

    public static final Target STATUS_LIST = Target.the("Lista para seleccionar el estado de la aerolinea").located(By.xpath("//tbody/tr[1]/td[2]/div[1]/select[1]"));

    public static final Target IATA_TEXTBOX = Target.the("Campo de texto para ingresar el código de IATA").located(By.xpath("//tbody/tr[2]/td[2]/input[1]"));

    public static final Target NAME_TEXTBOX = Target.the("Campo de texto para ingresar el nombre de la arolinea").located(By.xpath("//tbody/tr[3]/td[2]/input[1]"));

    public static final Target ITM_COUNTRY = Target.the("Campo para seleccionar el pais del aeropuerto").located(By.xpath("//*[contains(text(),'Country')]/following::b/following::*[contains(text(),'Colombia')]"));

    public static final Target ITM_INPUT = Target.the("Campo para ingresar el pais del aeropuerto").located(By.xpath("//input[@aria-label='Search']"));

    public static final Target COUNTRY_LIST = Target.the("Lista para seleccionar el pais de la aerolinea").located(By.xpath("//*[contains(text(),'Country')]/following::b"));

    public static final Target BTN_SAVE_AIRLINE = Target.the("Botón para guardar una nueva aerolinea").located(By.xpath("//a[contains(text(),'Save')]"));

    public static final Target BTN_SEARCH_AIRLINE = Target.the("Botón para buscar la aerolinea creada").located(By.xpath("//a[contains(text(),'Search')]"));

    public static final Target BUSCAR_AIRLINE_TEXTBOX = Target.the("Campo de texto para buscar la aerolinea creada").located(By.xpath("//input[@name='phrase']"));

    public static final Target BTN_GO_SEARCH_AIRLINE = Target.the("Botón para ir a buscar la aerolinea creada").located(By.xpath("//a[contains(text(),'Go')]"));

    public static final Target TBL_AIRLINEA= Target.the("Campo en tabla para validar la aerlonia creada").located(By.xpath("//td[contains(text(),'Nueva air automation')]"));

}
