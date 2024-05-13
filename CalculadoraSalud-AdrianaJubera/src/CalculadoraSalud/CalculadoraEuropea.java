package CalculadoraSalud;

public class CalculadoraEuropea implements CalculadoraSalud {
    @Override
    public double calcularBMR(char genero, int edad, double altura, double peso) throws Exception {
        double pesoKg = peso / 1000.0;
        double alturaCm = altura * 100.0;
        double bmr = Modelo.obtenerInstancia().calcularTMB(pesoKg, alturaCm, genero, edad);
        System.out.println(Mensajes.getMensaje("bmrMessage", "ES")
            .formatted(altura, "metros", pesoKg, "Kg", bmr));
        System.out.println(Mensajes.getMensaje("bmrMessage", "EN")
            .formatted(altura, "meters", pesoKg, "Kg", bmr));
        return bmr;
    }

    @Override
    public double calcularPesoIdeal(char genero, double altura) throws Exception {
        // altura en metros
        double alturaCm = altura * 100.0;
        return Modelo.obtenerInstancia().calcularPesoIdeal(alturaCm, genero);
    }
}
