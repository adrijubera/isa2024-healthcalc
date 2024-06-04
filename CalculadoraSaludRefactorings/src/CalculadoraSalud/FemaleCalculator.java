package CalculadoraSalud;

public class FemaleCalculator implements GenderCalculator {
    @Override
    public double calcularPesoIdeal(double altura) throws Exception {
        return altura - 100 - (altura - 150) / 2.5;
    }

    @Override
    public double calcularTMB(double peso, double altura, int edad) throws Exception {
        return 10 * peso + 6.25 * altura - 5 * edad - 161;
    }
}