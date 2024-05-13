package CalculadoraSalud;

public class Paciente {
	private char genero;
    private int edad;
    private float altura;
    private double peso;
    private double bmr;
    private double pesoIdeal;

    public Paciente(char genero, int edad, float altura, double pesoIdealKg, double bmr, double pesoIdeal2) {
        this.genero = genero;
        this.edad = edad;
        this.altura = altura;
        this.peso = pesoIdealKg;
        this.bmr = bmr;
        this.pesoIdeal = pesoIdeal2;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public float getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getBmr() {
        return bmr;
    }

    public double getPesoIdeal() {
        return pesoIdeal;
    }
}
