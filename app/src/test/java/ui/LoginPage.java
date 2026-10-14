package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    public static final Target USERNAME = Target.the("campo usuario").located(By.name("username"));
    public static final Target PASSWORD = Target.the("campo contraseña").located(By.name("password"));
    public static final Target LOGIN_BUTTON = Target.the("boton login").located(By.cssSelector("button[type='submit']"));
    public static final Target ERROR_MESSAGE = Target.the("mensaje de error").located(By.cssSelector("p.oxd-alert-content-text"));
}