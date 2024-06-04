package CalculadoraSalud;

public class HealthCalculator {
    public double calcularPesoIdeal(double altura, char genero) throws Exception {
        if (genero == 'm') {
            return altura - 100 - (altura - 150) / 4.0;
        } else if (genero == 'w') {
            return altura - 100 - (altura - 150) / 2.5;
        } else {
            throw new Exception("Invalid gender. Please specify 'm' for male or 'w' for female.");
        }
    }

    public double calcularTMB(double peso, double altura, char genero, int edad) throws Exception {
        if (genero == 'm') {
            return 10 * peso + 6.25 * altura - 5 * edad + 5;
        } else if (genero == 'w') {
            return 10 * peso + 6.25 * altura - 5 * edad - 161;
        } else {
            throw new Exception("Invalid gender. Please specify 'm' for male or 'w' for female.");
        }
    }
}
