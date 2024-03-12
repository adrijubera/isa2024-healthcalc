package healthcalc;

public class HealthCalcImpl implements HealthCalc {

	public float idealWeight(int height, char gender) throws Exception {
		float idealWeight;
        if (gender == 'm') {
            idealWeight = height - 100 - (height - 150) / 4.0f;
        } else if (gender == 'w') {
            idealWeight = height - 100 - (height - 150) / 2.5f;
        } else {
            throw new Exception("Género inválido. Utilice 'm' para masculino o 'w' para femenino.");
        }
        return idealWeight;
	}

	public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
		float bmr;
        if (gender == 'm') {
            bmr = 10 * weight + 6.25f * height - 5 * age + 5;
        } else if (gender == 'w') {
            bmr = 10 * weight + 6.25f * height - 5 * age - 161;
        } else {
            throw new Exception("Género inválido. Utilice 'm' para masculino o 'w' para femenino.");
        }
        return bmr;
	}

}
