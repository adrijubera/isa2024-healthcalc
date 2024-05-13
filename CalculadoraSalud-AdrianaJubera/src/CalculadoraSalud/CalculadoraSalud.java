package CalculadoraSalud;

public interface CalculadoraSalud {
	double calcularBMR(char genero, int edad, double altura, double peso) throws Exception;
    double calcularPesoIdeal(char genero, double altura) throws Exception;

}
