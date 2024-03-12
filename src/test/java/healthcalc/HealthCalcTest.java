package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	@Test
    @DisplayName("Prueba para calcular el peso ideal de un hombre.")
    public void testIdealWeightForMale() {
        HealthCalc healthCalc = new HealthCalcImpl();
        try {
            float result = healthCalc.idealWeight(180, 'm');
            assertEquals(72.5f, result, 0.01f); // Tolerancia de 0.01f
        } catch (Exception e) {
            fail("Excepción lanzada: " + e.getMessage());
        }
    }
	
	@Test
    @DisplayName("Prueba para calcular el peso ideal de una mujer.")
    public void testIdealWeightForFemale() {
        HealthCalc healthCalc = new HealthCalcImpl();
        try {
            float result = healthCalc.idealWeight(160, 'w');
            assertEquals(56.0f, result, 0.01f); // Tolerancia de 0.01f
        } catch (Exception e) {
            fail("Excepción lanzada: " + e.getMessage());
        }
    }
	
	@Test
    @DisplayName("Prueba para calcular la tasa metabólica basal de un hombre.")
    public void testBasalMetabolicRateForMale() {
        HealthCalc healthCalc = new HealthCalcImpl();
        try {
            float result = healthCalc.basalMetabolicRate(70, 180, 'm', 30);
            assertEquals(1680.0f, result, 0.01f); // Tolerancia de 0.01f
        } catch (Exception e) {
            fail("Excepción lanzada: " + e.getMessage());
        }
    }
	
	@Test
    @DisplayName("Prueba para calcular la tasa metabólica basal de una mujer.")
    public void testBasalMetabolicRateForFemale() {
        HealthCalc healthCalc = new HealthCalcImpl();
        try {
            float result = healthCalc.basalMetabolicRate(60, 160, 'w', 25);
            assertEquals(1314.0f, result, 0.01f); // Tolerancia de 0.01f
        } catch (Exception e) {
            fail("Excepción lanzada: " + e.getMessage());
        }
    }
	
}
