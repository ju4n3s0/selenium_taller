package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.Login;
import ui.HomePage;
import ui.LoginPage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Given("acceso a la pagina de OrangeHRMDemo")
    public void accessLoginPage() {
        theActorCalled("Admin").attemptsTo(Open.url(LoginPage.URL));
    }

    @When("ingreso nombre de {string} y {string} y doy click en ingresar")
    public void login(String user, String password) {
        theActorInTheSpotlight().attemptsTo(Login.withCredentials(user, password));
    }

    @Then("valido que haya ingresado")
    public void validateLogin() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(HomePage.DASHBOARD_TITLE).isDisplayed());
    }

    @Then("valido que se muestre el mensaje de error {string}")
    public void validateError(String message) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LoginPage.ERROR_MESSAGE).text().isEqualTo(message));
    }
}
