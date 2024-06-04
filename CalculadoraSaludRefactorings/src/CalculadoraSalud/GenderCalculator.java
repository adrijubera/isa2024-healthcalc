package CalculadoraSalud;

public interface GenderCalculator {
    double calcularPesoIdeal(double altura) throws Exception;
    double calcularTMB(double peso, double altura, int edad) throws Exception;
}
