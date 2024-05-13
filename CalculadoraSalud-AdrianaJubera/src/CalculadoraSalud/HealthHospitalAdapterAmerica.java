package CalculadoraSalud;

public class HealthHospitalAdapterAmerica implements HealthHospital {
    private Modelo modelo;

    public HealthHospitalAdapterAmerica() {
        this.modelo = Modelo.obtenerInstancia();
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        double alturaMetros = altura / 3.281f;
        double pesoKg = peso / 2.20462f;
        
        double bmr = modelo.calcularTMB(pesoKg, alturaMetros, genero, edad);
        mostrarMensajeBMR(genero, altura, peso, bmr);
        
        return bmr;
    }

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception {
        double alturaMetros = altura / 3.281f;
        
        int pesoIdealGramos = (int) Math.round(modelo.calcularPesoIdeal(alturaMetros, genero) * 1000);
        return pesoIdealGramos;
    }

    private void mostrarMensajeBMR(char genero, float altura, int peso, double bmr) {
        String mensaje = String.format("La persona con altura %.2f metros y %d libras tiene un BMR de %.2f.", altura, peso, bmr);
        System.out.println(mensaje);
    }
}
