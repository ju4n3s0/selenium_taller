package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target DASHBOARD_TITLE = Target.the("titulo Dashboard").located(By.xpath("//h6[normalize-space()='Dashboard']"));
}