package com.prac.phptravels.ui.aeropuerto;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearAeropuertoForm {

    public static final Target BTN_ADD_AIRPORT = Target.the("Botón para agregar un nuevo aeropuerto").located(By.xpath("(//div[@class='xcrud-rightside'])[1]"));

    public static final Target STATUS_LIST = Target.the("Lista para seleccionar el estado del aeropuerto").located(By.xpath("//tbody/tr[1]/td[2]/div[1]/select[1]"));

    public static final Target CODE_TEXTBOX = Target.the("Campo de texto para ingresar el código del aeropuerto").located(By.xpath("//tbody/tr[2]/td[2]/input[1]"));

    public static final Target AIRPORT_TEXTBOX = Target.the("Campo de texto para ingresar el nombre del aeropuerto").located(By.xpath("//tbody/tr[3]/td[2]/input[1]"));

    public static final Target CITY_TEXTBOX = Target.the("Campo de texto para ingresar la ciudad del aeropuerto").located(By.xpath("//tbody/tr[4]/td[2]/input[1]"));


    public static final Target COUNTRY_LIST = Target.the("Lista para seleccionar el pais del aeropuerto").located(By.xpath("//*[contains(text(),'Country')]/following::b"));

    public static final Target BTN_SAVE_AIRPORT = Target.the("Botón para guardar un nuevo aeropuerto").located(By.xpath("//a[contains(text(),'Save')]"));

    public static final Target BTN_SEARCH_AIRPORT = Target.the("Botón para buscar el aeropuerto creado").located(By.xpath("//a[contains(text(),'Search')]"));

    public static final Target BUSCAR_AIRPORT_TEXTBOX = Target.the("Campo de texto para buscar el aeropuerto creado").located(By.xpath("//input[@name='phrase']"));

    public static final Target BTN_GO_SEARCH_AIRPORT = Target.the("Botón para ir a buscar el aeropuerto creado").located(By.xpath("//a[contains(text(),'Go')]"));

    public static final Target TBL_AIRPORT = Target.the("Campo en tabla para validar el aeropuerto creado").located(By.xpath("//td[contains(text(),'Francisco Jose de Caldas')]"));

    public static final Target ITM_COUNTRY = Target.the("Campo para seleccionar el pais del aeropuerto").located(By.xpath("//*[contains(text(),'Country')]/following::b/following::*[contains(text(),'Colombia')]"));

    public static final Target ITM_INPUT = Target.the("Campo para ingresar el pais del aeropuerto").located(By.xpath("//input[@aria-label='Search']"));
    public static final Target BTN_RETURN = Target.the("Botón para desistir de crear aeropuerto").located(By.xpath("//a[normalize-space()='Return']"));

    public static final Target TBL_NOAIRPORT = Target.the("Campo en la tabla para validar que el aeropuero no fue creado").located(By.xpath("//td[normalize-space()='Entries not found.']"));
}
