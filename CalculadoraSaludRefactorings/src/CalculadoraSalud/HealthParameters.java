package CalculadoraSalud;

public class HealthParameters {
    private double height;
    private double weight;
    private char gender;
    private int age;

    public HealthParameters(double height, double weight, char gender, int age) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
}
