package CalculadoraSalud;

public class CalculadoraAmericana implements CalculadoraSalud {
    @Override
    public double calcularBMR(char genero, int edad, double altura, double peso) throws Exception {
        double alturaMetros = altura * 0.3048;
        double pesoKg = peso / 2.20462;
        double alturaCm = alturaMetros * 100.0;
        double bmr = Modelo.obtenerInstancia().calcularTMB(pesoKg, alturaCm, genero, edad);
        System.out.println(Mensajes.getMensaje("bmrMessage", "ES")
            .formatted(altura, "pies", peso, "libras", bmr));
        System.out.println(Mensajes.getMensaje("bmrMessage", "EN")
            .formatted(altura, "feet", peso, "pounds", bmr));
        return bmr;
    }

    @Override
    public double calcularPesoIdeal(char genero, double altura) throws Exception {
        // altura en pies
        double alturaMetros = altura * 0.3048;
        double alturaCm = alturaMetros * 100.0;
        return Modelo.obtenerInstancia().calcularPesoIdeal(alturaCm, genero);
    }
}
