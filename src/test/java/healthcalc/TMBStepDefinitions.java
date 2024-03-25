package healthcalc;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class TMBStepDefinitions {

    private int peso;
    private int altura;
    private char genero;
    private float tmb;

    @Given("^que soy un usuario de la calculadora de salud$")
    public void soyUsuarioCalculadoraSalud() {
    }

    @When("^ingreso mi peso \"([^\"]*)\", altura \"([^\"]*)\" y género \"([^\"]*)\"$")
    public void ingresoPesoAlturaGenero(String pesoStr, String alturaStr, String generoStr) {
        peso = Integer.parseInt(pesoStr);
        altura = Integer.parseInt(alturaStr);
        genero = generoStr.charAt(0);
    }

    @Then("^el sistema calcula mi tasa metabólica basal correctamente \"([^\"]*)\"$")
    public void sistemaCalculaTMBCorrectamente(String tmbStr) {
        float tmbEsperada = Float.parseFloat(tmbStr);
        assertEquals(tmbEsperada, tmb, 0.01);
    }
}
