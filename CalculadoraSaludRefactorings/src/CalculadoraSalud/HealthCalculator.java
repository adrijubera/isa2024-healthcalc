package CalculadoraSalud;

public class HealthCalculator {
    private GenderCalculator genderCalculator;

    public HealthCalculator(GenderCalculator genderCalculator) {
        this.genderCalculator = genderCalculator;
    }

    public double calcularPesoIdeal(HealthParameters parameters) throws Exception {
        double altura = parameters.getHeight();
        return genderCalculator.calcularPesoIdeal(altura);
    }

    public double calcularTMB(HealthParameters parameters) throws Exception {
        double altura = parameters.getHeight();
        double peso = parameters.getWeight();
        int edad = parameters.getAge();
        return genderCalculator.calcularTMB(peso, altura, edad);
    }
}
