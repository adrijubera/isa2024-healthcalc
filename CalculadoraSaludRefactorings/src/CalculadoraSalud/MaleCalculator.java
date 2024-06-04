package CalculadoraSalud;

public class MaleCalculator implements GenderCalculator {
    @Override
    public double calcularPesoIdeal(double altura) throws Exception {
        return altura - 100 - (altura - 150) / 4.0;
    }

    @Override
    public double calcularTMB(double peso, double altura, int edad) throws Exception {
        return 10 * peso + 6.25 * altura - 5 * edad + 5;
    }
}