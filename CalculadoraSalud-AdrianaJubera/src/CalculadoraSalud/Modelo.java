package CalculadoraSalud;
public class Modelo {
    private static Modelo instancia;
    
    private Modelo() {
    }
    
    public static Modelo obtenerInstancia() {
        if (instancia == null) {
            instancia = new Modelo();
        }
        return instancia;
    }
    
    public static double calcularPesoIdeal(double height, char gender) throws Exception {
        if (gender == 'm') {
            return height - 100 - (height - 150) / 4.0;
        } else if (gender == 'w') {
            return height - 100 - (height - 150) / 2.5;
        } else {
            throw new Exception("Invalid gender. Please specify 'm' for male or 'w' for female.");
        }
    }

    public static double calcularTMB(double weight, double height, char gender, int age) throws Exception {
        if (gender == 'm') {
            return 10 * weight + 6.25 * height - 5 * age + 5;
        } else if (gender == 'w') {
            return 10 * weight + 6.25 * height - 5 * age - 161;
        } else {
            throw new Exception("Invalid gender. Please specify 'm' for male or 'w' for female.");
        }
    }
}
