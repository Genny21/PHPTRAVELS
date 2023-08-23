package com.prac.phptravels.ui.inicio;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioForm {

    public static final Target USERNAME_TEXTBOX = Target.the("Campo de texto para ingresar nombre de usuario").located(By.id("email"));

    public static final Target PASSWORD_TEXTBOX = Target.the("Campo de texto para ingresar la contraseña de usuario").located(By.id("password"));

    public static final Target BTN_LOGIN = Target.the("Boton de inicio de sesión").located(By.id("submit"));

    public static final Target LBL_VALIDATE_LOGIN = Target.the("Campo para validar el inicio de sesión exitosos").located(By.xpath("//p[contains(text(),'Dashboard')]"));


    public static final Target PPU_ERROR = Target.the("Ventana emergente que indica credenciales de inicio de sesión no validas").located(By.cssSelector("div[class='text-group'] p"));


    public static final Target LBL_PAGE = Target.the("Label para validar mensaje de error").located(By.xpath("//strong[contains(text(),'PHPTRAVELS')]"));

}
