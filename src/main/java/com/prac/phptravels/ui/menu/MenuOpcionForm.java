package com.prac.phptravels.ui.menu;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuOpcionForm {

    public static final Target MENU_FLIGHT = Target.the("Opción del menú para gestionar vuelos").located(By.xpath("//button[normalize-space()='Flights']"));

    public static final Target SUBMENU_FLIGHTS_AIRPORTS = Target.the("Submenu para la gestión de aeropuertos").located(By.xpath("//a[contains(text(),'Flights Airports')]"));

    public static final Target SUBMENU_FLIGHTS_AIRLINES = Target.the("Submenu para la gestión de aerolineas").located(By.xpath("//a[contains(text(),'Flights Airlines')]"));

    public static final Target SUBMENU_FLIGHTS = Target.the("Submenu para la gestión de vuelos").located(By.xpath("//a[contains(@class,'active')]"));
}
