package healthcalc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class PesoIdealStepDefinitions {

    private int altura;
    private char genero;
    private float pesoIdeal;

    @Given("^que soy un usuario de la calculadora de salud$")
    public void soyUsuarioCalculadoraSalud() {
    }

    @When("^ingreso mi altura \"([^\"]*)\" y género \"([^\"]*)\"$")
    public void ingresoAlturaGenero(String alturaStr, String generoStr) {
        altura = Integer.parseInt(alturaStr);
        genero = generoStr.charAt(0);
    }

    @Then("^el sistema calcula mi peso ideal correctamente \"([^\"]*)\"$")
    public void sistemaCalculaPesoIdealCorrectamente(String pesoIdealStr) {
        float pesoIdealEsperado = Float.parseFloat(pesoIdealStr);
        assertEquals(pesoIdealEsperado, pesoIdeal, 0.01);
    }
}
