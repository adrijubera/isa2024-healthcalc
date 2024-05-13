package CalculadoraSalud;

public interface HealthHospital {
	double bmr(char gender, int age, float height, int weight) throws Exception;
    int pesoIdeal(char gender, float height) throws Exception;
}
