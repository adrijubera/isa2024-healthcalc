package CalculadoraSalud;

public class HealthCalculator {
	public double calcularPesoIdeal(HealthParameters parameters) throws Exception {
        double altura = parameters.getHeight();
        char genero = parameters.getGender();
        if (genero == 'm') {
            return altura - 100 - (altura - 150) / 4.0;
        } else if (genero == 'w') {
            return altura - 100 - (altura - 150) / 2.5;
        } else {
            throw new Exception("Invalid gender. Please specify 'm' for male or 'w' for female.");
        }
    }

    public double calcularTMB(HealthParameters parameters) throws Exception {
        double altura = parameters.getHeight();
        double peso = parameters.getWeight();
        char genero = parameters.getGender();
        int edad = parameters.getAge();
        if (genero == 'm') {
            return 10 * peso + 6.25 * altura - 5 * edad + 5;
        } else if (genero == 'w') {
            return 10 * peso + 6.25 * altura - 5 * edad - 161;
        } else {
            throw new Exception("Invalid gender. Please specify 'm' for male or 'w' for female.");
        }
    }
}
