package CalculadoraSalud;

public class MetabolicMetrics {
    private GenderCalculator calculator;

    public MetabolicMetrics(GenderCalculator calculator) {
        this.calculator = calculator;
    }

    public double basalMetabolicRate(double peso, double altura, int edad) throws Exception {
        return calculator.calcularTMB(peso, altura, edad);
    }
}